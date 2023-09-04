package telran.spring.students.docs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NonNull;
import telran.spring.students.dto.Mark;
import telran.spring.students.dto.Student;


@Document
@Data
public class StudentDoc {
	
	final long id;
	@NonNull
	String name;
	@NonNull
	String phone;
	List<Mark> marks = new ArrayList<Mark>();
	
	public static StudentDoc of(Student student) {
		
		return new StudentDoc(student.getId(), student.getName(), student.getPhone());
	}
	
	public Student build() {
		return new Student(id, name, phone);
		
	}
	
	

}
