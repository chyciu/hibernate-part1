package zadaniaKurs;

import sda.hibernate.entity.Uzytkownik;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

       List <Uzytkownik>newUsers = new ArrayList ();

       newUsers.add(new Uzytkownik("Hans", "Klos"));
       newUsers.add(new Uzytkownik("Janek", "Nowak"));
       newUsers.add(new Uzytkownik("Monika", "Kowalska"));
       newUsers.add(new Uzytkownik("Beata", "Jankowska"));
       newUsers.add(new Uzytkownik("Tomasz", "Lewandowski"));

       for (Uzytkownik uzytkownik : newUsers) {
           ZadanieJeden.newUserPersist(uzytkownik);
       }

       ZadanieJeden.findUserById(50);
    }
}
