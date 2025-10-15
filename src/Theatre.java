
import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        ArrayList<Actor> listOfActors = new ArrayList<>();

        listOfActors.add(new Actor("Борис", "Оношко", Person.gender.MALE, 1.85));
        listOfActors.add(new Actor("Алексей", "Пьянков", Person.gender.MALE, 1.75));
        listOfActors.add(new Actor("Кристина", "Семенова", Person.gender.FEMALE, 1.70));
        listOfActors.add(new Actor("Виктория", "Дедюлькина", Person.gender.FEMALE, 1.80));
        listOfActors.add(new Actor("Александр", "Олешко", Person.gender.MALE, 1.80));

        ArrayList<Director> listOfDirectors = new ArrayList<>();

        listOfDirectors.add(new Director("Надежда", "Калинина", Person.gender.FEMALE, 30));
        listOfDirectors.add(new Director("Лука", "Джиберти", Person.gender.MALE, 15));
        listOfDirectors.add(new Director("Валерия", "Беседина", Person.gender.FEMALE, 2));

        MusicalShow musicalShow = new MusicalShow("Кот в сапогах", 1.30, "Валерия Беседина", "Сказка_Шарля_Перро");
        Actor musicalShowActor = listOfActors.get(4);
        musicalShow.addActor(musicalShowActor);

        Director musicalShowDirector = listOfDirectors.get(2);
        musicalShow.addDirector(musicalShowDirector);

        Ballet ballet = new Ballet("Мата Хари", 2.30, "Массне_Пьяцолла_Рахманинов",
                "Любовь_и_шпионаж", "Надежда Калинина");
        Director balletDirector = listOfDirectors.getFirst();
        ballet.addDirector(balletDirector);

        Actor balletActor = listOfActors.get(3);
        ballet.addActor(balletActor);

        String choreographer = "Надежда Калинина";

        Opera opera = new Opera("Травиата", 3.30, "Верди", "Дама_с_камелиями", 35);
        Director operaDirector = listOfDirectors.get(1);
        opera.addDirector(operaDirector);

        for (int i = 0; i < listOfActors.size(); i++) {
            if (i == 0 || i == 1 || i == 2) {
                opera.addActor(listOfActors.get(i));
            }
        }
        Actor newActor = new Actor("Екатерина", "Пыжова", Person.gender.FEMALE, 1.80);
        opera.setActor(newActor, "Семенова");


        System.out.println(musicalShow);
        System.out.println(ballet);
        System.out.println(opera);
    }
}
