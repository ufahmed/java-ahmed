package container;
import java.util.Comparator;
public class NotesComparator implements Comparator<Note> {
    @Override
    public int compare(Note n1, Note n2) {
        return Float.compare(n1.getValue(), n2.getValue());
    }
}