import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
        Student st = new Student(new Osoba("Kuba","Wojewódzki", 98421), WydzialEnum.Bankowość);
        Student st1 = new Student(new Osoba("Fryderyk","Chopin", 98706), WydzialEnum.Programowanie);
        Student st2 = new Student(new Osoba("Iza","Zmatiza", 97324), WydzialEnum.Bankowość);
        Student st3 = new Student(new Osoba("Jan","Kowalski", 98947), WydzialEnum.Spedycja);
        Student st4 = new Student(new Osoba("Wiktor","Brzozowski", 98213), WydzialEnum.Programowanie);

        ArrayList<Student> students = new <Student>ArrayList();
        students.add(st);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        for(Student st5 : students){
            System.out.println(st5.toString());
    }
}
