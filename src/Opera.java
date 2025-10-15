

public class Opera extends MusicalShow {
    protected int choirSize;
    public Opera(String title,double duration, String musicAuthor,String librettoText,int choirSize) {
        super(title, duration, musicAuthor, librettoText);
        setTitle(title);
        setDuration(duration);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return super.toString() + " Состав хора: " + choirSize +" артистов.";
    }
}

