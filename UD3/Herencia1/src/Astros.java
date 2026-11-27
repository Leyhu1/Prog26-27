public abstract class Astros {

    private double radioEcuatorial;
    private double rotacion;
    private double masa;
    private double temperaturaMedia;
    private double gravedad;

    public Astros(double radioEcuatorial, double rotacion, double masa, double temperaturaMedia, double gravedad) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacion = rotacion;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }

    public double getRadioEcuatorial() {
        return radioEcuatorial;
    }

    public double getRotacion() {
        return rotacion;
    }

    public double getMasa() {
        return masa;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public double getGravedad() {
        return gravedad;
    }

    //Metodo abstracto que es de obligada implementacion en cualquier clase hija que no sea abstracto
    public abstract String muestra();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("radioEcuatorial = ").append(radioEcuatorial);
        sb.append(", rotacion = ").append(rotacion);
        sb.append(", masa = ").append(masa);
        sb.append(", temperaturaMedia = ").append(temperaturaMedia);
        sb.append(", gravedad = ").append(gravedad);
        return sb.toString();
    }
}
