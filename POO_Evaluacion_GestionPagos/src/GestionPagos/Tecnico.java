//CLASE HIJA TECNICO
package GestionPagos;

public class Tecnico extends Personal {
	protected int soluciones;

	public Tecnico(String nombre, String apellido, int edad, String cedula, String genero, int soluciones, int sueldoBase) {
		super(nombre, apellido, edad, cedula, genero, soluciones, sueldoBase);
		this.soluciones = soluciones;
	}
	//metodos getters y setters para obtener el valor de soluciones brindadas por el tecnico
	public int getSoluciones() {
		return soluciones;
	}

	public void setSoluciones(int soluciones) {
		this.soluciones = soluciones;
	}
	
@Override
public double calcularSueldo() {
    return 450 +(450 * 0.15 * soluciones);
}
}
