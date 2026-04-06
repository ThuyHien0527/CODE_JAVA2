package quanly;
import java.util.*;

public class Document {
	private String id;
    private String name;
    private ArrayList<Copy> copies = new ArrayList<>();

    public Document(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public List<Copy> getCopies() {
        return copies;
    }

    public void addCopy(Copy c) {
        copies.add(c);
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return "Document ID: " + id + " | Name: " + name;
    }  
}