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
	public Station origin;
	public Station destination;
	public long regularPrice;
}
