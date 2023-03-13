
package Celular;


public class Main {

    public static void main(String[] args) {

        Celular celular1 = new Celular("SAMSUNG","AMARILLO"); 
        celular1.llamar();

        Celular celular2 = new Celular("XIAOMI","NEGRO");
        celular2.llamar();

        Celular detalleCelular = new Celular();

        detalleCelular.detalleCelular(celular2);
    }
}