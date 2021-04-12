
public class fecha {
	
	int dia;
	int mes;
	int ano;

	public fecha() {
		this.dia = 1;
		this.mes = 1;
		this.ano = 1900;
	}

	fecha(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	fecha(String fecha) {
		String[] separar = fecha.split("/");
		this.dia = Integer.parseInt(separar[0]);
		this.mes = Integer.parseInt(separar[1]);
		this.ano = Integer.parseInt(separar[2]);
	}
	
}
