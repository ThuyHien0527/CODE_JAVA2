package bai3;
import java.util.ArrayList;
import java.util.List;

public class GenericManager<T> {
	private ArrayList<T> list = new ArrayList<>();

    public void add(T obj) {
        list.add(obj);
    }

    public void display() {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public int size() {
        return list.size();
    }
	}



