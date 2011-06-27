package models;
import java.util.List;

import javax.persistence.*;
import play.db.jpa.*;
@Entity
public class Route extends Model{
	@ManyToOne
	public Operator operator;
	@OneToMany (mappedBy = "route")
	public List<Trip> trips;
	@OneToOne
	public Station origin;
	@OneToOne
	public Station destination;
	public double regularPrice;
	public double vipPrice;
	public double discountPrice;
	public int duration;
	
	public String toString(){
		return origin.name + "-"+destination.name;
	}
}
