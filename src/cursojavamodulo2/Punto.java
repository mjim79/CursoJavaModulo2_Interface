package cursojavamodulo2;


public class Punto {
    private double x = 0;
    private double y = 0;
    
  public Punto(double x, double y) {
    this.x = x;
	this.y = y;
  }
  public Punto() {
	  //Constructor por defecto
  }
  void mover(double dx, double dy){
    	x+=dx;
    	y+=dy;
  }
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}
}