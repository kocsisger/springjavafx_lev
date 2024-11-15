package hu.unideb.inf.lev.SpringJavaFX.frontend;

import hu.unideb.inf.lev.SpringJavaFX.model.Person;

public interface Manager {
    public void start();
    public void stop();
    public Person load();
}
