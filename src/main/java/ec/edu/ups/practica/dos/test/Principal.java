package ec.edu.ups.practica.dos.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ec.edu.ups.practica.dos.bravo.valdiviezo.diego.Carrito;
import ec.edu.ups.practica.dos.bravo.valdiviezo.diego.Pedido;
import ec.edu.ups.practica.dos.bravo.valdiviezo.diego.Usuario;


public class Principal {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); //Usamos Scanner para que el usuario pueda ingresar datos desde consola
		//Solicitamos los datos del usuario
		System.out.println("**** REGISTRO DE USUARIO ****");
		System.out.println("Ingrese el número de cédula: ");
		String cedula = entrada.next();
		System.out.println("Ingrese el nombre: ");
		String nombre = entrada.next();
		System.out.println("Ingrese la edad: ");
		int edad = entrada.nextInt();
		System.out.println("Ingrese el email: ");
		String email = entrada.next();
		System.out.println("Ingrese el teléfono: ");
		String telefono = entrada.next();
		System.out.println("Ingrese la dirección: ");
		String direccion = entrada.next();
		System.out.println("*****************\n");
		//Instanciamos la clase usuario 
		Usuario persona = new Usuario();
		persona.registrarUsuario(cedula, nombre, edad, email, telefono, direccion);
		
		// Creamos los productos electronicos
		List<String> nombreElectronico = new ArrayList<>(); //Creamos el listado nombreElectronico para guardar el nombre de los productos 
		List<String> marcaElectronico = new ArrayList <>(); //Creamos el listado marcaElectronico para guardar  la marca de los productos 
		List<Integer> codigoElectronico = new ArrayList<>(); //Creamos el listado codigoElectronico para guardar el codigo de los productos 
		List<Integer> precioElectronico = new ArrayList<>(); //Creamos el listado precioElectronico para guardar el precio de los productos 
		List<String> garantiaElectronico = new ArrayList<>(); //Creamos el listado garantiaElectronico para guardar la garantía de los productos 
		//Usamos .add para agregar las caracteristicas de los productos a cada listado 
		nombreElectronico.add("Computadora Laptop");
		marcaElectronico.add("Dell");
		codigoElectronico.add(101);
		precioElectronico.add(1500);
		garantiaElectronico.add("2 Años");
		
		nombreElectronico.add("Computadora Laptop");
		marcaElectronico.add("HP");
		codigoElectronico.add(102);
		precioElectronico.add(1800);
		garantiaElectronico.add("2 Años");
		
		nombreElectronico.add("Celular");
		marcaElectronico.add("Apple");
		codigoElectronico.add(103);
		precioElectronico.add(1000);
		garantiaElectronico.add("1 Año");
		
		nombreElectronico.add("Celular");
		marcaElectronico.add("Huawei");
		codigoElectronico.add(104);
		precioElectronico.add(300);
		garantiaElectronico.add("1 Año");
		
		nombreElectronico.add("Televisor");
		marcaElectronico.add("Samsung");
		codigoElectronico.add(105);
		precioElectronico.add(600);
		garantiaElectronico.add("2 Años");
		
		//Crear los productos de Ropa
		List<String> nombreRopa = new ArrayList<>(); 
		List<Integer> codigoRopa = new ArrayList<>();
		List<Integer> precioRopa = new ArrayList<>();
		List<String> marcaRopa = new ArrayList <>();
		nombreRopa.add("Camisa");
		marcaRopa.add("Calvin Klein");
		codigoRopa.add(101);
		precioRopa.add(30);
	
		
		nombreRopa.add("Pantalon");
		marcaRopa.add("Levis");
		codigoRopa.add(102);
		precioRopa.add(20);
		
		
		nombreRopa.add("Zapatos");
		marcaRopa.add("Reebok");
		codigoRopa.add(103);
		precioRopa.add(90);
		
		
		nombreRopa.add("Camiseta");
		marcaRopa.add("Adidas");
		codigoRopa.add(104);
		precioRopa.add(10);
		System.out.println("**** PRODUCTOS ****");
		//Instanciamos la clase Carrito y creamos el objeto carritoUno 
		Carrito carritoUno = new Carrito();
		int opcion = 0; //contador para iniciar un bucle while
		int total = 0; // declaro la variable total para guardar la sumatoria de los precios agregados por el usuario
		System.out.println("Qué productos desea comprar:\n");
		while ( opcion != 3) { //Creamos un bucle while para crear un Menu didactico. 
			System.out.println("1. Productos Electrónicos\n"
					+ "2. Ropa\n"
					+ "3. Salir\n"
					+ "Ingrese la opción: ");
			 opcion = entrada.nextInt(); //Guardamos la opción escogida por el usuario 
			 //Condicional para ingresar a la productos que desea el Usuario 
			if (opcion == 1) {
				//Presentamos al usuario los productos Electronicos disponibles 
				System.out.println("Productos disponibles: ");
				carritoUno.mostrarProductosElectronicos(nombreElectronico, marcaElectronico, codigoElectronico, precioElectronico, garantiaElectronico);
				System.out.println("Desea adquirir algún producto\n"
						+ "1. Si\n"
						+ "2. No");
				int respuesta = entrada.nextInt(); // Guardamos la respuesta del usuario 
				//Creamos un condicional para acceder dependiendo la respuesta del usuario
				if (respuesta == 1) { 
					//Preguntamos que producto desea agregar al carrito
					System.out.println("Que productos desea agregar al carrito:\n"
						+ "Ingrese la opción: ");	
					int n = entrada.nextInt(); //Guardamos la respuesta del usuario 
					//Agragamos el producto al carrito, usamos n-1 para guardar en la posicón correcta ya que el listado empieza desde 0 
					carritoUno.agregarProductoElectronico(nombreElectronico.get(n-1), marcaElectronico.get(n-1), codigoElectronico.get(n-1),
							precioElectronico.get(n-1), garantiaElectronico.get(n-1));
					total = (total + precioElectronico.get(n-1));// Realizamos la suma de los precios de cada producto que agregue el usuario
					
					}
				System.out.println("Qué otro producto desea comprar:\n"); //Imprimimos para que sea mas didacto el programa
			}
			//Condicional para ingresar a la productos que desea el Usuario 
			else if (opcion == 2){
				//Presentamos al usuario los productos (ROPA) disponibles 
				System.out.println("Productos disponibles: ");
				carritoUno.mostrarProductosRopa(nombreRopa, marcaRopa, codigoRopa, precioRopa);
				System.out.println("Desea adquirir algún producto\n"
						+ "1. Si\n"
						+ "2. No");
				int respuestados = entrada.nextInt(); // Guardamos la respuesta del usuario
				//Creamos un condicional para acceder dependiendo la respuesta del usuario
				if (respuestados ==1) {
					//Preguntamos que producto desea agregar al carrito
					System.out.println("Que productos desea agregar al carrito:\n"
							+ "Ingrese la opcion: ");
					int m = entrada.nextInt();//Guardamos la respuesta del usuario 
					 //Solicitamos la talla y el color de la prenda al Usuario
					System.out.println("Ingrese la talla de la prenda");
					String talla = entrada.next();
					System.out.println("Ingrese el color de la prenda");
					String color = entrada.next(); 
					//Agragamos el producto al carrito, usamos m-1 para guardar en la posicón correcta ya que el listado empieza desde 0
					carritoUno.agregarRopaUno(nombreRopa.get(m-1), marcaRopa.get(m-1), codigoRopa.get(m-1), precioRopa.get(m-1), talla, color);
					total = total + precioRopa.get(m-1); // Realizamos la suma de los precios de cada producto que agregue el usuario
					}
					System.out.println("Qué otro producto desea comprar:\n"); //Imprimimos para que sea mas didacto el programa
				
				}else {//else para salir o imprimir opcion invalida 
					//Condicional para imprimir mensajes de salida del menu o por opcion invalida 
					if (opcion == 3) {
						System.out.println("*****************\n");
						System.out.println("Sus productos se agregaron correctamente al carrito\n");
						
					}else {
						System.out.println("Opción Inválida");
					}
				}
		}
		carritoUno.setTotal(total); //Guardamos el TOTAL en el objeto carritoUno
		System.out.println("El total de los productos agregados al carrito es: $" + carritoUno.getTotal());
		persona.agregarCarrito(carritoUno); //Agregamos el carrito al usuario 
		
		System.out.println("**** PEDIDO ****\n");
		
		
		Pedido pedidoUno = new Pedido(); // Instanciamos la clase Pedido y creamos el objeto pedidoUno
		pedidoUno.setTotal(total);
		pedidoUno.setUsuarios(persona); //Guardamos en Pedido al Usuario Persona 
		//Imprimos los datos del usuario 
		System.out.println("Estimado " + pedidoUno.getUsuarios()); 
		System.out.println("\n*************");
		System.out.println("\nLos productos agregados al carrito son los siguientes: ");
		System.out.println(carritoUno.getProductosElectronicos()); //Mostramos los productos Electronicos agregados al carrito
		System.out.println(carritoUno.getRopaUno());//Mostramos los productos Ropa agregados al carrito
		System.out.println("El total de su compra es =   $ " + pedidoUno.getTotal()); // Imprimimos el TOTAL 
		System.out.println("\nDesea realizar el pedido:\n"
				+ "1.Si\n"
				+ "2.No\n"
				+ "Ingrese la opción: ");
		int respuestapedido = entrada.nextInt(); //Guardamos la respuesta del usuario
		//Usamos el metodo realizar pedido para realizar o cancelar el pedido dependiendo la respueta del Usuario. 
		pedidoUno.realizarPedido(respuestapedido);
		

		
	}
	

}
