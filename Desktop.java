public class Desktop implements Device,Navegador,Videojuegos,Reproductor {
	double precio = 0;
	String nombre = "";
	String marca = "";
	String serie = "";
	String marcadorAR = "";
	String fecha = "";
	String tipo = "";

	public Desktop(double p, String n, String m, String s, String mar, String f){
		precio = p;
		nombre = n;
		marca = m;
		serie = s;
		mar = marcadorAR;
		f = fecha;
		tipo = "Desktop";
	}

	public String[] acciones(){
		String[] funciones = { "Navegar", "Reproducir", "Jugar"};
		return funciones;
	}

	public String accion(int a, String b){
		String act= "";
		if(a == 3){
			act = jugar(b);
		}
		else if(a == 1){
			act = navegar(b);
		}
		else if(a == 2){
			act = reproducir(b);
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

	public String reproducir(String s){
	return "Se reprodujo el video: "+s+"con el Desktop de marca: " + marca +" (marcador AR " + marcadorAR+")";
	}

	public String navegar(String s){
		return "Se navegó a la página con el link: "+s+"con el Desktop de marca: " + marca +" (marcador AR " + marcadorAR+")";
	}

	public String jugar(String s){
		return "Se jugó al juego: "+s +"con el Desktop de marca: " + marca +" (marcador AR " + marcadorAR+")";
	}

	public String toString(){
		return "Producto del tipo: "+tipo + ", con precio: " + precio + " y marca: " + marca +" fabricado en: "+fecha;
	}

}
