package br.com.pyetro;

import java.util.List;
import java.util.Objects;

public class Person {
    private String id;
    private String name;
    private String gender;
    private int age;
    private String country;

    public Person(){

    }

    public Person(String id, String name, String gender, int age, String country){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.country = country;


    }
    public Person (Person person){
        this(person.getId(),person.getName(), person.getGender(),person.getAge(),person.getCountry());
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(){
        this.country = country;
    }

    public List<Person> historicalPerson(){
        Person person1 = new Person("p1","Napoleão Bonaparte", "Masculino",34,"França");
        Person person2 = new Person("p2","Cleopatra", "Feminino",25,"Egito");
        Person person3 = new Person("p3","Catarina de Siena", "Feminino",34,"Italia");
        Person person4 = new Person("p4","Luís XV", "Masculino",34,"França");
        Person person5 = new Person("p5","Princesa Isabel", "Feminino",29,"Portugal");
        Person person6 = new Person("p6","Irmã Dulce", "Feminino",34,"Brasil");
        Person person7 = new Person("p7","Chesterton", "Masculino",34,"Inglaterra");
        return List.of(person1,person2,person3,person4,person5,person6,person7);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return id.equals(person.id) && name.equals(person.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
