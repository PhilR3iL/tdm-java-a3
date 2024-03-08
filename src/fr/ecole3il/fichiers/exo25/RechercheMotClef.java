package fr.ecole3il.fichiers.exo25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RechercheMotClef {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Demander à l'utilisateur le nom du fichier
		System.out.println("Entrez le nom du fichier dans lequel vous souhaitez rechercher le mot-clé :");
		String fileName = scanner.nextLine();

		// Demander à l'utilisateur le mot-clé à rechercher
		System.out.println("Entrez le mot-clé que vous souhaitez rechercher :");
		String keyword = scanner.nextLine();

		// Lire le fichier et rechercher le mot-clé
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
			String line;
			int lineNumber = 0;

			while ((line = bufferedReader.readLine()) != null) {
				lineNumber++;
				if (line.contains(keyword)) {
					System.out.println("Mot-clé trouvé à la ligne " + lineNumber + " : " + line);
				}
			}

		} catch (IOException e) {
			System.out.println("Une erreur s'est produite lors de la lecture du fichier : " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
