package sinhvien;

import java.util.ArrayList;
import java.util.List;

public class main_sinhvien {
	public static void main(String[] args) {
        List<Student> list= new ArrayList<Student>();
        list.add(new Student("01", "Mai Anh", StudentType.REGULAR));
        list.add(new Student("02", "Thúy Hiền", StudentType.PART_TIME));
        list.add(new Student("03", "Gia Bảo", StudentType.INTERNATIONAL));
        list.add(new Student("04", "Hoàng Phước", StudentType.REGULAR));
        list.add(new Student("05", "An Hòa", StudentType.PART_TIME));
        list.add(new Student("06", "Quỳnh Trâm", StudentType.INTERNATIONAL));

     
        System.out.println("DANH SÁCH TOÀN BỘ SINH VIÊN");
        for (Student s : list) {
            System.out.println(s);
        }

        System.out.println("LOẠI SINH VIÊN: ");
        
        for (StudentType type : StudentType.values()) {
            int count = 0;
            System.out.println("loại: " + type);
            
            for (Student s : list) {
                if (s.getType() == type) {
                    System.out.println("   " + s);
                    count++;
                }
            }
            System.out.println("Số lượng: " + count);
        }
    }
}
