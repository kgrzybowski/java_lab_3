import java.util.ArrayList;
import java.util.List;

public class Main {


        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */
        public static void main (String[]args){
            name car = new name("Mercedes Benz", "1880");
            System.out.println(car.toString());
            Car car2 = new Car("BMW", "1916", 98.9);
            System.out.println(car.toString());

            List<name> Cars = new ArrayList<>();
            Cars.add(car);
            Cars.add(car2);
            System.out.println(Cars);
            Object car3 = new name("Fiat", "1899");
            System.out.println("\n" + car3.toString());
            Object car4 = new name("Opel", "1862");
            System.out.println("\n" + car4.toString());
        }
    }
