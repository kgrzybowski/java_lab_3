/* klasa Punkt */
public class Punkt {
    /* stworzyć zmienne prywatne pX, pY, pZ */

    /* stworzyć
        a) pusty konstruktor,
        b) konstruktor inicjalizujacy zmienną pX,
        c) konstruktor inicjalizujący wszystkie zmienne,
        d) stworzyć settery i gettery,
        e) getter do zmiennej pZ niech zwraca return pZ * 10;

        podpowiedz ALT + INSERT można wybrać generowanie automatyczne
        konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...
    */

    /* Stworzyć metody
        a) suma - sumująca wszystkie wartości w klasie
        b) różnica - metody przeciążone roznica(){} i roznica(int x, int y, int z){}
        c) metody różnica mają wykonwywać dzialania :
            roznica(){ return pX - pY - pZ} i roznica(int x, int y, int z){ return pX*x - pY*y - pZ*z }
        d) nadpisać metodę toString(), aby zwracała wszystkie wartości pól, analogicznie jak w przykładzie
     */
    private int pX, pY, pZ;
    Punkt(int pX){
        this.pX=pX;
    }
    Punkt(int pX, int pY, int pZ){
        this.pX = pX;
        this.pY = pY;
        this.pZ = pZ;
    }
    public int getpX() {
        return pX;
    }
    public int setpY(int i){
        return pY;
    }
    public int getpZ() {
        return pZ * 10;
    }
    public int suma(){
        return pZ + pY + pX;
    }
    public int roznica(){
        return pZ - pY - pX;
    }
    public int roznica ( int x,int y,int z){
        return pX*x-pY*y-pZ*z;

    }
    public void wynik(){
        System.out.println(suma()+" ;"+roznica()+" ;"+roznica());
    }

    @Override
    public String toString() {
        return "Punkt{" +
                "pX=" + pX +
                ", pY=" + pY +
                ", pZ=" + pZ +
                '}';
    }
}
