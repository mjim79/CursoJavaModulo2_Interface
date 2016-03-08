package cursojavamodulo2;

public class Cuadrado extends Rectangulo {

	private double lado;
	
	public Cuadrado(Punto p, double lado) {
		super(p, lado, lado);
		this.p = p;
		this.lado = lado;
	}
	
	
	public double area() {
		return lado*lado;
	}
	
}
