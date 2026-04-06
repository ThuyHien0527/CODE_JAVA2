package danhsach;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class mainEmployee {
	public static void main(String[] args) {
     List<Employee> ds=new ArrayList<Employee>();
     
     ds.add(new Employee(1, "Thúy Hiền", 12000000));
     ds.add(new Employee(2, "Gia Bỏa", 18000000));
     ds.add(new Employee(3, " Mai Anh", 25000000));
     ds.add(new Employee(4, "Anh Cường", 14500000));
     ds.add(new Employee(5, "Hoàng Phước", 20000000));
     ds.add(new Employee(6, "Quỳnh Trâm", 16000000));
     ds.add(new Employee(7, "Đăng Khoa", 10000000));
     ds.add(new Employee(8, "An Hòa", 22000000));
	
            
        System.out.println("Nhân viên lương >= 15 triệu: ");
        ds.stream()
            .filter(e -> e.getSalary() >= 15_000_000)
            .forEach(System.out::println);

        System.out.println("Lương giảm dần: ");
        ds.stream()
            .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
            .forEach(System.out::println);

        System.out.println("Danh sách chỉ chứa tên (List<String>): ");
        List<String> employeeNames = ds.stream()
            .map(Employee::getName) 
            .collect(Collectors.toList());
        System.out.println(employeeNames);
        
        long countA = ds.stream()
            .filter(e -> e.getName().toUpperCase().startsWith("A"))
            .count();
        System.out.println("\nSố nhân viên có tên bắt đầu bằng chữ 'A': " + countA);
    }
}

