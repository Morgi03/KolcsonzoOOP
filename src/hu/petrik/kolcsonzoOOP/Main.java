package hu.petrik.kolcsonzoOOP;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Kolcsonozheto> katalogus = new ArrayList<>();

    public static void main(String[] args) {
    Konyv konyv1 = new Konyv(" A Gyűrűk Ura","J. R. R. Tolkien","AABBCC-121314");
    Dvd dvd1 = new Dvd("Star Wars V. rész - A Birodalom visszavág", 124);
        Dvd dvd2 = new Dvd("Star Wars VI. rész - A jedi visszatér", 131);
        Dvd dvd3 = new Dvd("Star Wars IV. rész - Az új remény", 121);
        Ujsag ujsag1 = new Ujsag("Képes sport",2007,23);

        // Interface
        Kolcsonozheto kolcsonozheto = new Kolcsonozheto() {
            @Override
            public String megjelenitendoNev() {
                return null;
            }

            @Override
            public int meddigKolcsonozheto() {
                return 0;
            }
        };
        System.out.println(konyv1.getIsbn());
        System.out.println(konyv1.megjelenitendoNev());
        katalogus.add(konyv1);
        katalogus.add(dvd1);
        katalogus.add(dvd2);
        katalogus.add(dvd3);
        katalogus.add(ujsag1);

        for (Kolcsonozheto value : katalogus) {
            System.out.println(value.megjelenitendoNev() + " " + value.meddigKolcsonozheto());
        }

    }
}
