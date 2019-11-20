package nika;

import java.util.Map;

public class Computer {
    private Person user;
    private int id;
    private String proccessor;


    public Computer(Person user) {
        this.user = user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProccessor(String proccessor) {
        this.proccessor = proccessor;
    }



    public Person getUser() {
        return user;
    }

    public String toString(){
        return String.format("Computer ID: %s \n    Processor: %s\n    User: %s", id, proccessor, user.getName());
    }
}
