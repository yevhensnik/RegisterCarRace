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
import javax.persistence.OneToOne;


@NamedQueries ({
	@NamedQuery(name = "Carbrand.FindByName", 
			query = "select a from Carbrand "
					+ "a where a.name=:name")
})

@Entity
public class Carbrand {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	@Column(name = "name")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "carbrand")
	private List<Car> cars;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "carbrand")
	private CarBrandModel carbrandmodel;

	
	
	public Carbrand() {
		
	}

	public Carbrand(String name) {
		
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

	public CarBrandModel getCarbrandmodel() {
		return carbrandmodel;
	}

	public void setCarbrandmodel(CarBrandModel carbrandmodel) {
		this.carbrandmodel = carbrandmodel;
	}

	@Override
	public String toString() {
		return "Carbrand [id=" + id + ", name=" + name + ", cars=" + cars
				+ ", carbrandmodel=" + carbrandmodel + "]";
	}
	
	

}
