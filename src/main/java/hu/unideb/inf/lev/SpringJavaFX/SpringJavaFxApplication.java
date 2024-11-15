package hu.unideb.inf.lev.SpringJavaFX;

import hu.unideb.inf.lev.SpringJavaFX.model.Person;
import hu.unideb.inf.lev.SpringJavaFX.model.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringJavaFxApplication implements CommandLineRunner {

	PersonRepository pdr;

	public static void main(String[] args) {
		SpringApplication.run(SpringJavaFxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Person p = Person.builder()
				.name("Ödön")
				.dateOfBirth(LocalDate.of(1999,11,15))
				.build();

		System.out.println(p);
		pdr.save(p);
	}
}
