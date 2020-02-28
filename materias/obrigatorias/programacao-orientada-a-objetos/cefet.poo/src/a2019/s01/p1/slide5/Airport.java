package a2019.s01.p1.slide5;

public class Airport {
	
	private String nome;
	
	public static void main(String[] args) {
		
		Airport metropolisAirport = new Airport();
		Helicopter copter = new Helicopter();
		SeaPlane sPlane = new SeaPlane();
		
		metropolisAirport.givePermissionToLand(copter);
		metropolisAirport.givePermissionToLand(sPlane);
		
		Airport novo = new Airport();
		novo.setNome("Santos Dumont");
		

	}
	
	private void givePermissionToLand(Flyer f) {
		f.land();
	}
	
	public void setNome( String nome ) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
}
