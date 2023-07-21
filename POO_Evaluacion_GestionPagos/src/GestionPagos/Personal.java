package GestionPagos;
import java.util.Scanner;
public class Personal extends Sueldo {
	protected int sueldoBase;
	protected String nombre;
	protected String apellido;
	protected int edad ;
	protected String cedula;
	protected String genero;
	public Personal(String nombre, String apellido, int edad, String cedula, String genero, int sueldoBase, int sueldoBase2) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.cedula = cedula;
		this.genero = genero;
		this.sueldoBase=sueldoBase;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase() {
		this.sueldoBase=sueldoBase;
	}
	
	public void aggInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		this.nombre=sc.nextLine();
		System.out.print("Ingrese apellido: ");
		this.apellido=sc.nextLine();
		System.out.print("Ingrese edad:");
		this.edad=sc.nextInt();
		sc.nextLine();
		System.out.print("Ingrese la cedula:");
		this.cedula=sc.nextLine();
		System.out.print("Ingrese el genero [Masculino o femenino]");
		genero=sc.nextLine();
	}
	
	public void mostrarInfo() {
		System.out.println("-----------------------------------");
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println("edad: "+edad);
		System.out.println("cedula: "+cedula);
		System.out.println("genero: "+genero);
	}
	public double calcularSueldo() {
		return 0;
	}

}
