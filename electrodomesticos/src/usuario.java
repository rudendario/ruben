
public class usuario {

	private int id;
	private String usuario;
	private String contrase�a;
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
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
		this.contrase�a="";
		this.rol=false;

	}
	
	usuario(int id, String usuario, String contrase�a, boolean rol){
		
		this.id = id;
		this.usuario=usuario;
		this.contrase�a=contrase�a;
		this.rol=false;

		
	}
	
	void info() {
		
		System.out.println("�����������������������������");
		System.out.println("N� cliente: "+this.id);
		System.out.println("Nombre: "+this.usuario);
		
		

	}
	
}