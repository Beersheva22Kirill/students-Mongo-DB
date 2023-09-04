package telran.spring.students.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Student {
	
	@NotNull
	long id;
	@NotNull
	String name;
	@NotNull
	String phone;
	
	public Student(long id, String name, String phone) {
		
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	

	
	

	
	

}
