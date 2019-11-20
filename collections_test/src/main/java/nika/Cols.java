package nika;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

import java.rmi.MarshalledObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cols {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        List<Person> persons = context.getBean("persons", ArrayList.class);
        persons.stream().forEach(p -> System.out.println(p));

        System.out.println("\n/////////// COMPUTER //////////\n");
        Computer comp = context.getBean("comp1", Computer.class);
        System.out.println(comp);
        System.out.println(comp.getUser().getName() + "'s" + " accounts: " + comp.getUser().getAccounts());

        HashMap<String, String> ragacaMap = context.getBean("personRoles", HashMap.class);

        System.out.println("\nPerson Roles:\n" + ragacaMap);



    }


}
