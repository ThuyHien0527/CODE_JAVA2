package bai3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Service {
	 private List<Student> stu =new ArrayList<Student>();
	    private final String FILE_NAME = "students.txt";

	    public void loadFromFile() {
	        File file = new File(FILE_NAME);
	        if (!file.exists()) return;

	        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                stu.addAll(Student.fromString(line));
	            }
	        } catch (IOException e) {
	            System.out.println("Lỗi đọc file!");
	        }
	    }
	    
	    public void saveToFile() {
	        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
	            for (Student s : stu) {
	                bw.write(s.toString());
	                bw.newLine();
	            }
	        } catch (IOException e) {
	            System.out.println("Lỗi ghi file!");
	        }
	    }

	    public void addStudent(Student s) {
	        stu.add(s);
	    }
	    
	    public void display() {
	        for (Student s : stu) {
	            System.out.println(s);
	        }
	    }
}
