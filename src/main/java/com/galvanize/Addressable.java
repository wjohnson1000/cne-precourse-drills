package com.galvanize;

import java.util.*;
import com.galvanize.Address;

interface Addressable {
	
	List<Address> getAddresses ();
	
	void addAddress (Address addressToAdd);
	
}