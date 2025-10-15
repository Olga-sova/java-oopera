

public class Ballet extends MusicalShow {
    String choreographer;

    public Ballet(String title, double duration, String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, musicAuthor, librettoText);
        this.title =title;
        this.duration = duration;
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
        this.choreographer = choreographer;
    }

    @Override
    public String toString() {
        return super.toString() + " Балетмейстер: " + choreographer + ".";
    }
}

