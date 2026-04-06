package sinhvien;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
	private List<Student> list = new ArrayList<Student>();

    public void themSinhVien(String id, String name, double gpa) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Lỗi: ID sinh viên không được để trống!");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Lỗi: Tên sinh viên không được để trống!");
        }
        
        if (gpa < 0 || gpa > 4) {
            throw new IllegalArgumentException("Lỗi: GPA phải nằm trong khoảng từ 0 đến 4!");
        }

        Student sv = new Student(id, name, gpa);
        list.add(sv);
        System.out.println("Thêm sinh viên thành công!");
    }

    public void hienThiDanhSach() {
        if (list.isEmpty()) {
            System.out.println("Danh sách sinh viên đang trống.");
            return;
        }
        System.out.println("--- DANH SÁCH SINH VIÊN ---");
        for (Student sv : list) {
            sv.inThongTin();
        }
    }
}

