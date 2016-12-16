package com.sonu.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	private List addressList;
	private Set addressSet;
	private Map addressMap;
	private Properties addressProp;

	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}

	public void getAddressList() {
		System.out.println("List Elements : " + addressList);
	}

	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}

	public void getAddressSet() {
		System.out.println("Set Elements : " + addressSet);
	}

	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}

	public void getAddressMap() {
		System.out.println("Map Elements : " + addressMap);
	}

	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}

	public void getAddressProp() {
		System.out.println("Property Elements :" + addressProp);
	}
}