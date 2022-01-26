public class Student {
    String Imię;
    String Nazwisko;
    int wiek;
    boolean czyjestszczepiony;

    public void displayInfo() {
        System.out.println("Imie:\tNazwisko:\twiek:\tCzy jest szczepiony \n" + Imię + "\t" + Nazwisko + "\t" + "\t" + wiek + "\t" + "\t" + czyjestszczepiony);
    }
}
