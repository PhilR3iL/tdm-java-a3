package fr.ecole3il.fichiers.exo11;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LectureFichierLignes {

	public static int lireEtCompterLignes(Path fichier) {
		int lignes = 0;
		try (BufferedReader br = Files.newBufferedReader(fichier)) {
			while (br.readLine() != null)
				lignes++;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lignes;
	}

	public static void main(String[] args) {
		System.out.println(lireEtCompterLignes(Paths.get("/tmp/monfichier.txt")));
	}
}
