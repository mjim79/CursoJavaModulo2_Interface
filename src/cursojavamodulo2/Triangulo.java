package cursojavamodulo2;

public class Triangulo implements Figura {
	
	Punto p;
	double lado1;
	double lado2;
	double lado3;

	public Triangulo(Punto p, double l1, double l2, double l3) {
		this.p = p;
		this.lado1 = l1;
		this.lado2 = l2;
		this.lado3 = l3;
	}
	
	@Override
	public double area() {
		return (lado1 + lado2 + lado3)/2;
	}

	@Override
	public void pintar() {
		System.out.println("Pintando Triángulo en la posición (" + p.getX() + "," + p.getY() + ")");
		
	}

	@Override
	public void mover(double dx, double dy) {
		p.setX(p.getX() + dx);
		p.setY(p.getY() + dy);
		System.out.println("Triángulo movido a la posición (" + p.getX() + "," + p.getY() + ")");
		
	}

}
