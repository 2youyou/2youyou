package wc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;


public class WC {
	
	static String filepath;//�ļ�·��
	FileReader fr;
	BufferedReader br;

	public int l() {
		int countline = 0;
		
		try {
		fr = new FileReader(filepath);
		br = new BufferedReader(fr);
		
			while (br.readLine() != null) {
				countline++;
			}
			br.close();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return countline;
	}
	
	
	public int c() {
		int countchar = 0; 
		String s ="";
		String getfile;
			
		try {
			fr = new FileReader(filepath);
	        BufferedReader br=new BufferedReader(fr);
	        while((getfile = br.readLine())!=null){
	            s+=(getfile);
	        }
	        br.close();
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		countchar=s.length();//�ַ������ȼ�Ϊ�ַ���
		return countchar;
	}
	
	public int w() {
		int countword = 0;
		String s ="";
		String getfile;
			
		try {
			fr = new FileReader(filepath);
	        BufferedReader br=new BufferedReader(fr);
	        while((getfile = br.readLine())!=null){
	            s+=(getfile)+"\n";
	        }
	        br.close();
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		String[] str =s.split(" |\n");//�ÿո��Լ����з����ֵ���
		countword =str.length;
		return countword;
		
		
	}
	


		
	
	public static void main(String[] args) {
		System.out.println("�������ļ�·����");
		Scanner sc = new Scanner(System.in);
		filepath = sc.next();
		new WC().l();
		System.out.println("������"+new WC().l());
		new WC().c();
		System.out.println("�ַ�����"+new WC().c());
		new WC().w();
		System.out.println("��������"+new WC().w());
		
	}
}
