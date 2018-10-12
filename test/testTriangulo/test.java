package testTriangulo;

import static org.junit.jupiter.api.Assertions.*;
import figuras.triangulo;
import org.junit.jupiter.api.Test;

class test {

	@Test
	void testCalcularPerimetro() {
		triangulo miTriangulo =new triangulo(3,5);
		double vo=miTriangulo.calularPerimetro();
		
		assertEquals(9,vo,1.0);
	}
	@Test
	void testCalcularArea() {
		triangulo miTriangulo =new triangulo(4,3);
		double vo=miTriangulo.calculaArea();
		
		assertEquals(6,vo,1.0);
	}
	
}
