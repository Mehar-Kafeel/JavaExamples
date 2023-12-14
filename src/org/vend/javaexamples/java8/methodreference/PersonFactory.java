package org.vend.javaexamples.java8.methodreference;

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
