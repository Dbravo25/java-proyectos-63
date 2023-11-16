package ec.edu.ups.practica.dos.bravo.valdiviezo.diego;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
	//Creacion de los atributos de la clase Carrito con visibilidad privada 
	private int total;
	 //atributo de la relación de composición con las clases hijas de la clase Producto
	private List<Electronico> productosElectronicos; 
	private List<Ropa> ropaUno; 
	//Creacion del constructor vacio
	public Carrito() {
		this.productosElectronicos = new ArrayList<>();
		this.ropaUno = new ArrayList<>();
	}
	//Creacion del cosntructor con los atrbutos 
	public Carrito(int total) {

		this.total = total;
		this.productosElectronicos = new ArrayList<>();
		this.ropaUno = new ArrayList<>();
		
	}
	//Creacion del set y get del total
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	//Creacion del metodo mostrarProductosElectronicos para que el usuario pueda observar los productos disponibles
	public void mostrarProductosElectronicos(List<String> nombre,List<String> marca, List<Integer> codigo,List<Integer> precio,List<String> garantia ) {
		System.out.println("1. " + nombre.get(0) +" " + marca.get(0) +" Cod: " + codigo.get(0)+ " Precio: $ "+ precio.get(0)+ " Garantía: " + garantia.get(0));
		System.out.println("2. " + nombre.get(1)+" "+ marca.get(1) +" Cod: " + codigo.get(1)+ " Precio: $ "+ precio.get(1)+ " Garantía: " + garantia.get(1));
		System.out.println("3. " + nombre.get(2) +" "+ marca.get(2) +" Cod: " + codigo.get(2)+ " Precio: $ "+ precio.get(2)+ " Garantía: " + garantia.get(2));
		System.out.println("4. " + nombre.get(3) +" "+ marca.get(3) +"Cod: " + codigo.get(3)+ " Precio: $ "+ precio.get(3)+ " Garantía: " + garantia.get(3));
		System.out.println("5. " + nombre.get(4) +" "+ marca.get(4) +" Cod: " + codigo.get(4)+ " Precio: $ "+ precio.get(4)+ " Garantía: " + garantia.get(4));
	
	}
	//Creacion del metodo mostrarProductosRopa para que el usuario pueda observar los productos disponibles
	public void mostrarProductosRopa(List<String> nombre,List<String> marca, List<Integer> codigo,List<Integer> precio) {
			System.out.println("1. " + nombre.get(0) + " "+marca.get(0) + " Cod: "+ codigo.get(0) +" Precio: $ "+ precio.get(0));
			System.out.println("2. " + nombre.get(1) +" "+ marca.get(1) + " Cod: " + codigo.get(1) +" Precio: $ "+ precio.get(1));
			System.out.println("3. " + nombre.get(2) + " "+marca.get(2) + " Cod: " + codigo.get(2) + " Precio: $ "+precio.get(2));
			System.out.println("4. " + nombre.get(3) +" "+ marca.get(3) + " Cod: " + codigo.get(3) +" Precio: $ "+ precio.get(3));
		}
	//Creamos el metodo de agregarProductoElectronico para agragar las caracterisitcas de los productos
	//electronicos que escoga el Usuario 
	public void agregarProductoElectronico(String nombre,String marca, int codigo,int precio,String añosGarantia) {
			productosElectronicos.add(new Electronico( nombre, marca, codigo, precio, añosGarantia));
		}
	//Creamos el metodo de agregarRopaUno para agragar las caracterisitcas de los productos
	//Ropa que escoga el Usuario
	public void agregarRopaUno(String nombre,String marca, int codigo,int precio,String talla, String color) {
			ropaUno.add(new Ropa( nombre, marca, codigo, precio, talla, color));
		}
	//Creacion de los getters para ProductosElctronicos y RopaUno
	public List<Electronico> getProductosElectronicos(){
		return productosElectronicos;
	}
	public List<Ropa> getRopaUno(){
		return ropaUno;
	}
	//Creacion del toString 
	@Override
	public String toString() {
		return "Carrito [total=" + total + ", productosElectronicos=" + productosElectronicos + ", ropaUno=" + ropaUno
				+ "]";
	}
	
}
 