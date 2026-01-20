package ExceptionHandling;

import java.io.FileReader;

public class throwss {
	 public static void main(String[] args) throws Exception {
		throwss s = new throwss();
		s.readfile();
	}
	 
	 void readfile() throws Exception {
		 FileReader fr = new FileReader("abc.txt");
	 }
}
