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
	@NamedQuery(name = "Sex.FindByName", 
			query = "select a from Sex "
					+ "a where a.name=:name")
})

@Entity
public class Sex {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	@Column(name = "name")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "city")
	private List<Clubman> clubmans;

	public Sex() {
		
	}
	
	public Sex(String name) {
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
		return "Sex [id=" + id + ", name=" + name + ", clubmans=" + clubmans
				+ "]";
	}
	
	
	

}
