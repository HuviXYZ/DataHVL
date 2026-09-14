package no.hvl.test;
import java.time.LocalDate;



public class Kalender {


    public static String maanedsnavn(int nr) {
        String navn = "udefinert";

        switch(nr) {
            case 1:
                navn = "Januar";
                break;
            case 2:
                navn = "februar";
                break;
        }

        return navn;
    }

}
