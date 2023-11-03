package com.example.demo;


	public class Address  implements Cloneable{
		public String place;
		public String country;
		public Address(String place, String country) {
			super();
			this.place = place;
			this.country = country;
		}
		public Address() {
			super();
		
		}
		@Override
		
		protected Object clone() throws CloneNotSupportedException
		{
			return (Address) super.clone();
		
		}
		@Override
		public String toString() {
			return "Address [place=" + place + ", country=" + country + "]";
		}
		
		
		

	}



