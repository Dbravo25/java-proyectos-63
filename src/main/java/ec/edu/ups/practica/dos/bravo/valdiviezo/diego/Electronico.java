package ec.edu.ups.practica.dos.bravo.valdiviezo.diego;


public class Electronico extends Producto { //Usamos extends para heredar la clase Padre a la clase Electronico
	//Creamos el atributo añosGarantia para la clase Electronico
	private String añosGarantia;
	//Creacion de un constructor vacio 
	public Electronico() {
	
	}
	
	//Creacion del constructor con todos los atributos 
	public Electronico(String nombre, String marca, int codigo, int precio, String añosGarantia) {
		super(nombre, marca, codigo, precio);
		this.añosGarantia = añosGarantia;
	}
	
	//Creacion del toString
	//Se usa super para usar el toString de la clase padre 
	@Override
	public String toString() {
		return super.toString() +  "Electronico [" + " Años de garantía= " + añosGarantia + "]\n";
	}	

}

