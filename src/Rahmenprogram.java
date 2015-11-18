
import java.util.ArrayList;
import java.util.Date;

public class Rahmenprogram {

	private String bezeichnung;
	private int nummer;
	private Date date;
	private ArrayList <Person> teilnehmerListe = new ArrayList<Person>();
	
	public Rahmenprogram(String bezeichnung, int nummer, Date date){
		this.bezeichnung = bezeichnung;
		this.nummer = nummer;
		this.date = date;
	}
	
	public void add(Person person) {
		// TODO Auto-generated method stub
		teilnehmerListe.add(person);
	}

}

