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
private double calculaArea() {
	this.area=this.base*this.altura;
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

}
