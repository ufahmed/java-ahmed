package container;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

public class Stats {
	
		public static float BestNote(Etudiant e1) {
			return(Collections.max(e1.notes).getValue());
			
			
		}
		
		public static float WorstNote(Etudiant e2) {
			return(Collections.min(e2.notes).getValue());
			
			
		}
		
		
		public static void worstNoteGroupe(ArrayList<Etudiant> e) {
	        Etudiant min = e.get(0);
	        for (Etudiant etudiant : e) {
	            Etudiant minNote = etudiant;
	            if (minNote.getValue() < min.getValue()) {
	                min = minNote;
	            }
	        }

	        System.out.println("Worst student is "+ min.getNom());
	    }
		
		public static void BestNoteGroupe(ArrayList<Etudiant> e) {
	        Etudiant max = e.get(0);
	        for (Etudiant etudiant : e) {
	            Etudiant maxNote = etudiant;
	            if (maxNote.getValue() > max.getValue()) {
	                max = maxNote;
	            }
	        }

	        System.out.println("best student is "+ max.getNom());
	    }
		
		public static float groupMoy(ArrayList<Etudiant> e) {
	        float total = 0;
	        for (Etudiant etudiant : e) {
	            total += etudiant.getValue();
	        }
	        return e.isEmpty() ? 0 : total / e.size();
	    }
	

}
