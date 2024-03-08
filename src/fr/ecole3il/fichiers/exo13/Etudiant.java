package fr.ecole3il.fichiers.exo13;

import java.io.Serializable;

public class Etudiant implements Serializable {
	private static final long serialVersionUID = 4079160821797465781L;
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", age=" + age + ", numero=" + numero + "]";
	}
	public Etudiant(String nom, int age, String numero) {
		super();
		this.nom = nom;
		this.age = age;
		this.numero = numero;
	}
	private final String nom;
	private int age;
	private final String numero;
	
}
