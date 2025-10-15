import  java.util.ArrayList;

public class Show {
    String title;// название спектакля
    double duration;//длительность
    ArrayList<Actor> listOfActors = new ArrayList<>();
    public void addActor(Actor actor) {
        listOfActors.add(actor);
    }

    ArrayList<Director> listOfDirectors = new ArrayList<>();

    public void addDirector(Director director) {
        listOfDirectors.add(director);
    }


    @Override
    public String toString () {
        return "Спектакль" + title +
                ". Актеры: " + listOfActors;
    }

    public void replaceActor(Actor newActor, String surname) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.surname.equals(surname)) {
                listOfActors.set(i, newActor);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Актёр с фамилией " + surname + " не найден.");
        }
    }

    public void setActor(Actor newActor,String surname) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.surname.equals(surname)) {
                listOfActors.set(i, newActor);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Актёр с фамилией " + surname + " не найден.");
        }

    }
}



