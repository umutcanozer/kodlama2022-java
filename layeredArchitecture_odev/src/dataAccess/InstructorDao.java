package dataAccess;

import java.util.List;

import entities.Instructor;

public interface InstructorDao {
	void add(Instructor instructor);

	List<Instructor> fetchInstructors();
}
