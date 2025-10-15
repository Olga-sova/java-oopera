public class MusicalShow extends Show {
    String musicAuthor;
    String librettoText;

    public MusicalShow(String title, double duration, String musicAuthor, String librettoText) {
        this.title = title;
        this.duration = duration;
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }


    @Override
    public String toString () {
        return "Спектакль " + title + ".\n" +" Краткое описание либретто: " + librettoText +
                ". Режиссёр: " + listOfDirectors +
                ". Актеры: " + listOfActors +".";
    }
}