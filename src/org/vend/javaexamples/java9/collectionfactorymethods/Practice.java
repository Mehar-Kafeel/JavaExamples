package org.vend.javaexamples.java9.collectionfactorymethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mehar");
        names.add("Kafeel");

        Collection<String> names2 = Collections.unmodifiableCollection(names);
        names.add("Tazeen");
        //names2.add("Tazeen"); //throw exception
        System.out.println("Names: " + names);
        System.out.println("Names2: " + names2);

        //can be done using Java9 List.of
        List<String> lastNames = List.of("Kafeel", "Mehar", "Laiba");
       // lastNames.add("Rayyan");

        lastNames.forEach(System.out::println);
    }
}
