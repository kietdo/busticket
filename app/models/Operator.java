package models;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import play.db.jpa.*;
@Entity
public class Operator extends Model{
	public String name;
	@OneToMany(mappedBy="operator", cascade=CascadeType.ALL)
	public List<Route> routes;
	
	@OneToMany(mappedBy="operator", cascade=CascadeType.ALL)
	public List<Trip> trips;
	/*
	@OneToMany(mappedBy="operator", cascade=CascadeType.ALL)
	public List<Vehicle> vehicles;*/
	
	public Operator(String name) {
		super();
		this.name = name;
		this.routes = new ArrayList<Route>();
		this.trips = new ArrayList<Trip>();
		//this.vehicles = new ArrayList<Vehicle>();
	}
	
	public String toString(){
		return name;
	}
	
	
}
