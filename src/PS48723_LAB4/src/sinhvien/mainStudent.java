package sinhvien;

import java.util.Scanner;

public class mainStudent {
	public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        StudentService service = new StudentService();
        int chon;

        while (true) {
            System.out.println("MENU");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn: ");

            try {
                chon = Integer.parseInt(s.nextLine()); 
                
                if (chon == 1) {
                    System.out.print("Nhập ID: ");
                    String id = s.nextLine();
                    System.out.print("Nhập Tên: ");
                    String name = s.nextLine();
                    System.out.print("Nhập GPA: ");
                    double gpa = Double.parseDouble(s.nextLine());

                    service.themSinhVien(id, name, gpa);

                } else if (chon == 2) {
                    service.hienThiDanhSach();
                } else if (chon == 0) {
                    System.out.println("Tạm biệt!");
                    break;
                } else {
                    System.out.println("Vui lòng chọn từ 0-2.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Lỗi: GPA hoặc lựa chọn phải là con số!");
            } catch (IllegalArgumentException e) {
        
                System.err.println(e.getMessage()); 
            } catch (Exception e) {
                System.out.println("Có lỗi không xác định xảy ra: " + e.getMessage());
            }
        }
    }
}
