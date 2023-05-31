package com.lec.ex01_input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadMain2 {

	public static void main(String[] args) throws Exception {
		//3. read(byte[], int off, int len) : 입력스트림으로부터 주어진 byte배열을 주어진 배열의 off바이트에서
	 	//len바이트 수만큼 읽어서 리턴
		InputStream is = new FileInputStream("src/com/lec/ex01_input/news.txt");
		int readByte;
		String data = "";
		byte[] readBytes = new byte[3];
		while(true) {
			readByte = is.read(readBytes);
			if(readByte == -1) break;
			data += new String(readBytes,0,readByte);
		}
		System.out.println(data);
		is.close();
	}

}
