import entities.Arbol;
import entities.Arbusto;
import entities.Flor;

public class Main {

    public static void main(String[] args) {
        Arbol arbolito = new Arbol();
        Flor flower = new Flor();
        Arbusto arbustin = new Arbusto();

        arbolito.saludar();
        flower.saludar();
        arbustin.saludar();
    }
}