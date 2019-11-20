package nika;

import java.util.Map;

public class Person {
    private int age;
    private String name;
    private Map<String, Float> accounts;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAccounts(Map<String, Float> accounts) {
        this.accounts = accounts;
    }

    public Map<String, Float> getAccounts() {
        return accounts;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
