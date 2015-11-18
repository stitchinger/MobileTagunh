import java.util.*;


public class Main {
	public static void main(String args[]){
		Workshop w1 = new Workshop("TeamPlay", 123, new Date(2016,11,10));
		Rahmenprogram ra1 = new Rahmenprogram("Musica",452,new Date());
		Referent r1 = new Referent("Dr.Herbert","doc-h@vip.com","MicroApple",w1);
		Teilnehmer t1 = new Teilnehmer("Peter","peter@gmail.com",Status.STUDENT);
		Teilnehmer t2 = new Teilnehmer("Lisa","lisa@gmail.com",Status.NICHTMITGLIED);
		
		t1.subscribeTo(w1);
		t2.subscribeTo(w1);
		t2.subscribeTo(ra1);
	}
}
