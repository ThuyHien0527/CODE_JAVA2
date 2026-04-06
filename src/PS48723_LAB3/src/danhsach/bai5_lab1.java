package danhsach;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class bai5_lab1 {
	public static void main(String[] args) {
		  List<Student> ds = new ArrayList<>();
	        ds.add(new Student(1, "Thúy Hiền", StudentType.INTERNATIONAL, 3.8));
	        ds.add(new Student(2, "Gia Bảo", StudentType.REGULAR, 3.5));
	        ds.add(new Student(3, "Mai Anh", StudentType.PART_TIME, 2.8));
	        ds.add(new Student(4, "Anh Cường", StudentType.INTERNATIONAL, 3.1));
	        ds.add(new Student(5, "Hoàng Phước", StudentType.REGULAR, 3.9));
	        ds.add(new Student(6, "Quỳnh Trâm", StudentType.PART_TIME, 3.2));
	        ds.add(new Student(7, "Đăng Khoa", StudentType.INTERNATIONAL, 3.9));
	        ds.add(new Student(8, "An Hòa", StudentType.REGULAR, 3.0));
	        ds.add(new Student(9, "Văn Duy", StudentType.INTERNATIONAL, 3.9));
	        ds.add(new Student(10, "Đức Phát", StudentType.REGULAR, 3.2));
	        
	        Map<StudentType, Long> countByType = ds.stream()
	                .collect(Collectors.groupingBy(Student::getType, Collectors.counting()));

	            System.out.println("Số lượng sinh viên theo loại: ");
	            countByType.forEach((type, count) -> 
	                System.out.println(type + ": " + count + " sinh viên"));

	            Map<StudentType, Double> avgGpaByType = ds.stream()
	                .collect(Collectors.groupingBy(
	                    Student::getType, 
	                    Collectors.averagingDouble(Student::getGpa)
	                ));

	            System.out.println("GPA trung bình theo loại: ");
	            avgGpaByType.forEach((type, avg) -> 
	                System.out.printf("%s: %.2f%n", type, avg));

	            Map.Entry<StudentType, Double> maxAvgEntry = avgGpaByType.entrySet()
	                .stream()
	                .max(Map.Entry.comparingByValue())
	                .orElse(null);

	            System.out.println("Loại sinh viên có GPA trung bình cao nhất: ");
	            if (maxAvgEntry != null) {
	                System.out.printf(">> %s với GPA trung bình là %.2f%n", 
	                    maxAvgEntry.getKey(), maxAvgEntry.getValue());
	            }
	        }
	    }

