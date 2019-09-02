package _02_data_classes;

public class MainJava {
    public static void main(String[] args) {
        final PersonJava person = new PersonJava("Juan", 23);
        final int age = person.getAge();
        System.out.println("La edad de " + person.getName() + " es " + age);

        final PersonJava person2 = new PersonJava("Juan", 23);
        if (person.equals(person2)) {
            System.out.println("Las personas son iguales");
        } else {
            System.out.println("Las personas son diferentes");
        }

        System.out.println(person);
    }
}
