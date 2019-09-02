package _02_data_classes;

public class PersonJava {
    private String name;
    private int age;

    public PersonJava(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        // self check
        if (this == o)
            return true;
        // null check
        if (o == null)
            return false;
        // type check and cast
        if (getClass() != o.getClass())
            return false;
        PersonJava person = (PersonJava) o;
        // field comparison
        return this.name.equals(person.getName())
                && this.age == person.getAge();
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }


}
