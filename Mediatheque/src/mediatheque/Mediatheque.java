package mediatheque;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Mediatheque {

		public static void main(String[]args) {
			
			try {
				//lecture ligne par ligne
				BufferedReader fic=new BufferedReader(new FileReader("D:\\test.txt"));
				String ligne;
				String[] mot;
				
				while ((ligne = fic.readLine()) != null) {
					System.out.println(ligne);
				}
				fic.close();
				
				// lecture mot par mot
				while ((ligne = fic.readLine()) != null) {
					mot = ligne.split("D:\\\\test.txt");
					for (int i = 0; i < mot.length; i++) {
						System.out.println(mot[i]);
					}
				}
			} catch (IOException e) {
				System.out.println("fichier introuvable");
			}
				
		}
	
	
	
	
	
	
	
	
}
