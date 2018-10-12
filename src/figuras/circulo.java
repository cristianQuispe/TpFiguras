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
}
