package File;


import java.io.*;

public class FileCopyOperator {

    public static void main(String args[]) throws IOException {
        String byteFilename = "byteFile.dat";
        String copyFilename = "copyByteFile.dat";
        FileInputStream fin = new FileInputStream(byteFilename);
        FileOutputStream fout = new FileOutputStream(copyFilename, false);
        byte[] buffer = new byte[512];          //�ֽڻ�����
        int count = 0;
        do {
            count = fin.read(buffer);            //��ȡ������
            if (count != -1) {
                fout.write(buffer);               //д�������
            }
        } while (count != -1);
        fin.close();                               //�ر�������
        fout.close();                              //�ر������
        System.out.println("Copyfile from " + byteFilename + " to " + copyFilename);
    }
}
