package Fee;

public class Fee {

	public static void main(String[] args) {
		int calltime = 210;
		float callcharge = 20.0f;
		if(calltime>=0) {
			if(calltime<=100) {
				System.out.println("�绰������"+callcharge+"Ԫ");
			}
			else {
				callcharge=callcharge+(calltime-100)*0.15f;
				System.out.println("�绰������"+callcharge+"Ԫ");
			}
		}
		
				
	}

}
