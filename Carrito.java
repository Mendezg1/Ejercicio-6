import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Random;
public class Carrito {
    
    ArrayList<Device> productos = new ArrayList<Device>();

    public ArrayList<Device> Ver(){
        return productos;
    }

    public String Finalizar(String cliente, String nit){
        LocalDate fecha = java.time.LocalDate.now();
        Random rand = new Random();
        int factura = rand.nextInt(10000);
        double total = 0;
        String s = "Factura número: " + factura + "\nEl día de hoy "+ fecha.getDayOfMonth() + " de "+fecha.getMonth() +" de  "+ fecha.getYear() + ", el cliente " + cliente
        + " con NIT " + nit + "ha adquirido lo siguiente: \n";
        for(int i = 0; i < productos.size(); i++){
            s+= productos.get(i).getNombre() + " ------------------------- " + productos.get(i).getPrecio() + "\n";
            total += productos.get(i).getPrecio();
        } 

        s+= "\nAdquiriendo un total a pagar de "+ total;
        return s;
    }

    public void Agregar(Device p){
        productos.add(p);
    }

}
