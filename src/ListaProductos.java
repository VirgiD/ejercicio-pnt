import java.util.ArrayList;

public class ListaProductos extends Producto {

    ArrayList<Producto>ListaProductos;

    public ListaProductos(ArrayList<Producto>ListaProductos) {
        this.ListaProductos = ListaProductos;
    }

    public void MaxValor(){
        int j =0;
        String name = "";
        for(Producto i : ListaProductos)
            if(i.getPrecio()>j){
                j= (int) i.getPrecio();
                name=i.getNombre();
            }
        System.out.println("El producto mas caro es: "+name);
        }

    public void MinValor(){
        int j =1000;
        String name = "";
        for(Producto i : ListaProductos)
            if(i.getPrecio()<j){
                j= (int) i.getPrecio();
                name=i.getNombre();
            }
        System.out.println("El producto mas barato es: "+name);
    }

    }
