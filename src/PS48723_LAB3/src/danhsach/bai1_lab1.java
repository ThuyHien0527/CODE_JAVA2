package danhsach;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class bai1_lab1 {
	public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Thúy Hiền", "Gia Bảo", "Hoàng Phước", "Mai Anh", "An Hòa", "Văn Duy", "Anh Cường", "Đức Phát", "Quỳnh Trâm", "Đăng Khoa"));

      
        System.out.println("Toàn bộ danh sách: ");
        names.forEach(name -> System.out.println(name));

        System.out.println("Tên có độ dài > 5: ");
        names.stream()
             .filter(name -> name.length() > 5)
             .forEach(name -> System.out.println(name));

        System.out.println("Sắp xếp từ A-Z: ");
        names.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        names.forEach(name -> System.out.println(name));

        System.out.println("Sắp xếp theo độ dài tăng dần: ");
        names.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        names.forEach(name -> System.out.println(name));
    }
}

