import entities.Automovil;
import entities.Camion;
import entities.Motocicleta;
import entities.Vehiculo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Automovil automovil = new Automovil();
        Camion camion = new Camion();
        Motocicleta motocicleta = new Motocicleta();

        List<Vehiculo> vehiculos = List.of(automovil, camion, motocicleta);
        vehiculos.forEach(Vehiculo::encender);
        vehiculos.forEach(v-> System.out.println(v.informacionBasica()));

        automovil.activarAire(true);
        camion.conectarRemolque(false);
        motocicleta.usarCasco(true);

    }
}