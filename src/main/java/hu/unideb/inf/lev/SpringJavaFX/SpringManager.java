package hu.unideb.inf.lev.SpringJavaFX;

import hu.unideb.inf.lev.SpringJavaFX.frontend.Manager;
import hu.unideb.inf.lev.SpringJavaFX.model.Person;
import hu.unideb.inf.lev.SpringJavaFX.model.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringManager implements Manager {
    ConfigurableApplicationContext ctx;
    @Override
    public void start() {
        ctx = SpringApplication.run(SpringJavaFxApplication.class);
    }

    @Override
    public void stop() {
        ctx.close();
    }

    @Override
    public Person load() {
        PersonRepository personRepo = (PersonRepository) ctx.getBean(PersonRepository.class);
        return personRepo.findByName("Ödön").get(0);
    }
}
