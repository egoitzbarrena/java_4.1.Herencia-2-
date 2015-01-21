
public class Comercial extends Personal {
	
	public Comercial() {
		super();
	}

	private Integer id_comercial;

	public Integer getId_comercial() {
		return id_comercial;
	}

	public void setId_comercial(Integer id_comercial) {
		this.id_comercial = id_comercial;
	}
	
	
	public void trabajar(){
		super.trabajar();
		System.out.println("el comercial trabaja hoy");
	}
}
