import java.util.Objects;

public class Actor extends Person {
    protected double height;

    public Actor(String name, String surname, Person.Gender gender, double height) {
        super(name, surname);
        this.gender = gender;
        this.height = height;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor actor)) return false; // использование паттерн-переменной
        return Double.compare(actor.height, height) == 0 &&
                Objects.equals(getName(), actor.getName()) &&
                Objects.equals(getSurname(), actor.getSurname()) &&
                gender == actor.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),getSurname(), gender, height);
    }

    @Override
    public String toString() {
        return " " + getName() + " " + getSurname();
    }
}
