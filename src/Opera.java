

public class Opera extends MusicalShow {
    int choirSize;
    public Opera(String title,double duration, String musicAuthor,String librettoText,int choirSize) {
        super(title, duration, musicAuthor, librettoText);
        this.title =title;
        this.duration =duration;
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return super.toString() + " Состав хора: " + choirSize +" артистов.";
    }
}

