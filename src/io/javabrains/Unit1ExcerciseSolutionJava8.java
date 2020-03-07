package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcerciseSolutionJava8 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );
        //Step 1; Sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2: Create a method that prints all elements in the list;
                                                                                                            System.out.println("--------------------------------------------------------------------------");
        System.out.println("Printing all persons");
        //printAll(people);
        printConditionally(people, p -> true);

        // Step 3: Create a method that prints all people that have last name beginning with C
                                                                                                             System.out.println("--------------------------------------------------------------------------");
        System.out.println("Printing all persons with last name beginning with C");
        printConditionally(people, p ->  p.getLastName().startsWith("C"));

                                                                                                             System.out.println("--------------------------------------------------------------------------");
        System.out.println("Printing all persons with first name beginning with C");
        printConditionally(people, p ->  p.getFirstName().startsWith("C"));
    }

    private static void printConditionally (List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }

//    private static void printLastNameBeginningWithC (List <Person> people) {
//        for (Person p : people) {
//            if (p.getLastName().startsWith("C")) {
//                System.out.println(p);
//            }
//        }
//    }

//    private static void printAll (List <Person> people) {
//        for (Person p : people) {
//            System.out.println(p);
//        }
//    }
}

//Java 8 Lambda Basics 15 - Using Function Interfaces
//last finished Lambda 14 session, need to start session 15