package telran.spring.students.service;

import telran.spring.students.dto.*;

public interface StudentService {
	
	Student addStudent(Student student);
	void addMark(long studentId,Mark mark);

}
