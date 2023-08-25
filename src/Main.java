import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gaseosa gaseosaZ = new Gaseosa("Coca-Cola Zero",20,1.5);
        System.out.println(gaseosaZ.toString());
        Gaseosa gaseosa = new Gaseosa("Coca-Cola",18,1.5);
        System.out.println(gaseosa.toString());
        Shampoo shampoo = new Shampoo("Sedal",19,500);
        System.out.println(shampoo.toString());
        Fruta frutilla = new Fruta("Frutilla",64,"kilo");
        System.out.println(frutilla.toString());



        ArrayList<Producto> ListaProductos= new ArrayList<>();

        ListaProductos.add(gaseosaZ);
        ListaProductos.add(gaseosa);
        ListaProductos.add(shampoo);
        ListaProductos.add(frutilla);

        for(Producto i:ListaProductos){

        }
        ListaProductos lista = new ListaProductos(ListaProductos);
        lista.MaxValor();
        lista.MinValor();
    }





}