package demo;

public class Car extends Vehicle{
	    private double taxRate;     
	    private double registrationFee;

	    public Car(String id, String name, double basePrice, double taxRate, double registrationFee) {
	        super(id, name, basePrice);
	        setTaxRate(taxRate);
	        setRegistrationFee(registrationFee);
	    }

	    public void setTaxRate(double taxRate) {
	        if (taxRate >= 0 && taxRate <= 1) {
	            this.taxRate = taxRate;
	        }
	    }

	    public void setRegistrationFee(double registrationFee) {
	        if (registrationFee >= 0) {
	            this.registrationFee = registrationFee;
	        }
	    }

	    @Override
	    public double finalPrice() {
	        return getBasePrice() + getBasePrice() * taxRate + registrationFee;
	    }
	}

