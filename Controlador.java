import java.util.Scanner;
import java.io.*;
import java.util.ArrayList; 


public class Controlador {
    public static void main(String[] args){
        int opcion=0;
        ArrayList<String> datos = new ArrayList<String>();
        ArrayList<String> carri = new ArrayList<String>();
        String[] listaproductos={"CamaraFotografica", "Smartphone", "Telefono Celular", "Telefono Fijo", "Tablet", "SmartWatch", "SmartTV", "Laptop", "Desktop"};
        Vista v = new Vista();
        while(opcion!=4){
        v.Mensaje("1) Ver lista de productos");
        v.Mensaje("2) Añadir producto");
        v.Mensaje("3) Comprar");
        v.Mensaje("4) Salir");
        opcion=v.askInts("Opcion a realizar: ");
        if(opcion==1){
            int op=0;
            try {
                File arch = new File("productos.txt");
                int o=0;
                Scanner leer = new Scanner(arch);
                while (leer.hasNextLine()) {
                  String data = leer.nextLine();
                  datos.add(data);
                  System.out.println(o+" "+data);
                  o++;
                }
                leer.close();
              } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }
            v.Mensaje("1) Probar Producto");
            v.Mensaje("2) Añadir al carrito");
            op=v.askInts("Opcion a realizar: ");
            
            if(op==1){
                
            }
            if(op==2){
                int numproduc=v.askInts("Cual es el producto: ");
                carri.add(datos.get(numproduc));
                datos.remove(numproduc);
                
            }
        }
        if(opcion==2){
            String su=v.askString("Sucursal: ");
            int p= v.askInts("Precio del producto: ");
            String n=v.askString("Nombre: ");
            String m=v.askString("Marca: ");
            String s=v.askString("Serie: ");
            String mar=v.askString("Marcador AR: ");
            String f=v.askString("Fecha: ");
            for(int i=0;i<listaproductos.length;i++)
            {
                v.Mensaje("     "+i+" "+listaproductos[i]);
            }
            int numt=v.askInts("Cual es el producto: ");
            
            try 
            {
                File arch = new File("productos.txt");
                if (arch.createNewFile()) {
                  System.out.println("File created: " + arch.getName());
                } else {
                  System.out.println("");
                }
            } 
            catch (IOException e) 
            {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try {
                FileWriter escribir = new FileWriter("productos.txt");
                escribir.write(su+"-"+p+"-"+n+"-"+m+"-"+s+"-"+mar+"-"+f+"-"+listaproductos[numt%listaproductos.length]);
                escribir.close();
                System.out.println("Successfully wrote to the file.");
              } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }

        }
        if(opcion==3){
            v.Mensaje("En el carrito tiene: ");
            for(int i=0;i<carri.size();i++){
                v.Mensaje(i+" "+carri.get(i));
            }
            v.Mensaje("1) Eliminar ");
            v.Mensaje("2) Pagar");
            int op=v.askInts("Opcion: ");
            if(op==1){
                int e=v.askInts("Ingrese el numero del producto a Eliminar");
                if(e<carri.size())
                    carri.remove(e);
            }
            if(op==2){
                File arch = new File("productos.txt"); 
                if (arch.delete()) { 
                    System.out.println("Actualizado el archivo:  " + arch.getName());
                } else {
                    System.out.println("Fallo al actualizar");
                }
                try 
                {
                if (arch.createNewFile()) {
                } 
                } 
                catch (IOException e) 
                {
                System.out.println("An error occurred.");
                e.printStackTrace();
                }
                try {
                    FileWriter escribir = new FileWriter("productos.txt");
                    for(int i=0;i<datos.size();i++){
                        escribir.write(datos.get(i));
                    }
                    escribir.close();
                  } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                  }
                  Carrito c=new Carrito();
                  c.Finalizar(v.askString("nombre del cliente: "),v.askString("numero de nit: "));
            }
        }

    }
}
}