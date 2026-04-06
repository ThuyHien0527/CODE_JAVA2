package danhsach;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;    
import java.util.stream.Collectors; 

public class mainStudent {
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

        System.out.println("SV Quốc tế (INTERNATIONAL) có GPA >= 3.2");
        ds.stream()
            .filter(s -> s.getType() == StudentType.INTERNATIONAL) 
            .filter(s -> s.getGpa() >= 3.2)
            .forEach(System.out::println);
        
        System.out.println("Top 3 sinh viên có GPA cao nhất: ");
        List<Student> top3 = ds.stream()
            .sorted(Comparator.comparingDouble(Student::getGpa).reversed())
            .limit(3) 
            .collect(Collectors.toList());

        top3.forEach(System.out::println);
    }
	
}

