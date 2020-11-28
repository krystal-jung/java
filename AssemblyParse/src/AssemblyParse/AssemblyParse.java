package AssemblyParse;

public class AssemblyParse {

	public static void main(String[] args) {
		String a = "10";
		byte b =Byte.parseByte(a);
		short s = Short.parseShort(a);
		int i = Integer.parseInt(a);
		System.out.println("b="+b+";s="+s+";i="+i);
		
		float f = Float.parseFloat(a);
		double d = Double.parseDouble(a);
		System.out.println("f="+f+";i="+d);
		

	}

}
