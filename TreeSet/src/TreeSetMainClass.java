package src;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetMainClass {

    public static void main(String args[]){
        Comparator<Person> pcomp = new PersonNameComparator().thenComparing(new PersonAgeComparator()).thenComparing(new PersonSurnameComparator());

        TreeSet<Person> people = new TreeSet(pcomp);
        people.add(new Person("Tom","Smith", 40));
        people.add(new Person("Tom","Zmith", 10));
        people.add(new Person("Nick","Smith",34));
        people.add(new Person("Tom","Fmith",10));
        people.add(new Person("Bill","Bmith",14));
        Comparator comparator = people.comparator();
        for(Person  p : people){
            System.out.println(p.getName() +" "+ p.getSurname()+ " " + p.getAge());
        }

        TreeSet<Doctor> treeSet = new TreeSet<>();
        treeSet.add(new Doctor("Andrew"));
        System.out.println(treeSet);
    }
}

