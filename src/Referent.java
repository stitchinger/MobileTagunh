
public class Referent extends Person{
	private String firma;
	private Workshop workshop;
	
	public Referent(String name, String email, String firma, Workshop workshop){
		super(name, email);
		this.firma = firma;
		this.workshop = workshop;
	}
	
	
}
