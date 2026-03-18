package demo;

public class Vehicle {
	    private String id;
	    private String name;
	    private double basePrice;

	    
	    public Vehicle(String id, String name, double basePrice) {
	        setId(id);
	        setName(name);
	        setBasePrice(basePrice);
	    }

	   
	    public String getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getBasePrice() {
	        return basePrice;
	    }

	    
	    public void setId(String id) {
	        if (id != null && !id.isEmpty()) {
	            this.id = id;
	        }
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setBasePrice(double basePrice) {
	        if (basePrice >= 0) {
	            this.basePrice = basePrice;
	        }
	    }

	    
	    public double finalPrice() {
	        return basePrice;
	    }

	    public String toString() {
	        return id + " - " + name + " - Final Price: " + finalPrice();
	    }
	}

