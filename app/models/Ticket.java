package models;
import javax.persistence.*;
import play.db.jpa.*;
@Entity
public class Ticket extends Model {
	public String passengerName;
	public String nationalId;
	
	public Trip trip;
	public String paymentInfo;
}
