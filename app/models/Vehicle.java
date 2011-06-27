package models;
import javax.persistence.*;
import play.db.jpa.*;
@Entity
public class Vehicle extends Model {
	public int capacity;
	public String info;
	@ManyToOne
	public Operator operator;
}
