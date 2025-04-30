package entities;

public class Automovil extends Vehiculo {
    private String tipoDeCombustible;
    private int numeroDePuertas;
    private boolean tieneAireAcondicionado;

    public Automovil(){}

    public Automovil(String marca, String modelo, int ano, Double velocidadMaxima, String tipoDeCombustible, int numeroDePuertas, boolean tieneAireAcondicionado) {
        super(marca, modelo, ano, velocidadMaxima);
        this.tipoDeCombustible = tipoDeCombustible;
        this.numeroDePuertas = numeroDePuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }


    @Override
    public void encender() {
        System.out.println("El automóvil ha sido encendido.");
    }

    public void activarAire(boolean tieneAireAcondicionado){
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        if(this.tieneAireAcondicionado){
            System.out.println("El aire acondicionado ha sido activado.");
        } else {
            System.out.println("El vehículo no tiene aire acondicionado, no es posible activarlo.");
        }
    }

}
