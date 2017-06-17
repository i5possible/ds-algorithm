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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getName() != null ? !getName().equals(person.getName()) : person.getName() != null) return false;
        if (getAge() != null ? !getAge().equals(person.getAge()) : person.getAge() != null) return false;
        return getCar() != null ? getCar().equals(person.getCar()) : person.getCar() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getAge() != null ? getAge().hashCode() : 0);
        result = 31 * result + (getCar() != null ? getCar().hashCode() : 0);
        return result;
    }
}
