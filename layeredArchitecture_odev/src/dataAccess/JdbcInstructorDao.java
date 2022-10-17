package dataAccess;

import java.util.ArrayList;
import java.util.List;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor " + instructor.getName() + " added to database using JDBC");
	}

	@Override
	public List<Instructor> fetchInstructors() {
		ArrayList<Instructor> instructors = new ArrayList<Instructor>();
		instructors.add(new Instructor(1, "Umutcan Özer", "umutcan-profile-image"));
		return instructors;
	}
}
