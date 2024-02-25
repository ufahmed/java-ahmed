package container;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
	public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant(1, "ahmed sellami");
        Etudiant etudiant2 = new Etudiant(2, "yessine farhat");

        etudiant1.addNote("Math", 85);
        etudiant1.addNote("Physics", 75);
        etudiant1.addNote("Biology", 90);

        etudiant2.addNote("Math", 70);
        etudiant2.addNote("Physics", 80);
        etudiant2.addNote("Biology", 65);

        ArrayList<Etudiant> students = new ArrayList<>();
        students.add(etudiant1);
        students.add(etudiant2);

        Stats.BestNoteGroupe(students);
        Stats.worstNoteGroupe(students);
        float classAverage = Stats.groupMoy(students);
        System.out.println("Class average: " + classAverage);




        for (Etudiant student : students) {
            System.out.println("Matricule: " + student.getMatricule() + ", Nom: " + student.getNom());
        }
        System.out.println("Par moyenne");
        Collections.sort(students, new CompareMoyenne());
        for (Etudiant student : students) {
            System.out.println("Moy: " + student.getNom());
        }

        System.out.println("Par nom");
        Collections.sort(students, new CompareNom());

        for (Etudiant student : students) {
            System.out.println( "Nom: " + student.getNom());
        }





    }

}

