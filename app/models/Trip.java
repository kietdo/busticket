package models;
import java.util.Date;

import javax.persistence.*;
import play.db.jpa.*;
@Entity
public class Trip extends Model {
	@ManyToOne
	public Operator operator;
	@ManyToOne
	public Route route;	
	public Vehicle vehicle;	
	public Date leavingTime;
	public Date arrivingTime;
}
