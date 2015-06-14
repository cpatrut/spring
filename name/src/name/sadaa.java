package name;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class sadaa {
	public static void main(String[] args){
		File f=new File("test.jsp");
		System.out.println("<B>"+f.getAbsolutePath()+"</b>");
		
		String html="<div><h1>this is test html</h1></div>";
		try{
			BufferedWriter bw=new BufferedWriter(new FileWriter(f));
			bw.write(html);
			bw.close();
			System.out.println("succes");
			}catch(IOException e){
				System.out.println("not succes");
				e.printStackTrace();
			}
	}
}
