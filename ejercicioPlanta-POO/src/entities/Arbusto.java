package entities;

public class Arbusto extends Planta {

    private Double ancho;
    private boolean esDomestico;
    private String variedadArbusto;
    private String colorDeHojas;
    private boolean sePodaONo;

    public Arbusto() {}

    public Arbusto(String nombre, Double altoDeHoja, boolean tieneHojas, String climaIdeal,
                   Double ancho, boolean esDomestico, String variedadArbusto, String colorDeHojas, boolean sePodaONo){
        super(nombre, altoDeHoja, tieneHojas, climaIdeal);
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorDeHojas =colorDeHojas;
        this.sePodaONo = sePodaONo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public String getColorDeHojas() {
        return colorDeHojas;
    }

    public void setColorDeHojas(String colorDeHojas) {
        this.colorDeHojas = colorDeHojas;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un arbusto");
    }
}
