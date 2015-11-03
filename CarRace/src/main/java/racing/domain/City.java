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
	@NamedQuery(name = "City.FindByName", 
			query = "select a from City "
					+ "a where a.name=:name")
})



@Entity
public class City {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	@Column(name = "name")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "city")
	private List<Clubman> clubmans;

	public City() {
		
	}
	
	

	public City(String name) {
		
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

	public List<Clubman> getClubmans() {
		return clubmans;
	}

	public void setClubmans(List<Clubman> clubmans) {
		this.clubmans = clubmans;
	}



	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", clubmans=" + clubmans
				+ "]";
	}
	
	
	
}
