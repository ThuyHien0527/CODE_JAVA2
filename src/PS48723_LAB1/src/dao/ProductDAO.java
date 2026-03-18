package dao;
import java.util.Scanner;
import entity.*;
public class ProductDAO {
	Scanner s=new Scanner(System.in);
public void NewProduct() {
	String id;
	do {
		System.out.println("Nhap ID: ");
		id=s.nextLine()
	}while(this.setID(id));
	System.out.println("Nhap name: ")
	;
	
}
}

