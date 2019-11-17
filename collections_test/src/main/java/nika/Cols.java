package nika;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Cols {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        List<Person> persons = context.getBean("persons", ArrayList.class);

        persons.stream().forEach(p -> System.out.println(p));
    }
}
