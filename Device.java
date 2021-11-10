public interface Device {

	double precio = 0;
	String nombre = "";
	String marca = "";
	String serie = "";
	String marcadorAR = "";
	String fecha = "";
	String tipo = "";

	public String[] acciones();

	public double getPrecio();

	public String getNombre();
	
	public String getMarca();

	public String getSerie();

	public String getMarcador();

	public String getfecha();

	public String accion(int a, String b);

	public String getTipo();

	public String toString();
}
