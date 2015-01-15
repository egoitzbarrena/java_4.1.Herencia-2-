
public class Main {

	public static void main(String[] args) {
		
		

		Informatico informatico = new Informatico();
		
		informatico.setIdpersonal(001);
		informatico.setNombre("Antonio");
		informatico.setApellido("Martin");
		informatico.setCorreo("antoniom@gmail.com");
		informatico.setEdad(45);
		informatico.setId_informatico(004);
		
		Administrador administrador = new Administrador();
		
		administrador.setIdpersonal(002);
		administrador.setNombre("Odei");
		administrador.setApellido("Lopez");
		administrador.setCorreo("loodei@gmail.com");
		administrador.setEdad(36);
		administrador.setId_admin(001);
		
		Comercial comercial = new Comercial();
		
		comercial.setIdpersonal(003);
		comercial.setNombre("Gorka");
		comercial.setApellido("Tolosa");
		comercial.setCorreo("gtolosa@gmail.com");
		comercial.setEdad(58);
		comercial.setId_comercial(001);
		
		System.out.println("Datos del personal");
		System.out.println("\nDATOS DEL INFORMATICO:");
		System.out.println("ID PERSONAL:" + informatico.getIdpersonal());
		System.out.println("NOMBRE:" + informatico.getNombre());
		System.out.println("APELLIDO:" + informatico.getApellido());
		System.out.println("CORREO:" + informatico.getCorreo());
		System.out.println("EDAD:" + informatico.getEdad());
		System.out.println("ID INFORMATICO:" + informatico.getId_informatico());
		
		System.out.println("\nDATOS DEL ADMINISTRADOR:");
		System.out.println("ID PERSONAL:" + administrador.getIdpersonal());
		System.out.println("NOMBRE:" + administrador.getNombre());
		System.out.println("APELLIDO:" + administrador.getApellido());
		System.out.println("CORREO:" + administrador.getCorreo());
		System.out.println("EDAD:" + administrador.getEdad());
		System.out.println("ID INFORMATICO:" + administrador.getIdpersonal());
		
		System.out.println("\nDATOS DEL COMERCIAL:");
		System.out.println("ID PERSONAL:" + comercial.getIdpersonal());
		System.out.println("NOMBRE:" + comercial.getNombre());
		System.out.println("APELLIDO:" + comercial.getApellido());
		System.out.println("CORREO:" + comercial.getCorreo());
		System.out.println("EDAD:" + comercial.getEdad());
		System.out.println("ID INFORMATICO:" + comercial.getId_comercial());
		
		
		
		
		

	}

}
