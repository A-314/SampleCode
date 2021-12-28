package src;

class Person{

    private String name;
    private String surname;
    private int age;

    public Person(String n,String s, int a){
        surname=s;
        name=n;
        age=a;
    }

    String getName(){return name;}
    String getSurname(){return  surname;}
    int getAge(){return age;}
}