package fr.ecole3il.fichiers.exo12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EcritureFichier {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Entrez le chemin du fichier : ");
			if (scanner.hasNextLine()) {
				String cheminFichier = scanner.nextLine();
				System.out.println("Entrez le contenu du fichier :");
				List<String> lignes = new LinkedList<>();
				String ligne = null;
				boolean continuer = true;
				do {
					if (scanner.hasNextLine())
						ligne = scanner.nextLine();
					if (ligne == null || ligne.equalsIgnoreCase("fini"))
						continuer = false;
					else
						lignes.add(ligne);
				} while (continuer);
				try {
					Path chemin = Paths.get(cheminFichier);
					Files.write(chemin, lignes, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}
}
