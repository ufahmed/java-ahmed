package container;
import java.util.ArrayList;
import java.util.Comparator;

public class Note implements Statisticable, Comparable<Note>{
	private String cours;
    private float note;

    public Note(String cours, float note) {
        this.cours = cours;
        this.note = note;
    }

    public String getCours() {
        return cours;
    }


    
    @Override 
    public float getValue() {
    	return note;
    	
    }
    @Override
    public int compareTo(Note o) {
        return Float.compare(this.getValue(), o.getValue());
    }

}
