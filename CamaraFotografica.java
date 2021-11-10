public class CamaraFotografica implements Device, Portable, Camara {
	double precio = 0;
	String nombre = "";
	String marca = "";
	String serie = "";
	String marcadorAR = "";
	String fecha = "";
	String tipo = "";

	public CamaraFotografica(double p, String n, String m, String s, String mar, String f){
		precio = p;
		nombre = n;
		marca = m;
		serie = s;
		mar = marcadorAR;
		f = fecha;
		tipo = "Camara Fotográfica";
	}

	public String[] acciones(){
		String[] funciones = {"Fotografiar", "Reproducir", "Mover"};
		return funciones;
	}

	public String accion(int a, String b){
		String act= "";
		if(a == 1){
			act = fotografiar(b);
		}
		else if(a == 2){
			act = reproducir(b);
		}
		else if(a == 3){
			act = mover(b);
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

	public String fotografiar(String s){
		return "La cámara fotografió a: " + s+ "de marca " +  marca +" (marcador AR: " + marcadorAR + ")";
	}

	public String mover(String s){
		return "Se movió la cámara a: "+s + "de marca " +  marca +" (marcador AR: " + marcadorAR + ")";
	}

	public String reproducir(String s){
	return "Se reprodujo el video: "+s+ "de marca " +  marca +" (marcador AR: " + marcadorAR + ")";
	}

	public String toString(){
		return "Producto del tipo: "+tipo + ", con precio: " + precio + " y marca: " + marca +" fabricado en: "+fecha;
	}
}
