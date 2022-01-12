package ca.ComputerShop.bean;

import java.io.Serializable;
import java.util.ArrayList;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6258237332781941831L;
	private int id;	
	private String name;
	private String number;
	private String address;
	private String email;
	private int customerId;
	private String repairInfo;
	private int price;
	private int laborCharges;
	private int hardwareCharges;
	private int shippingCharges;
	private String timeRequired;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRepairInfo() {
		return repairInfo;
	}
	public void setRepairInfo(String repairInfo) {
		this.repairInfo = repairInfo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getLaborCharges() {
		return laborCharges;
	}
	public void setLaborCharges(int laborCharges) {
		this.laborCharges = laborCharges;
	}
	public int getHardwareCharges() {
		return hardwareCharges;
	}
	public void setHardwareCharges(int hardwareCharges) {
		this.hardwareCharges = hardwareCharges;
	}
	public int getShippingCharges() {
		return shippingCharges;
	}
	public void setShippingCharges(int shippingCharges) {
		this.shippingCharges = shippingCharges;
	}
	public String getTimeRequired() {
		return timeRequired;
	}
	public void setTimeRequired(String timeRequired) {
		this.timeRequired = timeRequired;
	}

	
} 

