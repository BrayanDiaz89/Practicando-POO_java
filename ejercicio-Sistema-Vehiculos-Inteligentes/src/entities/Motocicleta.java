package entities;

public class Motocicleta extends Vehiculo {

    private int cilindraje;
    private String tipoMoto;
    private boolean cascoIncluido;

    public Motocicleta(){ }

    public Motocicleta(String marca, String modelo, int ano, Double velocidadMaxima, int cilindraje, String tipoMoto, boolean cascoIncluido) {
        super(marca, modelo, ano, velocidadMaxima);
        this.cilindraje = cilindraje;
        this.tipoMoto = tipoMoto;
        this.cascoIncluido = cascoIncluido;
    }

    @Override
    public void encender(){
        System.out.println("La motocicleta está lista para rodar.");
    }

    public void usarCasco(boolean cascoIncluido){
        this.cascoIncluido = cascoIncluido;
        if (this.cascoIncluido){
            System.out.println("Puedes usar el casco.");
        } else {
            System.out.println("No tienes un casco para usar.");
        }
    }

}
