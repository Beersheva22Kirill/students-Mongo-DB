package telran.spring.students.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import telran.spring.students.dto.Mark;
import telran.spring.students.dto.Student;
import telran.spring.students.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepo;
	
	
	@Override
	@Transactional(readOnly = false)
	public Student addStudent(Student student) {
		
		return null;
	}

	@Override
	public void addMark(long studentId, Mark mark) {
		// TODO Auto-generated method stub

	}

}
