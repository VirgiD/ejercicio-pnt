public class Gaseosa extends Producto {

    double litros;

    public Gaseosa(int litros) {
        this.litros = 0;
    }

    public Gaseosa(String nombre, int precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Gaseosa{" +
                " nombre= '" + nombre + '\'' +
                ", litros= " + litros +
                ", precio= $" + precio +
                '}';
    }
}
