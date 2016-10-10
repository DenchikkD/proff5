package action06;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InpStreamExmaple {
	public static void main(String[] args) throws Exception {
		String file1 = "d:/text1.txt";
		int example = 4;
		////FileInputStream -получает вх.байты из файла
		if (example == 1) {
			InputStream is = new FileInputStream(file1);
			int codeChar = 10;// is.read();
			while (codeChar > -1) {
				codeChar = is.read();//Читает байт данных
	System.out.println(codeChar + " = [" + ((char) codeChar) + "]");
			}System.out.println("****************");
		}
		if (example == 2) {
			byte[] buf = new byte[10];
			InputStream is2 = new FileInputStream(file1);
			is2.read(buf);
			System.out.println(Arrays.toString(buf));
		}
		if (example == 3) {
			InputStream is2 = new FileInputStream(file1);
		int k = is2.available(); //Возвр. оценку числа оставшихся байтов,
//которые можно прочитать без блокирования следующего вызова метода...
			byte[] buf = new byte[k];
			is2.read(buf);
			System.out.println(Arrays.toString(buf));			
		}
		if (example == 4) {
	BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			br.readLine();
			br.read();
		}	}}