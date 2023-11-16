package ec.edu.ups.practica.dos.bravo.valdiviezo.diego;

public class Ropa extends Producto{ //Usamos extends para heredar la clase Padre a la clase Ropa
	private String talla; //Private para asignar al atributo talla privado 
	private String color; //Private para asignar al atributo color privado 
	
	//Creacion del constructor vacio
	public Ropa() {
		
	}
	public Ropa(String nombre, String marca, int codigo, int precio,String talla, String color) {
		super(nombre, marca, codigo, precio);
		this.talla = talla;
		this.color = color;	
	}
	//Creacion de los getters y setter para los atributos de la clase Ropa. 
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//Creacion del toString
	//Se usa super para usar el toString de la clase padre 
	@Override
	public String toString() {
		return super.toString() + "Ropa [ " + "Talla= " + talla + ", Color= " + color+ "]\n";
	}
}
