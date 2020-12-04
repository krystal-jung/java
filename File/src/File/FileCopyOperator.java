package File;


import java.io.*;

public class FileCopyOperator {

    public static void main(String args[]) throws IOException {
        String byteFilename = "byteFile.dat";
        String copyFilename = "copyByteFile.dat";
        FileInputStream fin = new FileInputStream(byteFilename);
        FileOutputStream fout = new FileOutputStream(copyFilename, false);
        byte[] buffer = new byte[512];          //字节缓冲区
        int count = 0;
        do {
            count = fin.read(buffer);            //读取输入流
            if (count != -1) {
                fout.write(buffer);               //写入输出流
            }
        } while (count != -1);
        fin.close();                               //关闭输入流
        fout.close();                              //关闭输出流
        System.out.println("Copyfile from " + byteFilename + " to " + copyFilename);
    }
}
