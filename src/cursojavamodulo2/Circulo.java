package cursojavamodulo2;

public class Circulo implements Figura {
	// atributos de la clase
	private Punto p;
	private double radio;
	
	// constructor
	public Circulo(Punto punto, double radio) {
		this.p = punto;
		this.radio=radio;
	}
	
	// implementación de métodos del interfaz
	@Override
	public double area() {
		return 3.14 * PI * radio;
	}

	@Override
	public void pintar() {
		System.out.println("Pintando Círculo en la posición (" + p.getX() + "," + p.getY() + ")");
		
	}

	@Override
	public void mover(double dx, double dy) {
		p.setX(p.getX() + dx);
		p.setY(p.getY() + dy);
		System.out.println("Círulo movido a la posición (" + p.getX() + "," + p.getY() + ")");
	}
}
