package demo;
import java.util.ArrayList;


public class MainDemo {
	    public static void main(String[] args) {
	        ArrayList<Vehicle> list = new ArrayList<>();

	        list.add(new Vehicle("V1", "Xe dap", 100));
	        list.add(new Vehicle("V2", "Xe may", 2000));
	        list.add(new Car("C1", "Oto A", 20000, 0.1, 500));
	        list.add(new Car("C2", "Oto B", 30000, 0.15, 700));
	        list.add(new Vehicle("V3", "Xe dien", 1500));

	        for (Vehicle v : list) {
	            System.out.println(v);
	        }

	        Vehicle max = list.get(0);
	        for (Vehicle v : list) {
	            if (v.finalPrice() > max.finalPrice()) {
	                max = v;
	            }
	        }

	        System.out.println("Phuong tien co gia cao nhat: " + max);
	    
	}
}
