package sinhvien;

import java.util.ArrayList;
import java.util.List;

public class GenericManager<T> {
	private List<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public void displayAll() {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống.");
        } else {
            for (T item : list) {
                System.out.println(item); 
            }
        }
    }

    public int count() {
        return list.size();
    }
}

