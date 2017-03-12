package com.galvanize;

public class Address {

	private String street;

	private String city;

	private String state;

	private String zip;

	public Address (String newStreet, String newCity, String newState, String newZip) {
		street = newStreet;
		city = newCity;
		state = newState;
		zip = newZip;
	}

	public void setStreet(String newStreet) {
		street = newStreet;
	}

	public String getStreet() {
		return street;
	}

	public void setCity(String newCity) {
		city = newCity;
	}

	public String getCity() {
		return city;
	}

	public void setState(String newState) {
		state = newState;
	}

	public String getState() {
		return state;
	}

	public void setZip(String newZip) {
		zip = newZip;
	}

	public String getZip() {
		return zip;
	}

	@Override
	public String toString() {
		String result = getStreet() + ", " + getCity() + ", " + getState()
				+ " " + getZip();
		return result;
	}

}
