package seleniumpro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException 
	{
		File f=new File("E://Data.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hi My name is Danish");
		bw.newLine();
		bw.write("I am from gaya");
		bw.close();
	}

}
