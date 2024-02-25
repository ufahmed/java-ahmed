package container;

import java.util.ArrayList;
import java.util.Comparator;

public class Etudiant implements Statisticable, Comparable<Note>{
	 private int matricule;
	 private String nom;
	 ArrayList<Note> notes;

	    public Etudiant(int matricule, String nom) {
	        this.matricule = matricule;
	        this.nom = nom;
	        this.notes = new ArrayList<>();
	    }
	    
	    public void addNote(String cours, float note) {
	        Note nouvelleNote = new Note(cours, note);
	        notes.add(nouvelleNote);
	    }
	    public int getMatricule() {
	        return matricule;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public ArrayList<Note> getNotes() {
	        return notes;
	    }
	    
	    @Override
	    public float getValue() {
	        if (notes.isEmpty()) 
	        	return 0;
	        float total = 0;
	        for (Note note : notes) {
	            total += note.getValue();
	        }
	        return total / notes.size();
	    }
	    
	    @Override
	    public int compareTo(Note o) {
	        return Float.compare(this.getValue(), o.getValue());
	    }
	}

