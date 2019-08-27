package zadaniaKurs;

import org.hibernate.Session;
import sda.hibernate.HibernateUtil;
import sda.hibernate.entity.Uzytkownik;

public class ZadanieJeden {

    public static void newUserPersist(Uzytkownik newUser){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(newUser);
        session.flush();
        System.out.println(newUser.getId());
        session.close();
//        System.out.println("Dodany nowy uzytkownik: " + nowyUzytkownik.getId() + " " + nowyUzytkownik.getImie()+ " " +
//                nowyUzytkownik.getNazwisko());
    }

    public static void findUserById(long ID) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    Uzytkownik nowyUzytkownik = session.find(Uzytkownik.class,ID);
    session.close();
    System.out.println("Znaleziony uzytkownik to: " + nowyUzytkownik.getId() + " " +
            nowyUzytkownik.getImie() + " " + nowyUzytkownik.getNazwisko() + ".");

    }


    public static void updateUser (Uzytkownik uzytkownik) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        uzytkownik = (Uzytkownik) session.merge(uzytkownik);
        session.flush();
        session.close();
    }

    public static void deleteUser (long ID) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Uzytkownik uzytkownikUsuwany = new Uzytkownik();
        uzytkownikUsuwany.setId(ID);
        session.delete(uzytkownikUsuwany);
        session.flush();
        session.close();
    }


}



//    Zadania dla metod find(), persist(), merge(), delet()
//        Zadanie 1
//        Stworzyć prostego CRUDa (w klasie UzytkonikDAO) dla tabeli uzytkownicy używając hibernetowych metod:
//        find(), persist(), merge(), delet() obiektu Session.
//
//        Nasza klasa UzytkownikDAO powinna zawierać 4 metody:
//        • insert -dodająca użytkownika przekazanego do metody
//        • select -znajdująca użytkownika na zadanym id
//        • update -aktualizująca użytkownika w bazie danych przekazanego do metody
//        • delete -usuwająca przekazanego do metody użytkownika

//        Zadanie 2
//        Należy stworzyć w metodzie main() następujące operacje:
//        • Stworzyć listę 5 nowych użytkowników.
//        • Zapisać nowych użytkowników do bazy danych.
//        • Zmodyfikować nazwisko wszystkim użytkownikom, tak aby w kolumnie nazwisko był ciąg znaków ”imię”+” ”+”nazwisko”
//        • Usunąć pierwszego i ostatniego użytkownika z listy.
//        Do wszystkich operacji zastosować klasę z poprzedniego zadania.
