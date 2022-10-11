package hu.petrik.kolcsonzoOOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static List<Kolcsonozheto> katalogus = new ArrayList<>();
    static List<Dvd> dvdk = new ArrayList<>();

    public static void main(String[] args) {
        Konyv konyv1 = new Konyv(" A Gyűrűk Ura", "J. R. R. Tolkien", "AABBCC-121314");
        Dvd dvd1 = new Dvd("Star Wars V. rész - A Birodalom visszavág", 124);
        Dvd dvd2 = new Dvd("Star Wars VI. rész - A jedi visszatér", 131);
        Dvd dvd3 = new Dvd("Star Wars IV. rész - Egy új remény", 121);
        Dvd dvd4 = new Dvd("A Gyűrűk Ura - A gyűrű szövetsége", 201);
        Dvd dvd5 = new Dvd("A Gyűrűk Ura - A király tornya", 164);
        Dvd dvd6 = new Dvd("Batman under red hood", 121);
        Ujsag ujsag1 = new Ujsag("Képes sport", 2007, 23);

        // Interface létrehozása lehetséges
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
        katalogus.add(dvd4);
        katalogus.add(dvd5);
        katalogus.add(dvd6);
        katalogus.add(ujsag1);
        dvdk.add(dvd1);
        dvdk.add(dvd2);
        dvdk.add(dvd3);
        dvdk.add(dvd4);
        dvdk.add(dvd5);
        dvdk.add(dvd6);

        for (Kolcsonozheto value : katalogus) {
            System.out.println(value.megjelenitendoNev() + " " + value.meddigKolcsonozheto());
        }

        System.out.println("A DVD-k rendezés előtt");
        for (Dvd d: dvdk) {
            System.out.println(d.megjelenitendoNev()+" "+d.getHossz());
        }
        System.out.println();
        Collections.sort(dvdk);
        System.out.println("A DVD-k rendezés után");
        for (Dvd d: dvdk) {
            System.out.println(d.megjelenitendoNev()+" "+d.getHossz());
        }
        System.out.println();
    }
}
