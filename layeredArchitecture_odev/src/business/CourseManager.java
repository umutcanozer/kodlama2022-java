package business;

import java.util.List;

import dataAccess.CourseDao;
import entities.Course;
import logging.BaseLogger;

public class CourseManager {
	private CourseDao courseDao;
	private BaseLogger[] loggers;
	private List<Course> courses;

	public CourseManager(CourseDao courseDao, BaseLogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		courses = courseDao.fetchCourses();
	}

	public void add(Course course) throws Exception {
		if (course.getPrice() < 0) {
			throw new Exception("Price cannot be less than 0.");
		}
		if (course.getName().trim().isEmpty()) {
			throw new Exception("Course name can't be empty.");
		}
		if (course.getDescription().trim().isEmpty()) {
			throw new Exception("Course description can not be empty!");
		}
		if (courses.stream().anyMatch(c -> c.getName().equalsIgnoreCase(course.getName()))) {
			throw new Exception("Course name can't be same.");
		}

		courseDao.add(course);

		for (BaseLogger logger : loggers) {
			logger.log(course.getName());
		}
	}
}
