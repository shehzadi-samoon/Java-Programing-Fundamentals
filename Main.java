import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
class Person {
    String name;
    int age;

    Person(String name, int age ){
        this.name = name;
        this.age = age;
    }

    public int hashCode() {
        return name.hashCode() + age;
    }

    public boolean equals(Object obj) {
        
        Person other = (Person) obj;
        return hashCode() == other.hashCode();
    }
    
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Bob", 25);
        Person p2 = new Person("Bob", 25);

        System.out.println(p1.equals(p2));
        System.out.println(p2.hashCode());


        
    }
}