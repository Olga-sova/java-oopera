

public class Ballet extends MusicalShow {
    protected String choreographer;

    public Ballet(String title, double duration, String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, musicAuthor, librettoText);
        setTitle(title);
        setDuration(duration);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
        this.choreographer = choreographer;
    }

    @Override
    public String toString() {
        return super.toString() + " Балетмейстер: " + choreographer + ".";
    }
}

