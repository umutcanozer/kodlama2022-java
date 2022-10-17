package dataAccess;

import java.util.ArrayList;
import java.util.List;

import entities.Course;

public class JdbcCourseDao implements CourseDao {
	@Override
	public void add(Course course) {
		System.out.println("Course " + course.getName() + " added to database using JDBC");
	}

	@Override
	public List<Course> fetchCourses() {
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(
				new Course(1, "Java Programming 2022", 1000, "This course will teach you Java programming language."));
		return courses;
	}
}
