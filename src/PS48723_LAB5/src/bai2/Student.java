package bai2;

import java.io.Serializable;

public class Student implements Serializable {
	    private static final long serialVersionUID = 1L;

	    private String maSV;
	    private String ten;
	    private double gpa;

	    public Student(String maSV, String ten, double gpa) {
	        this.maSV = maSV;
	        this.ten = ten;
	        this.gpa = gpa;
	    }
	    
	    public String getMaSV() {
	        return maSV;
	    }

	    public void setMaSV(String maSV) {
	        this.maSV = maSV;
	    }

	    public String getTen() {
	        return ten;
	    }

	    public void setTen(String ten) {
	        this.ten = ten;
	    }

	    public double getGpa() {
	        return gpa;
	    }

	    public void setGpa(double gpa) {
	        this.gpa = gpa;
	    }

	    @Override
	    public String toString() {
	        return "Student{" + "maSV='" + maSV + '\'' + ", ten='" + ten + '\'' + ", gpa=" + gpa + '}';
	    }
	}

