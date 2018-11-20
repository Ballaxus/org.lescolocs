package mediatheque;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;



public class Tools {


	public static void writeFile(String filePath, ArrayList<String> valeur)
	{
		BufferedWriter fic;
		try {
			fic=new BufferedWriter(new FileWriter(filePath));
			
			for (Iterator<String> iterator = valeur.iterator(); iterator.hasNext();)
				
			{
				fic.write(iterator.next().toString());
				fic.newLine();
			}
			fic.close();
		}
		catch(IOException e) {
			System.out.println("epic fail"+ e.toString());
		}
		
	}
	
}
