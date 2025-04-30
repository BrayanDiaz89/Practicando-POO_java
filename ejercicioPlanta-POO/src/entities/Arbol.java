package entities;

public class Arbol extends Planta {

    private String variedad;
    private String tipoDeTronco;
    private Double radioDeTronco;

    public Arbol() {}

    public Arbol(String nombre, Double altoDelTallo, boolean tieneHojas, String climaIdeal,
                 String variedad, String tipoDeTronco, Double radioDeTronco, String color, String tipoDeHojas) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.radioDeTronco = radioDeTronco;
        this.color = color;
        this.tipoDeHojas = tipoDeHojas;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoDeTronco() {
        return tipoDeTronco;
    }

    public void setTipoDeTronco(String tipoDeTronco) {
        this.tipoDeTronco = tipoDeTronco;
    }

    public Double getRadioDeTronco() {
        return radioDeTronco;
    }

    public void setRadioDeTronco(Double radioDeTronco) {
        this.radioDeTronco = radioDeTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeHojas() {
        return tipoDeHojas;
    }

    public void setTipoDeHojas(String tipoDeHojas) {
        this.tipoDeHojas = tipoDeHojas;
    }

    private String color;
    private String tipoDeHojas;


    @Override
    public void saludar() {
        System.out.println("Hola, soy un árbol");
    }
}
