package ec.edu.ups.practica.dos.bravo.valdiviezo.diego;



public class Producto {
	//Creamos los atributos de la clase producto y usamos protected 
	//para que los atributos sea utilizados en las clases hijas (Electronico  y Ropa )
	protected String nombre; 
	protected String marca;
	protected int codigo;
	protected int precio;
	
	//Constructor vacío 
	public Producto() {

	
	}
	//Constructor con todos los atributos
	public Producto(String nombre, String marca, int codigo, int precio) {
		this.nombre = nombre;
		this.marca = marca;
		this.codigo = codigo;
		this.precio = precio;
	}
	
	//Creacion de los getters y setters de todos los atributos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//Creacion del toString para  imprimir directamente los atributos con su valores 
	@Override
	public String toString() {
		return "Producto [ Nombre= " + nombre +", Marca= " + marca+ ", Codigo= " + codigo + ", Precio= $" + precio + "]" ;
	}
	
	
}

