package com.itLinkedHashMap;

import java.util.Random;
import java.util.TreeSet;

public class HashMap {

    public static void main(String[] args) {

        java.util.HashMap<String, String> persons = new java.util.HashMap<>();


        Person person = new Person("Ivan","Ivanovich",52,"President");


        String prev = "";
        prev=persons.put(person.Occupation,person.name);
        Person person1 = new Person("Ira","troetsky",53,"VP");
        prev=persons.put(person1.Occupation,person1.name);
        System.out.println(persons);
        System.out.println(prev);
        System.out.println(persons);

        TreeSet<Integer> treeSet = new TreeSet<>();
        Random rnd = new Random(1);

        treeSet.add(rnd.nextInt());
        treeSet.add(rnd.nextInt());
        treeSet.add(rnd.nextInt());
        treeSet.add(rnd.nextInt());
        treeSet.add(rnd.nextInt());
TreeSet<String> treeSetString = new TreeSet<>();


        treeSetString.add("d u t r ");
        treeSetString.add("e");
        treeSetString.add("c");
        treeSetString.add("d");
        treeSetString.add("a");


        System.out.println(treeSet);
        System.out.println(treeSetString);
    }

    public static class Person {
        private String name;
        private String Surname;
        private Integer age;
        private String Occupation;

        public  Person(String name, String surname, Integer age, String occupation) {
            this.name = name;
            Surname = surname;
            this.age = age;
            Occupation = occupation;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return Surname;
        }

        public void setSurname(String surname) {
            Surname = surname;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getOccupation() {
            return Occupation;
        }

        public void setOccupation(String occupation) {
            Occupation = occupation;
        }

        @Override
        public String toString() {
            return "com.helloWorld.HashMapHashMapHashMapHashMap.Person{" +
                    "name='" + name + '\'' +
                    ", Surname='" + Surname + '\'' +
                    ", age=" + age +
                    ", Occupation='" + Occupation + '\'' +
                    '}';
        }
    }
}
