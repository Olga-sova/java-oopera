import java.util.Objects;

public class Actor extends Person {
    double height;

    public Actor(String name, String surname, Person.gender gender, double height) {
        this.name = name;
        this.surname = surname;
        this.Gender = gender;
        this.height = height;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor)) return false;
        Actor actor = (Actor) o;
        return Double.compare(actor.height, height) == 0 &&
                Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname) &&
                Gender == actor.Gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, Gender, height);
    }

    @Override
    public String toString() {
        return " " + name + " " + surname;
    }
}
