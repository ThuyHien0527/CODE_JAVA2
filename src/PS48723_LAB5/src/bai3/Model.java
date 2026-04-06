package bai3;

import java.io.Serializable;

public class Model implements Serializable {
	private String id;
    private String name;
    private double score;

    public void Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getScore() { return score; }

    @Override
    public String toString() {
        return id + "," + name + "," + score;
    }

    public static Student fromString(String line) {
        String[] parts = line.split(",");
        return new Student(parts[0], parts[1], Double.parseDouble(parts[2]));
    }
}

