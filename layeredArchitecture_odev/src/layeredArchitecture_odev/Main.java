package layeredArchitecture_odev;

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;
import logging.BaseLogger;
import logging.ConsoleLogger;
import logging.DatabaseLogger;
import logging.FileLogger;
import logging.MailLogger;

public class Main {

	public static void main(String[] args) {
		BaseLogger[] loggers = { new DatabaseLogger(), new ConsoleLogger(), new FileLogger(), new MailLogger() };

		Course course = new Course(13215, "Java Programming Language 2022", -10,
				"This course will teach you Java programming language.");
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		try {
			courseManager.add(course);
		} catch (Exception exception) {
			System.out.println(exception);
		}
		System.out.println("-----------------------------");

		Category category = new Category(14124, "Senior");
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		try {
			categoryManager.add(category);
		} catch (Exception exception) {
			System.out.println(exception);
		}
		System.out.println("-----------------------------");

		Instructor instructor = new Instructor(41411, "Engin Demiroğ", "umutcan-profile-image");
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		try {
			instructorManager.add(instructor);
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}

}
