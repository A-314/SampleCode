package src;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String args[])throws IOException {
        Comparator<Person> pcomp = new PersonNameComparator().thenComparing(new PersonAgeComparator()).thenComparing(new PersonSurnameComparator());
        TreeSet<Person> people = new TreeSet(pcomp);
        people.add(new Person("Tom","Smith", 40));
        people.add(new Person("Tom","Zmith", 10));
        people.add(new Person("Nick","Smith",34));
        people.add(new Person("Tom","Fmith",10));
        people.add(new Person("Bill","Bmith",14));

        for(Person  p : people){
            System.out.println(p.getName() +" "+ p.getSurname()+ " " + p.getAge());
        }

    }
}

