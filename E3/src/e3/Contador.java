package e3;

public class Contador {
private String nom;
private double sueldo;
private static int cant = 0;
private static double suma = 0;

public Contador(String nom, double sueldo) {
	
	this.nom = nom;
	this.sueldo = sueldo;
	cant++;
	suma += sueldo;
}
public int cantidad() {
	return cant;
}
public double sueldo() {
	return suma;
}
}
