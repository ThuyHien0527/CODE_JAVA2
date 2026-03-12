package Slide1;
import java.util.ArrayList;
public class Slide1_Animal {
		public static void main(String[] args) {
			ArrayList<Animal> listAnimal = new ArrayList<Animal>();
			listAnimal.add(new Dog("Lu",3));
			listAnimal.add(new Cat("Na",1));
			for(Animal a : listAnimal) {
				a.eat();
				a.sleep();
				if (a instanceof Dog d) {
					d.keu();
				}else if (a instanceof Cat c) {
					c.keu();
				}
}
}
}