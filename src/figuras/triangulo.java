package figuras;

public class triangulo {
private double base;
private double altura;

private double perimetro;
private double area;

public triangulo() {
	
}
public triangulo (double base,double altura) {
	this.base=base;
	this.altura=altura;
}
public void calularPerimetro(Double a){
	Double perimetro = 3*a;
	
}
private void calcularHipotenusa()
{Double hipotenusa=(altura*altura)+(base*base);}
public Double getBase() {
	return base;
}
public void setBase(Double base) {
	this.base = base;
}
public Double getAltura() {
	return altura;
}
public void setAltura(Double altura) {
	this.altura = altura;
}

}
