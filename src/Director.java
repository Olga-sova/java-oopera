
public class Director extends Person {
    int numberOfShows;

    public Director( String name, String surname, Person.gender gender, int numbersOfShows) {
        this.name =name;
        this.surname = surname;
        this.Gender = gender;
        this.numberOfShows = numbersOfShows;
    }

    @Override
    public String toString() {
        return " " + name + " "+ surname + ", количество постановок:" + numberOfShows;
    }
}
