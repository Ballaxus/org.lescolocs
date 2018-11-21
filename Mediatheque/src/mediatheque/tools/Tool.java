package mediatheque.tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tool {

	public Tool() {

	}

	/**
	 * Lecture d'un fichier ligne par ligne.
	 * 
	 * @param filePath Le chemin d'accès du fichier à lire.
	 * @return Le fichier à lire.
	 */
	public static ArrayList<String> ReadFile(String filePath) {
		BufferedReader fic;
		ArrayList<String> result = new ArrayList<String>();
		try {
			// Lecture ligne par ligne
			fic = new BufferedReader(new FileReader(filePath));
			String ligne;

			while ((ligne = fic.readLine()) != null) {
				result.add(ligne);
			}

			fic.close();

		} catch (IOException e) {
			System.out.println("Fichier introuvable");
		}

		return result;
	}

	/**
	 * Ecrit dans un fichier à partir de la console, END pour terminer l'écriture.
	 * 
	 * @param filePath Chemin d'accès du fichier à écrire.
	 */
	public static void writeFile(String filePath) {
		System.out.println("Saisir le texte à écrire dans le fichier (END pour terminer):");
		Scanner sc;
		BufferedWriter fic;
		String texte;
		boolean stop = false;

		try {
			fic = new BufferedWriter(new FileWriter(filePath));
			sc = new Scanner(System.in);
			texte = "";

			while (stop == false) {
				texte = sc.nextLine();

				if (texte.compareTo("END") == 0) {
					stop = true;
					break;
				}

				fic.write(texte);
				fic.newLine();
			}

			fic.close();

		} catch (IOException e) {
			System.out.println("Fichier introuvable");
		}
	}
}
