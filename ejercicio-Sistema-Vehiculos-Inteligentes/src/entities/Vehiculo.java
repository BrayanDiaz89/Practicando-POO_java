package entities;

public abstract class Vehiculo {

    private String marca;
    private String modelo;
    private int ano;
    private Double velocidadMaxima;

    public Vehiculo(){ }

    public Vehiculo(String marca, String modelo, int ano, Double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(Double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String informacionBasica() {
        return "Información básica del vehículo: " +
                "marca='" + marca + '\'' +
                "modelo='" + modelo + '\'' +
                "año=" + ano + '\'' +
                "velocidadMaxima=" + velocidadMaxima;
    }

    public abstract void encender();

}
