import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PrincipalElectrodomesticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner t = new Scanner(System.in);
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
				System.out.println("1. Introducir nuevo electrodomestico.");
				System.out.println("2. Buscar por marca.");
				System.out.println("3. Borrar electrodomestico.");
				System.out.println("0. Salir.");
				opcion = t.nextInt();

				switch (opcion) {
				case 1:
					Electrodomestico nuevo=new Electrodomestico();
					System.out.println("Introduce los datos del electrodomestico. ");
					System.out.print("Marca: ");
					nuevo.setMarca(t.next());
					System.out.print("Modelo: ");
					nuevo.setModelo(t.next());
					System.out.print("Precio: ");
					nuevo.setPrecio(t.nextFloat());
					System.out.print("Consumo: ");
					nuevo.setConsumo(t.nextFloat());
					query="insert into electrodomestico values ("
							+ "default, "
							+ "'"+nuevo.getMarca()+"',"
							+ "'"+nuevo.getModelo()+"',"
							+ nuevo.getPrecio()+","
							+ nuevo.getConsumo()
							+");";
					System.out.println(query);
					st.executeUpdate(query);
					
					break;
				case 2:
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
				case 3:

					query="select * from electrodomestico;";
					ResultSet rs2=st.executeQuery(query);
					while(rs2.next()) {
						
						
					new Electrodomestico(
								rs2.getInt("id"), 
								rs2.getString("Marca"),
								rs2.getString("Modelo"), 
								rs2.getFloat("Precio"),
								rs2.getFloat("Consumo")).info();
					}
					System.out.println("—————————————————————————————");
					
					System.out.println("¿Que electrodomestico quieres borrar?");
					int ident = t.nextInt();
					query = "delete from electrodomestico where id = "+ident+";";
					st.executeUpdate(query);
					break;
				case 0:
					System.out.println("Hasta luego.");
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
