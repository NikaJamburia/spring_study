package nika.rest_app_tutorial;

public class Person {

    enum gender{
        MALE,
        FEMALE
    }
    private int id;
    private String firstName;
    private String lastName;
    private gender gender;
    private int age;

    public Person(int id, String firstName, String lastName, Person.gender gender, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public Person.gender getGender() {
        return gender;
    }

    public void setGender(Person.gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
