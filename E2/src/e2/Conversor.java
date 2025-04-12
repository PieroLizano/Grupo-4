package e2;

public class Conversor {
	
private double celsius;
private int km, seg;

public Conversor(double celsius) {
	
	this.celsius = celsius;
}
public Conversor(int km) {
	
	this.km = km;
}
public Conversor(int seg, boolean flag) {
	
	this.seg = seg;
}
public double Convertir(double celsius) {
	return celsius*9/5 + 32;
}
public double Convertir(int  km) {
	return km*0.621371;
}
public String Convertir(int seg, boolean abc) {
	int min = seg/60; //minutos
	int residuo = seg%60; //segundos restantes
	return min + " minuto(s) " + " y " + residuo + " segundos"; 
}
}
