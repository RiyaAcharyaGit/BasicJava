package com.example.demo;

public class Copy implements Cloneable {
	 public int roll;
	 public String name;
	 public Address address;
	 
	
	public Copy(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	
	 @Override
	public String toString() {
		return "Copy [roll=" + roll + ", name=" + name + "]";
	}
	@Override
public Object clone() throws CloneNotSupportedException
	 {
		 Copy copy=null;
		 try {
		  copy=(Copy) super.clone();
		 }
		 catch(CloneNotSupportedException e)
		 {
			 System.out.println("not support");
		 }
		 copy.address=(Address)super.clone();

		 return copy;
		 }

}



