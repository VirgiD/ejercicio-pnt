public class Fruta extends Producto{
    String unidad= "kilo";


    public Fruta(String nombre, int precio, String unidad) {
        super(nombre, precio);
        unidad = unidad;
    }

    public String getKilo() {
        return unidad;
    }

    public void setKilo(String kilo) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Fruta{" +
                " nombre= '" + nombre + '\'' +
                ", precio= $" + precio +
                ", Unidad de venta= " + unidad +
                '}';
    }
}
