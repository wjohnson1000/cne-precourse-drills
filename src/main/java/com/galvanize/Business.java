package com.galvanize;

import java.util.*;
import com.galvanize.Address;

public class Business implements Addressable {
	
	private final String name;
	
	private final ArrayList<Address> addresses;
	
	public Business (String newName) {
		
		name = newName;
		
		addresses = new ArrayList<Address>();
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public void addAddress (Address addressToAdd) {
		
		addresses.add(addressToAdd);
		
	}
	
	public ArrayList<Address> getAddresses () {
		
		return addresses;
		
	}
	
}