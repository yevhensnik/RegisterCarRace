package racing.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@NamedQueries ({
	@NamedQuery(name = "Carstyle.FindByName", 
			query = "select a from Carstyle "
					+ "a where a.name=:name")
})

@Entity
public class Carstyle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	@Column(name = "name")
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "car_Carstyle", joinColumns = 
	@JoinColumn(name = "fk_carstyle"), inverseJoinColumns = 
	@JoinColumn(name = "fk_car"))
	private List<Car> cars;

	
	
	public Carstyle(String name) {
		this.name = name;

	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	@Override
	public String toString() {
		return "Carstyle [id=" + id + ", name=" + name + ", cars=" + cars + "]";
	}

}
