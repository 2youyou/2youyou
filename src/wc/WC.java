package wc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class WC {

	
	public String filereader() {
		FileReader fr;
		String s = "";
        String getfile = "";
		try {
			fr = new FileReader("F:\\2youyou\\demo.txt");
	        BufferedReader br=new BufferedReader(fr);
	        while((getfile = br.readLine())!=null){
	            s+=(getfile)+"\n";
	        }
	        br.close();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return s;
	}
	
	public long l() {
		return 0;

		
     }
	
	
	
	public static void main(String[] args) {
		new WC().l();
		System.out.println(new WC().l());
		
	}
}
