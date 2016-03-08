package testfiguras;

import java.util.ArrayList;
import java.util.List;

import cursojavamodulo2.Circulo;
import cursojavamodulo2.Cuadrado;
import cursojavamodulo2.Figura;
import cursojavamodulo2.Punto;
import cursojavamodulo2.Rectangulo;
import cursojavamodulo2.Triangulo;

public class FigurasApp {

	public static void main(String[] args) {

		List<Figura> figuras = new ArrayList<Figura>();
		
		Punto p1 = new Punto(2,2);
		Circulo c1 = new Circulo(p1, 5);
		c1.mover(20, 20);
		figuras.add(c1);
		System.out.println("Area del Círculo: " + c1.area());
		
		Punto p2 = new Punto (10, 10);
		Rectangulo r1 = new Rectangulo(p2, 3,2);
		r1.mover(5 , -2);
		figuras.add(r1);
		System.out.println("Area del Rectángulo: " + r1.area());

		Punto p3 = new Punto (100, 50);
		Triangulo t1 = new Triangulo(p3, 5,6,7);
		t1.mover(-30 , 20);
		figuras.add(t1);
		System.out.println("Area del Triángulo: " + t1.area());
		
		Punto p4 = new Punto (80, 90);
		Cuadrado cuadrado1 = new Cuadrado(p4, 5);
		cuadrado1.mover(50 , -20);
		figuras.add(cuadrado1);
		System.out.println("Area del Cuadrado: " + cuadrado1.area());
		
		Punto p5 = new Punto (150, 180);
		Rectangulo cuadrado2 = new Cuadrado(p5,3);
		cuadrado2.mover(50 , -20);
		figuras.add(cuadrado2);
		System.out.println("Area del Cuadrado: " + cuadrado2.area());
		
		// pintar todas las figuras
		System.out.println("**************Pintando figuras**************");
		for (int i=0; i<=figuras.size() - 1; i++) {
			figuras.get(i).pintar();
		}

	}

}
