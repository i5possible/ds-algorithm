package sorting.domain;

/**
 * Created by lianghong on 12/06/2017.
 */
public class Person implements Comparable<Person>{
    private String name;
    private Integer age;
    private Car car;

    public Person(String name, Integer age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.getName());
    }

    public int ageCompareTo(Person person) {
        return age.compareTo(person.getAge());
    }

    public int carCompareTo(Person person) {
        return car.compareTo(person.getCar());
    }
}
