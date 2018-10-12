package figuras;

public class triangulo {//triangulo equilatero
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
public double calularPerimetro(){
	this.perimetro = 3*base;
	return this.perimetro;
}
public double calculaArea() {
	this.area=(base*altura)/2;
	return this.area;
}


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
public double getPerimetro() {
	return perimetro;
}
public void setPerimetro(double perimetro) {
	this.perimetro = perimetro;
}
public double getArea() {
	return area;
}
public void setArea(double area) {
	this.area = area;
}
public void setBase(double base) {
	this.base = base;
}
public void setAltura(double altura) {
	this.altura = altura;
}


}
