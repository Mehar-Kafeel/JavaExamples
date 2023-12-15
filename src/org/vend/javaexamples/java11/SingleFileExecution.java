package org.vend.javaexamples.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

//Now we can use var variables in lambda expression after Java11
//var was introduced in Java10 with limitations
public class SingleFileExecution {

    public static void main(String[] args) throws IOException {
        localVariableForLambdaExpression();
        newStringMethods();
        newMethodsInFiles();
        stringPatternRecognition();
        timeUnitFunctions();
    }
    public static void localVariableForLambdaExpression() {
        IntStream.of(1,2,3,4,5,6,7,8,9).filter((var x) -> x%2==0).forEach((var num) -> {
            var str = "Hello!";
            System.out.println(num + " is even!");
        });
    }

    public static void newStringMethods() {
        String message = " ";

        //isBlank() returns true even if a string contains only white spaces
        //isEmpty() only returns true if a string contains any character
        if(message.isBlank()) {
            System.out.println("Message is blank");
        }
        
        if(message.isEmpty()) {
            System.out.println("Message is empty");
        }

        String strWithLines = "Hello how are you?\nI am fine.\nThanks!";
        strWithLines.lines().forEach(System.out::println);

        Optional<String> findFirst = strWithLines.lines().filter(s -> s.endsWith(".")).findFirst();

        //can be done like this:
        //findFirst.ifPresent(s -> System.out.println("String is present: " + s));
        if(findFirst.isPresent()) {
            System.out.println("String is present: " + findFirst.get());
        }

        //strip(), stripLeading(), stripTrailing() and repeat()
        String testString = "    Java is a great programming language.   ";
        System.out.println("String: " +testString);

        //removing all leading and trailing white spaces with strip()
        System.out.println("Stripped string: " +testString.strip());
        System.out.println("Stripped trailing string: " +testString.stripTrailing());
        System.out.println("Stripped leading string: " +testString.stripLeading());
        System.out.println("Repeated string: " +testString.repeat(5));
    }

    public static void newMethodsInFiles() throws IOException {
        //reading from existing file
        String readString = Files.readString(Path.of("sample.txt"));

        //writing to a file
        Files.writeString(Path.of("Sample_out.txt"), readString.repeat(5));
    }

    public static void stringPatternRecognition() {
        var languages = Arrays.asList("JavaScript", "Python", "Java", "C++");

        Predicate<String> asMatchPredicate = Pattern.compile("java", Pattern.CASE_INSENSITIVE).asMatchPredicate();

        languages.stream().forEach(lang -> {
            if(asMatchPredicate.test(lang))
                System.out.println("Matched " + lang);
            else
                System.out.println("Not matched " + lang);
        });
    }

    public static void timeUnitFunctions() {
        TimeUnit timeUnit = TimeUnit.DAYS;
        //converting hours to days
        System.out.println("Days: " +timeUnit.convert(Duration.ofHours(48))); //2 days
        System.out.println("Days: " + timeUnit.convert(Duration.ofHours(96))); //4 days
    }

}
