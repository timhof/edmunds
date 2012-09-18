/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.dealers.bean;

import java.util.Map;

public class Dealer {

	private String id;
	private Address address;
	private String name;
	private String logicalName;
	private String type;
	private String make;
	private Map<String, String> operations;
	private Map<String, String> contactinfo;
	private String active;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogicalName() {
		return logicalName;
	}

	public void setLogicalName(String logicalName) {
		this.logicalName = logicalName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public Map<String, String> getOperations() {
		return operations;
	}

	public void setOperations(Map<String, String> operations) {
		this.operations = operations;
	}

	public Map<String, String> getContactinfo() {
		return contactinfo;
	}

	public void setContactinfo(Map<String, String> contactinfo) {
		this.contactinfo = contactinfo;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}
}
