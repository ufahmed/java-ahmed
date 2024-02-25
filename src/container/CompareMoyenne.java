package container;

import java.util.Comparator;

public class CompareMoyenne implements Comparator<Etudiant> {
    @Override
    public int compare(Etudiant e1, Etudiant e2) {
        return Float.compare(e1.getMatricule(), e2.getMatricule());
    }
}
