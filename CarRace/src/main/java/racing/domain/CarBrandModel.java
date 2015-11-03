package racing.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


@NamedQueries ({
	@NamedQuery(name = "City.CarBrandModel", 
			query = "select a from CarBrandModel "
					+ "a where a.name=:name")
})

@Entity
public class CarBrandModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	@Column(name = "name")
	private String name;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private Carbrand carbrand;

	
	
	
	public CarBrandModel(String name) {
	
		this.name = name;
	}

	public CarBrandModel() {
		
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

	public Carbrand getCarbrand() {
		return carbrand;
	}

	public void setCarbrand(Carbrand carbrand) {
		this.carbrand = carbrand;
	}

	@Override
	public String toString() {
		return "CarBrandModel [id=" + id + ", name=" + name + ", carbrand="
				+ carbrand + "]";
	}
	
	

}
