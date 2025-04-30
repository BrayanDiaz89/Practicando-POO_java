package entities;

public class Flor extends Planta {

    private String colorPetalos;
    private Double cantidadPromedioPetalos;
    private String colorPistillo;
    private String variedadFlor;
    private String estacion;

    public Flor() {}

    public Flor (String nombre, Double altoDeHoja, boolean tieneHojas, String climaIdeal,
                 String colorPetalos, Double cantidadPromedioPetalos, String colorPistillo, String variedadFlor, String estacion){
        super(nombre, altoDeHoja, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantidadPromedioPetalos = cantidadPromedioPetalos;
        this.colorPistillo = colorPistillo;
        this.variedadFlor = variedadFlor;
        this.estacion = estacion;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public Double getCantidadPromedioPetalos() {
        return cantidadPromedioPetalos;
    }

    public void setCantidadPromedioPetalos(Double cantidadPromedioPetalos) {
        this.cantidadPromedioPetalos = cantidadPromedioPetalos;
    }

    public String getColorPistillo() {
        return colorPistillo;
    }

    public void setColorPistillo(String colorPistillo) {
        this.colorPistillo = colorPistillo;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy una flor");
    }
}
