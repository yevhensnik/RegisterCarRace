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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@NamedQueries ({
	@NamedQuery(name = "Clubman.FindByName", query = "select a from Clubman "
					+ "a where a.name=:name"),
	@NamedQuery(name = "Clubman.findByNickName", query = "select a from Clubman "
					+ "a where a.nickname=:nickname"),
	@NamedQuery(name = "Author.findByDateOfBirdthPeriod", query = "select a from Clubman a "
					+ "where a.dateofbirdth between :from and :till")
})

@Entity
public class Clubman {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "daqte_of_birdth")
	private String dateofbirdth;
	@Column(name = "nickname")
	private String nickname;
	
	@ManyToOne
	@JoinColumn
	private City city;
	@ManyToOne
	@JoinColumn
	private Sex sex;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "clubman")
	private List<Car> cars;
	
	public Clubman() {
		
	}
	

	public Clubman(String name, String dateofbirdth, String nickname) {
		this.name = name;
		this.dateofbirdth = dateofbirdth;
		this.nickname = nickname;
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

	public String getDaqteofbirdth() {
		
		return dateofbirdth;
	}

	public void setDaqteofbirdth(String daqteofbirdth) {
		this.dateofbirdth = daqteofbirdth;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}


	@Override
	public String toString() {
		return "Clubman [id=" + id + ", name=" + name + ", dateofbirdth="
				+ dateofbirdth + ", nickname=" + nickname + ", city=" + city
				+ ", sex=" + sex + ", cars=" + cars + "]";
	}
	
	
	
		

}
