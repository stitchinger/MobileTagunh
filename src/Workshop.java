import java.util.*;

public class Workshop {

	private String bezeichnung;
	private int nummer;
	private Date date;
	private ArrayList <Person> teilnehmerListe = new ArrayList<Person>();
	
	public Workshop(String bezeichnung, int nummer, Date date){
		this.bezeichnung = bezeichnung;
		this.nummer = nummer;
		this.date = date;
	}
	
	public void add(Person teilnehmer) {
		// TODO Auto-generated method stub
		teilnehmerListe.add(teilnehmer);
	}

}
