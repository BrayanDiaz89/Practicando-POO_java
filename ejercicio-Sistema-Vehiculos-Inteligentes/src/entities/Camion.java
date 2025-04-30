package entities;

public class Camion extends Vehiculo{

    private Double capacidadDeCarga;
    private int numeroDeEjes;
    private boolean tieneRemolque;

    public Camion (){}

    public Camion(String marca, String modelo, int ano, Double velocidadMaxima, Double capacidadDeCarga, int numeroDeEjes, boolean tieneRemolque) {
        super(marca, modelo, ano, velocidadMaxima);
        this.capacidadDeCarga = capacidadDeCarga;
        this.numeroDeEjes = numeroDeEjes;
        this.tieneRemolque = tieneRemolque;
    }

    @Override
    public void encender(){
        System.out.println("El camión está encendido, listo para trabajar.");
    }

    public void conectarRemolque(boolean tieneRemolque){
        this.tieneRemolque = tieneRemolque;
        if (this.tieneRemolque) {
            System.out.println("Conectando remolque.");
        }else {
            System.out.println("No es posible conectar, el camión no tiene remolque.");
        }
    }
}
