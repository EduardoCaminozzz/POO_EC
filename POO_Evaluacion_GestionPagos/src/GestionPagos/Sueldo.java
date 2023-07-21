package GestionPagos;

public abstract class Sueldo {
	protected double baseSueldo;
	
	public abstract double calcularSueldo();
	public  double getBaseSueldo() {
		return baseSueldo;
	}
}
