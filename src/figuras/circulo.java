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
	
	
    public void calcularArea(Double a){
    	
		this.area = 3.14*(a*a); 
}
	public void calularPerimetro(Double a){
		
		this.perimetro= 2*3.14*a;
	}
	public Double getRadio() {
		return radio;
	}
	public void setRadio(Double radio) {
		this.radio = radio;
	}
}
