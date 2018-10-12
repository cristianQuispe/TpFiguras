package testCirculo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import figuras.triangulo;

import figuras.circulo;
class test {

	@Test
	void testCalcularArea() {
		circulo miCirculo =new circulo(3);
		
		double vo =miCirculo.calcularArea();
		
	assertEquals(28.6,miCirculo.getArea(),1.0);
	}
	@Test
	void testCalcularPerimetro() {
		circulo miCirculo =new circulo(2);
		
		double vo =miCirculo.calularPerimetro();
		
	assertEquals(12.5,miCirculo.getPerimetro(),1.0);
	}
	@Test
	void testVerDiamtro() {
		circulo miCirculo =new circulo(10.5);
		
		assertEquals(21,miCirculo.getDiametro(),1.0);
	}

}
