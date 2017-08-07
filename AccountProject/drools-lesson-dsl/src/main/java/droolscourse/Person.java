package droolscourse;

/**
 * Created by cary on 8/7/17.
 */
public class Person {
    private int age;
    private String name;
    private String location;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return String.format("%s,%d,%s",getName(),getAge(),getLocation());
    }
}