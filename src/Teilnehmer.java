
public class Teilnehmer extends Person {
	
	private Status status;
	
	public Teilnehmer(String name, String email, Status status){
		super(name,email);
		this.status = status;
	}
	
	
}
