package danhsach;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class bai3_lab1 {
		public static void main(String[] args) {
	        List<Employee> ds = new ArrayList<>();
	        ds.add(new Employee(1, "Thúy Hiền", 12000000));
	        ds.add(new Employee(2, "Gia Bảo", 18000000));
	        ds.add(new Employee(3, "Mai Anh", 25000000));
	        ds.add(new Employee(4, "Anh Cường", 14500000));
	        ds.add(new Employee(5, "Hoàng Phước", 20000000));
	        ds.add(new Employee(6, "Quỳnh Trâm", 16000000));
	        ds.add(new Employee(7, "Đăng Khoa", 10000000));
	        ds.add(new Employee(8, "An Hòa", 22000000));

	        // 1. Tổng lương
	        double totalSalary = ds.stream()
	            .mapToDouble(Employee::getSalary)
	            .sum();

	        // 2. Lương trung bình
	        double avgSalary = ds.stream()
	            .mapToDouble(Employee::getSalary)
	            .average()
	            .orElse(0.0);

	        // 3. Nhân viên lương cao nhất
	        Employee topPaid = ds.stream()
	            .max(Comparator.comparingDouble(Employee::getSalary))
	            .orElse(null); // Thêm dấu ; ở đây nếu chưa có

	        // --- In kết quả ---
	        System.out.println("THỐNG KÊ LƯƠNG NHÂN VIÊN");
	        System.out.printf("1. Tổng lương toàn công ty  : %,.0f VNĐ%n", totalSalary);
	        System.out.printf("2. Lương trung bình nhân viên: %,.0f VNĐ%n", avgSalary);
	        System.out.print("3. Nhân viên có lương cao nhất: ");
	        
	        if (topPaid != null) {
	            System.out.println("\n   >> " + topPaid.toString());
	        } else {
	            System.out.println("\n   >> Không có dữ liệu.");
	        }
	    }
	}
