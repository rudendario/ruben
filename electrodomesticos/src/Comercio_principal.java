import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Comercio_principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t=new Scanner(System.in);

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String base = "jdbc:mysql://localhost:3306/programacion?useSSL=false";
			String usuario = "root";
			String pass = "root";
			Connection con = DriverManager.getConnection(base, usuario, pass);

			Statement st = con.createStatement();
			String query = "create table if not exists electrodomestico (" + "id int auto_increment primary key, "
					+ "marca varchar(255), " + "modelo varchar(255), " + "precio float," + "consumo float );";
			st.executeUpdate(query);

			int opcion;

			do {
				//leo las opciones que desea el cliente. Registo o identificarse.
				System.out.println("Bienvenido a nuestra tienda\n"
						+ "Indica que deseas hacer:\n"
						+ "\t a. Identificarme\n"
						+ "\t b. Registrase\n"
						+ "\t c. Salir");
				
				opcion = t.next().charAt(0);
				switch (opcion) {
				case 'a':
				case 'A':
					usuario nuevo=new usuario();
					System.out.println("Introduce tus datos de acceso. ");
					System.out.print("Nombre: ");
					nuevo.setUsuario(t.next());
					System.out.print("Contraseña: ");
					nuevo.setContraseña(t.next());
					query="insert into electrodomestico values ("
							+ "default, "
							+");";
					System.out.println(query);
					st.executeUpdate(query);
					
					break;
				case 'B':
				case 'b':					
					System.out.println("¿Qué marca quieres buscar?");
					String marca=t.next();
					query="select * from electrodomestico where marca = '"+marca+"';";
					ResultSet rs=st.executeQuery(query);
					while(rs.next()) {
						
						
					new Electrodomestico(
								rs.getInt("id"), 
								rs.getString("Marca"),
								rs.getString("Modelo"), 
								rs.getFloat("Precio"),
								rs.getFloat("Consumo")).info();
					}
					System.out.println("—————————————————————————————");
					break;

				case 'C':
				case 'c':					System.out.println("Hasta luego.");
					break;
				default:
					System.out.println("Opcion incorrecta.");

				}

			} while (opcion != 0);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("La que has liado. Tu ordenador se autodestruirá.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Ha habido un fallo al conectar con la base de datos.");
		}		

	}

}
