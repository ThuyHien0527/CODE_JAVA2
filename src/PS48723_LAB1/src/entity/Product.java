package entity;

public class Product {
private String id;
private String name;
private double basePrice;
public Product() {}
public Product(String id, String name, double basePrice) {
	super();
	this.id = id;
	this.name = name;
	this.basePrice = basePrice;
}
public String getId() {
	return id;
}
public boolean setId(String id) {
	if(id !="") {
	this.id = id;
	return true;
	}
return false;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBasePrice() {
	return basePrice;
}
public boolean setbasePrice(double basePrice) {
	if(basePrice >=0) {
	this.basePrice = basePrice;
	return true;
}
return false;
}
public double finalPrice() {
	return this.basePrice;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", basePrice=" + basePrice + ",finalPrice " + "]";
}
}
