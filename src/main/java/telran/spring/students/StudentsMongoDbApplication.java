package telran.spring.students;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"telran"})
public class StudentsMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsMongoDbApplication.class, args);
	}

}
