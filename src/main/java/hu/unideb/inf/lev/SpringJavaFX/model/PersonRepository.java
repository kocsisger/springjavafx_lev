package hu.unideb.inf.lev.SpringJavaFX.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    public List<Person> findByName(String name);
}
