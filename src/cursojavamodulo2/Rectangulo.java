package cursojavamodulo2;

public class Rectangulo implements Figura {

	protected Punto p;
	private double ancho;
	private double alto;
	
	public Rectangulo(Punto p, double ancho, double alto) {
		this.p = p;
		this.ancho = ancho;
		this.alto = alto;
	}
	
	@Override
	public double area() {
		return this.ancho * this.alto;
	}

	@Override
	public void pintar() {
		System.out.println("Pintando Rectángulo en la posición (" + p.getX() + "," + p.getY() + ")");
		
	}

	@Override
	public void mover(double dx, double dy) {
		p.setX(p.getX() + dx);
		p.setY(p.getY() + dy);
		System.out.println("Rectángulo movido a la posición (" + p.getX() + "," + p.getY() + ")");
	}
	

}
