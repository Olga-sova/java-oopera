
public class Director extends Person {
    protected int numberOfShows;

    public Director( String name, String surname, Person.Gender gender, int numbersOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numbersOfShows;
    }

    @Override
    public String toString() {
        return " " + getName() + " "+ getSurname() + ", количество постановок:" + numberOfShows;
    }
}
