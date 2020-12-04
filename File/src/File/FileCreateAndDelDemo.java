package File;
import java.io.File;
import java.io.IOException;

public class FileCreateAndDelDemo {

	public static void main(String[] args) {
		File file = new File("Hello.txt"); 
		File dir = new File("c://creatDir");
		System.out.println("�ļ��Ƿ���ڣ�" + file.exists());
		System.out.println("�ļ��з���ڣ�" + dir.exists());
		
		if (!file.exists()) {
			try {
				file.createNewFile(); 
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		if (!dir.exists()) {
			dir.mkdir(); 
		}
		System.out.println("�ļ��Ƿ���ڣ�" + file.exists());
		System.out.println("�ļ��з���ڣ�" + dir.exists());
		System.out.println("�ļ��ľ���·���ǣ�" + file.getAbsolutePath());
		System.out.println("�ļ��еľ���·���ǣ�" + dir.getAbsolutePath());
		
		System.out.println("�ļ��Ƿ���ڣ�" + file.exists());
	}
}
