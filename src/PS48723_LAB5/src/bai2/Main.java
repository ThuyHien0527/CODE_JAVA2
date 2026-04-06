package bai2;
import java.io.*;
import java.util.*;

public class Main {
	    public static void main(String[] args) {
	        String fileName = "students.dat";

	        List<Student> danhSach = new ArrayList<>();
	        danhSach.add(new Student("SV01", "Nguyen Van A", 3.5));
	        danhSach.add(new Student("SV02", "Tran Thi B", 3.8));
	        danhSach.add(new Student("SV03", "Le Van C", 2.9));

	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
	            oos.writeObject(danhSach);
	            System.out.println("Ghi danh sách sinh viên thành công!");
	        } catch (IOException e) {
	            System.out.println("Lỗi khi ghi file: " + e.getMessage());
	        }

	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
	            List<Student> dsDoc = (List<Student>) ois.readObject();

	            System.out.println("\nDanh sách sinh viên đọc từ file:");
	            for (Student sv : dsDoc) {
	                System.out.println(sv);
	            }

	        } catch (IOException e) {
	            System.out.println("Lỗi khi đọc file: " + e.getMessage());
	        } catch (ClassNotFoundException e) {
	            System.out.println("Không tìm thấy class: " + e.getMessage());
	        }
	    }
}
