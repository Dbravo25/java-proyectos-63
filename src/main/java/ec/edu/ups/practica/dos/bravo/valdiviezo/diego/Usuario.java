package ec.edu.ups.practica.dos.bravo.valdiviezo.diego;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	//Creacion de atributos para la clase usuario 
	private String cedula; // Crear el atributo cedula 
	private String nombre; // Crear el atributo nombre 
	private int edad; // Crear el atributo edad 
	private String email; // Crear el atributo email 
	private String telefono; // Crear el atributo telefono 
	private String direccion; // Crear el atributo direccion
	//Atributo de la relacion de Agregación
	private List<Carrito> carritos; // Crear el atributo carritos 
	
	//Constructor vacío. 
	public Usuario() {
		this.carritos = new ArrayList<>();
	}
	//Constructor con todos los atributos 
	public Usuario(String cedula, String nombre, int edad, String email, String telefono, String direccion) {

		this.cedula = cedula;
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
		this.carritos = new ArrayList<>();
	}
	//Creación de los Setter y getters de los atributos de la clase Usuario 
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//Creacion del metodo registrar Usuario, va a guardar todos los datos ingresados por el Usuario. 
	public void registrarUsuario(String cedula, String nombre, int edad, String email, String telefono, String direccion) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	//Creación de metodo para agregar carrito al Usuario
	public void agregarCarrito(Carrito car) {
		carritos.add(car);
	}
	@Override
	//Creación del toString 
	public String toString() {
		return "Usuario \nCédula= " + cedula + ",\nNombre= " + nombre + ",\nEdad= " + edad + ",\nEmail= " + email
				+ ",\nTeléfono= " + telefono + ",\nDirección= " + direccion ;
	}
}
