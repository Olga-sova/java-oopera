import  java.util.ArrayList;

public class Show {
    private String title;// название спектакля
    private double duration;//длительность
    protected ArrayList<Actor> listOfActors = new ArrayList<>();
    protected ArrayList<Director> listOfDirectors = new ArrayList<>();

    public double getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }
    public void addActor(Actor actor) {
        listOfActors.add(actor);
    }

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
            if (actor.getSurname().equals(surname)) {
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
            if (actor.getSurname().equals(surname)) {
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



