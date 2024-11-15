package hu.unideb.inf.lev.SpringJavaFX;

import hu.unideb.inf.lev.SpringJavaFX.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringJavaFxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJavaFxApplication.class, args);

		//Person p = new Person(12, "Ödön", LocalDate.of(1999,11,15));

		Person p = Person.builder()
						.name("Ödön")
				 		.dateOfBirth(LocalDate.of(1999,11,15))
				  .build();

		System.out.println(p);
	}

}
