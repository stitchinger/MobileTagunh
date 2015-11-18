
public class Person {
	private String name;
	private String email;
	
	public Person(String Name, String email){
		this.name = name;
		this.email = email;
	}
	
	public void subscribeTo(Workshop workshop){
		workshop.add(this);
	}
	
	public void subscribeTo(Rahmenprogram workshop){
		workshop.add(this);
	}
}
