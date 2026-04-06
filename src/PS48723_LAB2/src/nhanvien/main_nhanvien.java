package nhanvien;

import java.util.Scanner;

public class main_nhanvien {
	  public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        EmployeeService service = new EmployeeService();

	        int choice;

	        do {
	            System.out.println("MENU");
	            System.out.println("1. Thêm nhân viên");
	            System.out.println("2. Hiển thị danh sách");
	            System.out.println("3. Tìm nhân viên theo ID");
	            System.out.println("4. Cập nhật lương");
	            System.out.println("0. Thoát");
	            System.out.print("Chọn: ");
	            choice = s.nextInt();
	            s.nextLine(); 

	            switch (choice) {
	                case 1:
	                    System.out.print("Nhập ID: ");
	                    String id = s.nextLine();

	                    System.out.print("Nhập tên: ");
	                    String name = s.nextLine();

	                    System.out.print("Nhập lương: ");
	                    double salary = s.nextDouble();

	                    service.addEmployee(new Employee(id, name, salary));
	                    System.out.println("Thêm thành công!");
	                    break;

	                case 2:
	                    service.displayAll();
	                    break;

	                case 3:
	                    System.out.print("Nhập ID cần tìm: ");
	                    String searchId = s.nextLine();

	                    Employee e = service.findById(searchId);
	                    if (e != null) {
	                        System.out.println("Tìm thấy: " + e);
	                    } else {
	                        System.out.println("Không tìm thấy!");
	                    }
	                    break;

	                case 4:
	                    System.out.print("Nhập ID cần cập nhật: ");
	                    String updateId = s.nextLine();

	                    System.out.print("Nhập lương mới: ");
	                    double newSalary = s.nextDouble();

	                    if (service.updateSalary(updateId, newSalary)) {
	                        System.out.println("Cập nhật thành công!");
	                    } else {
	                        System.out.println("Không tìm thấy nhân viên!");
	                    }
	                    break;

	                case 0:
	                    System.out.println("Thoát chương trình!");
	                    break;

	                default:
	                    System.out.println("Chọn sai!");
	            }

	        } while (choice != 0);
	    }
}
