package models;
import javax.persistence.*;
import play.db.jpa.*;
@Entity
public class Station extends Model {
	public String name;
	public String toString(){
		return name;
	}
}
