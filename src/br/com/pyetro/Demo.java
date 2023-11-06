package br.com.pyetro;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Person> list = new Person().historicalPerson();

        list.stream().forEach(person -> System.out.println(person.toString()));

        System.out.println("***** apenas fem *****");

        list.stream()
                .filter(person -> person.getGender().equals("Feminino"))
                .forEach(p -> System.out.println(p.getName()));

    }
}
