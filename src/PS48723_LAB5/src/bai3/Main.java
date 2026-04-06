package bai3;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Service service = new Service();
	        Scanner s = new Scanner(System.in);

	        service.loadFromFile();

	        int choice;
	        do {
	            System.out.println("\n1. Thêm sinh viên");
	            System.out.println("2. Hiển thị danh sách");
	            System.out.println("0. Thoát");
	            System.out.print("Chọn: ");
	            choice = s.nextInt();
	            s.nextLine();

	            switch (choice) {
	                case 1:
	                    System.out.print("ID: ");
	                    String id = s.nextLine();
	                    System.out.print("Name: ");
	                    String name = s.nextLine();
	                    System.out.print("Score: ");
	                    double score = s.nextDouble();
	                    s.nextLine();

	                    service.addStudent(new Student(id, name, score));
	                    break;

	                case 2:
	                    service.display();
	                    break;
	            }
	        } while (choice != 0);

	        service.saveToFile();
	        System.out.println("Đã lưu dữ liệu!");
	    }
}
