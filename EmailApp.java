package EmailApp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Sana", "Chandanshive");
		
		em1.setalernateEmail("sana.Chandanshive@gmail.com");
			System.out.println("alternateEmail: " + em1.getalternateEmail());
			
			System.out.println(em1.showInfo());
		
		
	}

}
