package sinhvien;

import java.util.Scanner;

public class mainEmployee {
	public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        Scanner s = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- QUẢN LÝ NHÂN VIÊN ---");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Tìm nhân viên theo mã");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(s.nextLine());

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Nhập ID: ");
                        String id = s.nextLine();
                        System.out.print("Nhập tên: ");
                        String name = s.nextLine();
                        System.out.print("Nhập lương: ");
                        double salary = Double.parseDouble(s.nextLine());

                        Employee emp = new Employee(id, name, salary);
                        service.addEmployee(emp); 

                    } catch (DuplicateEmployeeException | InvalidSalaryException e) {
                        
                        System.err.println(e.getMessage());
                    } catch (NumberFormatException e) {
                        System.err.println("Lỗi: Vui lòng nhập số cho lương!");
                    }
                    break;

                case 2:
                    System.out.print("Nhập mã cần tìm: ");
                    String findId = s.nextLine();
                    Employee found = service.findById(findId);
                    if (found != null) {
                        found.inThongTin();
                    } else {
                        System.out.println("Không tìm thấy nhân viên mã: " + findId);
                    }
                    break;
            }
        } while (choice != 0);
    }
}
