public class Osoba {
    private String Imię, Nazwisko;
    private Integer indeks;

    public Osoba(String imię, String nazwisko, Integer indeks){

        Imię = imię;
        Nazwisko = nazwisko;
        this.indeks = indeks;
    }
    public String getImię(){
        return Imię;
    }

    public void setImię(String imię){
        Imię = imię;
    }

    public String getNazwisko(){
        return Imię;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public Integer getIndeks() {
        return indeks;
    }

    public void setIndeks(Integer indeks) {
        this.indeks = indeks;
    }

    @Override
    public String toString(){
        return
                "Imię: " +Imię+ '\'' +
                        ", Nazwisko: " +Nazwisko+'\''+
                        ", Indeks: " +indeks+
                        '}';
    }
}