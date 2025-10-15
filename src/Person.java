public class Person {
    private final String name;
    private final  String surname;
    Gender gender;

    public enum Gender {
        MALE,
        FEMALE
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


}
