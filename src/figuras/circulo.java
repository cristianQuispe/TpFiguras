package figuras;

public class circulo {
	private double radio;
	private double diametro;
	
	private double perimetro;
    private double area;
	
	public circulo(double radio) {
		this.radio=radio;
		this.diametro=radio*2;
	}
	
	
    public double calcularArea(){
    	
		this.area = 3.14*(radio*radio); 
		return this.area;
}
	public double calularPerimetro(){
		
		this.perimetro= 2*3.14*radio;
		
		return this.perimetro;
	}
	public Double getRadio() {
		return radio;
	}
	public void setRadio(Double radio) {
		this.radio = radio;
	}


	public double getDiametro() {
		return diametro;
	}


	public void setDiametro(double diametro) {
		this.diametro = diametro;
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


	public void setRadio(double radio) {
		this.radio = radio;
	}
	
}
