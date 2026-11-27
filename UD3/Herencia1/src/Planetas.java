public class Planetas extends Astros {

    private double distanciaSol;
    private double orbitaSol;
    private boolean tieneSatelites;

    public Planetas(double radioEcuatorial, double rotacion, double masa, double temperaturaMedia, double gravedad,
                    double distanciaSol, double orbitaSol, boolean tieneSatelites) {
        super(radioEcuatorial, rotacion, masa, temperaturaMedia, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.tieneSatelites = tieneSatelites;
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public double getOrbitaSol() {
        return orbitaSol;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    @Override
    public String muestra() {
        return super.toString() + this.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(", distanciaSol = ").append(distanciaSol);
        sb.append(", orbitaSol = ").append(orbitaSol);
        sb.append(", tieneSatelites = ").append(tieneSatelites);
        return sb.toString();
    }
}
