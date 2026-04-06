package bai1;
import java.io.*;
import java.util.*;

public class lab5_bai1 {
	    public static void main(String[] args) {
	        String fileName = "sinhvien.txt";

	        List<String> danhSach = Arrays.asList(
	                "Nguyen Hoang Phuoc",
	                "Tran Thi Mai Anh",
	                "Le Thuy Hien",
	                "Luong Gia Bao"
	        );

	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
	            for (String ten : danhSach) {
	                writer.write(ten);
	                writer.newLine(); 
	            }
	            System.out.println("Ghi file thành công!");
	        } catch (IOException e) {
	            System.out.println("Lỗi khi ghi file: " + e.getMessage());
	        }

	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            System.out.println("\nNội dung file:");
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.out.println("Lỗi khi đọc file: " + e.getMessage());
	        }
	    }
	}
