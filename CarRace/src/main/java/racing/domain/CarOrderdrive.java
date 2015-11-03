package racing.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@NamedQueries ({
	@NamedQuery(name = "CarOrderdrive.FindByName", 
			query = "select a from CarOrderdrive "
					+ "a where a.name=:name")
})

@Entity
public class CarOrderdrive {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	@Column(name = "name")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "carorderdrive")
	private List<Car> cars;

	
	
	public CarOrderdrive() {
		
	}
	

	public CarOrderdrive(String name) {
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
		return "CarOrderdrive [id=" + id + ", name=" + name + ", cars=" + cars
				+ "]";
	}
	
	

}
