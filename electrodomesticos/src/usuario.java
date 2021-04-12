
public class usuario {

	private int id;
	private String usuario;
	private String contraseña;
	private boolean rol;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public boolean isRol() {
		return rol;
	}

	public void setRol(boolean rol) {
		this.rol = rol;
	}

	usuario(){
		
		this.id=0;
		this.usuario="";
		this.contraseña="";
		this.rol=false;

	}
	
	usuario(int id, String usuario, String contraseña, boolean rol){
		
		this.id = id;
		this.usuario=usuario;
		this.contraseña=contraseña;
		this.rol=false;

		
	}
	
	void info() {
		
		System.out.println("—————————————————————————————");
		System.out.println("Nº cliente: "+this.id);
		System.out.println("Nombre: "+this.usuario);
		
		

	}
	
}