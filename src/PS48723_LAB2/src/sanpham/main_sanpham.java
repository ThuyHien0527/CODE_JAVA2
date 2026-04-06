package sanpham;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main_sanpham {
	public static void main(String[] args) {
		List<Product> ds=new ArrayList<Product>();

		ds.add(new Product("01", "Bánh", 10, ProductCategory.FOOD));
		ds.add(new Product("02", "Sữa", 15, ProductCategory.FOOD));
		ds.add(new Product("03", "TV", 500, ProductCategory.ELECTRONIC));
		ds.add(new Product("04", "Laptop", 1000, ProductCategory.ELECTRONIC));
		ds.add(new Product("05", "Áo", 20, ProductCategory.CLOTHING));
		ds.add(new Product("06", "Quần", 25, ProductCategory.CLOTHING));
		ds.add(new Product("07", "Tai nghe", 50, ProductCategory.ELECTRONIC));
		ds.add(new Product("08", "Giày", 40, ProductCategory.CLOTHING));
		
		 System.out.println("DANH SÁCH SẢN PHẨM: ");
	        for (Product p : ds) {
	            System.out.println(p);
	        }
	        Map<ProductCategory, Integer> countMap = new HashMap<>();

	        for (ProductCategory c : ProductCategory.values()) {
	            countMap.put(c, 0);
	        }

	        for (Product p : ds) {
	            countMap.put(p.getCategory(), countMap.get(p.getCategory()) + 1);
	        }

	        Map<ProductCategory, Double> sumMap = new HashMap<>();

	        for (ProductCategory c : ProductCategory.values()) {
	            sumMap.put(c, 0.0);
	        }

	        for (Product p : ds) {
	            sumMap.put(
	                p.getCategory(),
	                sumMap.get(p.getCategory()) + p.getPrice()
	            );
	        }

	        System.out.println("SỐ LƯỢNG THEO LOẠI: ");
	        for (Map.Entry<ProductCategory, Integer> entry : countMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	        System.out.println("TỔNG GIÁ TRỊ THEO LOẠI: ");
	        for (Map.Entry<ProductCategory, Double> entry : sumMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
	}
	

