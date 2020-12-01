package Fee;

public class Fee {

	public static void main(String[] args) {
		int calltime = 210;
		float callcharge = 20.0f;
		if(calltime>=0) {
			if(calltime<=100) {
				System.out.println("电话费用是"+callcharge+"元");
			}
			else {
				callcharge=callcharge+(calltime-100)*0.15f;
				System.out.println("电话费用是"+callcharge+"元");
			}
		}
		
				
	}

}
