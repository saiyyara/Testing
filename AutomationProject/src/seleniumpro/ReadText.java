package seleniumpro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {

	public static void main(String[] args) throws IOException 
	{
		File f=new File("E://Data.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String str="";
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
	}

}
