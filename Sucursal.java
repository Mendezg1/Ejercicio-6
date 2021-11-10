
public class Sucursal {
    String direccion="";
    int codigo = 0;
    String pais = "";
    String ciudad = "";
    String nombre = "";

    public Sucursal(String d, int c, String p, String ci, String n){
        direccion = d;
        codigo = c;
        pais = p;
        ciudad = ci;
        nombre = n;
    }

    public String getDireccion(){
        return direccion;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getPais(){
        return pais;
    }

    public String getCiudad(){
        return ciudad;
    }

    public String getNombre(){
        return nombre;
    }
}
