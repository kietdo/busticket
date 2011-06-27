package models;
import javax.persistence.*;
import play.db.jpa.*;
/*
 * A class to represent a vehicle type
 * Not a specific vehicle since we can not have control over which
 * 
 */
@Entity
public class Vehicle extends Model {
	public int capacity;
	public String makeAndModel;
	/*@ManyToOne
	public Operator operator;*/
	public String toString(){
		return makeAndModel+"-"+capacity;
	}
}
