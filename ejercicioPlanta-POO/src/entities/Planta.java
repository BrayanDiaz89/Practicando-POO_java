package entities;

public abstract class Planta{

    private String nombre;
    private Double altoDelTallo;
    private boolean tieneHojas;
    private String climaIdeal;

    public Planta () {}

    public Planta(String nombre, Double altoDelTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altoDelTallo = altoDelTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getAltoDelTallo() {
        return altoDelTallo;
    }

    public void setAltoDelTallo(Double altoDelTallo) {
        this.altoDelTallo = altoDelTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    protected abstract void saludar();

}
