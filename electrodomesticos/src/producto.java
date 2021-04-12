
public class producto {

	private int id;
	private String marca;
	private String articulo;
	private float precio;
	private int stock;
	
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
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	producto(){
		
		this.id=0;
		this.marca="";
		this.articulo="";
		this.precio=0;
		this.stock=0;
		
	}
	

	producto(int id, String marca, String articulo, float precio, int stock){
		
		this.id = id;
		this.marca=marca;
		this.articulo=articulo;
		this.precio=precio;
		this.stock=stock;
		
	}
	
	void info() {
		
		System.out.println("—————————————————————————————");
		System.out.println("Identificador: "+this.id);
		System.out.println("Marca: "+this.marca);
		System.out.println("articulo: "+this.articulo);
		System.out.println("Precio: "+this.precio);
		System.out.println("stock: "+this.stock);
	}
	
}
