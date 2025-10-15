public class MusicalShow extends Show {
    protected String musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, double duration, String musicAuthor, String librettoText) {
        setTitle(title);
        setDuration(duration);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }


    @Override
    public String toString () {
        return "Спектакль " + getTitle() + ".\n" +" Краткое описание либретто: " + librettoText +
                ". Автор музыки: " + musicAuthor +
                ". Длительность: " + getDuration() + " ч." +
                " Режиссёр: " + listOfDirectors +
                ". Актеры: " + listOfActors +".";
    }
}