//CLASE HIJA DOCENTE
package GestionPagos;

public class Docente extends Personal{
	protected int asignatura;

	
	public Docente(String nombre, String apellido, int edad, String cedula, String genero,int asignatura, int sueldoBase) {
		super(nombre,apellido,edad,cedula,genero,asignatura,sueldoBase);
		this.asignatura=asignatura;
		// TODO Auto-generated constructor stub
	}
	//metodos getters y setteres para recibir el valor de las asignaturas del docente
	public int getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(int asignatura) {
		this.asignatura = asignatura;
	}
	
	//metodo que calcula el sueldo del docente 

@Override
public double calcularSueldo() {
    return 400+(400 * 0.2 * asignatura);
}

}
