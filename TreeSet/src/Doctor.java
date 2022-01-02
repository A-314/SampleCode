package src;

public class Doctor implements Comparable<Doctor>{

    String name;

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Doctor o) {
        return name.compareTo(o.getName());
    }

    @Override
    public String toString(){
        return name;
    }
}
