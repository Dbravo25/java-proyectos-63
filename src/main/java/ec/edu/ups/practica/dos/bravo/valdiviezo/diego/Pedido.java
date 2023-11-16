package ec.edu.ups.practica.dos.bravo.valdiviezo.diego;

public class Pedido {
	private int total; 
	//Atributo de relacion de asociación 
	private Usuario usuarios; //Relacionamos la clase Pedido con la clase Usuario
	//Constructor vacío 
	public Pedido() {
		
	}
	//Constructor con todos los atributos
	public Pedido(int total, Usuario usuarios) {
		this.total = total;
		this.usuarios = usuarios;
	}
	//Creacion de los getters y setters
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Usuario getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}
	//Creacion del metodo realizar pedido para usar en la clase principal 
	public void realizarPedido(int respuesta) { //El parametro es respuesta del Usuario
		//Segun la respuesta del usuario imprimir los siquientes mensajes
		if (respuesta == 1) {
			System.out.println("\nSu pedido se ha realizado exitosamente!\n"
					+ "¡Muchas Gracias por su Compra!");	
		}else {
			System.out.println("Su pedido ha sido cancelado");
		}	
	}
	//Creacion del metodo toString 
	@Override
	public String toString() {
		return "Pedido [total=" + total  + ", usuarios=" + usuarios + "]";
	}	
}


