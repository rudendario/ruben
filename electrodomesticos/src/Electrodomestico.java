
public class Electrodomestico {

	private int id;
	private String marca;
	private String modelo;
	private float precio;
	private float consumo;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public float getPrecio() {
		return precio;
	}



	public void setPrecio(float precio) {
		this.precio = precio;
	}



	public float getConsumo() {
		return consumo;
	}



	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}


	Electrodomestico(){
		
		this.id=0;
		this.marca="";
		this.modelo="";
		this.precio=0;
		this.consumo=0;
		
	}
	

	Electrodomestico(int id, String marca, String modelo, float precio, float consumo){
		
		this.id = id;
		this.marca=marca;
		this.modelo=modelo;
		this.precio=precio;
		this.consumo=consumo;
		
	}
	
	void info() {
		
		System.out.println("—————————————————————————————");
		System.out.println("Identificador: "+this.id);
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Precio: "+this.precio);
		System.out.println("Consumo: "+this.consumo);
	}
	

}
