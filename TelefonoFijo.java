public class TelefonoFijo implements Device, Llamada {
	double precio = 0;
	String nombre = "";
	String marca = "";
	String serie = "";
	String marcadorAR = "";
	String fecha = "";
	String tipo = "";

	public TelefonoFijo(double p, String n, String m, String s, String mar, String f){
		precio = p;
		nombre = n;
		marca = m;
		serie = s;
		mar = marcadorAR;
		f = fecha;
		tipo = "Telefono Fijo";
	}

	public String[] acciones(){
		String[] funciones = {"Llamar"};
		return funciones;
	}

	public String accion(int a, String b){
		String act= "";
		if(a == 1){
			act = llamar(b);
		}
		return act;
	}

	public double getPrecio(){
		return precio;
	}

	public String getNombre(){
		return nombre;
	}
	
	public String getMarca(){
		return marca;
	}

	public String getSerie(){
		return serie;
	}

	public String getMarcador(){
		return marcadorAR;
	}

	public String getfecha(){
		return fecha;
	}

	public String getTipo(){
		return tipo;
	}

	public String llamar(String s){
		return "Se llamó al número: "+s +"con el teléfono de marca: " + marca +" (marcador AR " + marcadorAR+")";
	}

	public String toString(){
		return "Producto del tipo: "+tipo + ", con precio: " + precio + " y marca: " + marca +" fabricado en: "+fecha;
	}
}
