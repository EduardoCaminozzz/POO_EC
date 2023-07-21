//CLASE HIJA ADMINISTRATIVO
package GestionPagos;

public class Administrativo extends Personal {
	protected  int horasExtra;
//constructor
	public Administrativo(String nombre, String apellido, int edad, String cedula, String genero, int horasExtra, int sueldoBase) {
		super(nombre, apellido, edad, cedula, genero,horasExtra, sueldoBase);
		this.horasExtra = horasExtra;
	}
	//metodos getters y setteres para recibir el valor de las horas extras

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

@Override
public double calcularSueldo() {
    return 500+(500 * 0.05 * horasExtra);
}
}
