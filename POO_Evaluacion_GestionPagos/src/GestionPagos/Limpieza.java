//CLASE HIJA LIMPIEZA
package GestionPagos;

public class Limpieza extends Personal {
	int habitaciones;
	//constructor
	public Limpieza(String nombre, String apellido, int edad, String cedula, String genero, int habitaciones, int sueldoBase) {
		super(nombre, apellido, edad, cedula, genero, habitaciones, sueldoBase);
		this.habitaciones = habitaciones;
	}
	//metodos getters y setter para obtener el valor de habitciones limpiadas x el perosnal de limpiea
	public int getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}
	
@Override
public double calcularSueldo() {
    return 350+(350 * 0.10 * habitaciones);
}
}
