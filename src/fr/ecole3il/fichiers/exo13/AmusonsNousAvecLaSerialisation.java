package fr.ecole3il.fichiers.exo13;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AmusonsNousAvecLaSerialisation {

	public static void main(String[] args) {
		Etudiant youpi = new Etudiant("moi", 85, "02351");
		Path chemin = Paths.get("/tmp/superetudiant.bin");
		try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(chemin))){
			oos.writeObject(youpi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Etudiant youpiApresSerialisation = null;
		try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(chemin))){
			youpiApresSerialisation = (Etudiant) ois.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Après sérialisation : " + youpiApresSerialisation);
	}

}
