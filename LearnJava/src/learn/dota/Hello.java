package learn.dota;

import java.io.File;

public class Hello {
	
	public static void main(String[] args) {
		File f1 = new File("/Users/hoty/java-workspace/yoyo.txt");
		
		// swhat is different?
		f1.delete();
	}
}
