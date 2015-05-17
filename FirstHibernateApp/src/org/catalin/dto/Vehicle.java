package org.catalin.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="VEHICLE")
public class Vehicle {
	@Id @GeneratedValue
	private int vehicleID;
	private String vehicleName;
	@ManyToOne
	@NotFound(action=NotFoundAction.IGNORE)
	private UserDetails user;
	

	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	public int getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}




}
