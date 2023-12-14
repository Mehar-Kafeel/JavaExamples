package org.vend.javaexamples.java8.methodreference;

public class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        PersonFactory<Person> personFactory = Person::new;
        Person person;
        person = personFactory.create("Mehar", "Kafeel");
        System.out.println(person.firstName + " " + person.lastName);
    }
}

