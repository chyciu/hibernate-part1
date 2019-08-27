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

        System.out.println("Teraz program dodaje nowych uzykowników do listy.");

       for (Uzytkownik uzytkownik : newUsers) {
           ZadanieJeden.newUserPersist(uzytkownik);
       }

        System.out.println("\nTeraz program znajduje użytkownika po podanm ID.");

       ZadanieJeden.findUserById(50);

        System.out.println("\nTeraz program uaktualnia dane na liście / zamienia / .");

       for (Uzytkownik uaktuanionyUzytkownik : newUsers) {
           uaktuanionyUzytkownik.setNazwisko(uaktuanionyUzytkownik.getImie() + " " + uaktuanionyUzytkownik.getNazwisko());
           ZadanieJeden.updateUser(uaktuanionyUzytkownik);
       }

        System.out.println("\nTeraz program usuwa uzytkownika po podanym ID.");
       ZadanieJeden.deleteUser(56);
       ZadanieJeden.deleteUser(57);


    }
}
