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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@NamedQueries ({
	@NamedQuery(name = "Car.FindByLicensePlate", query = "select a from Car "
					+ "a where a.licensePlate=:licensePlate"),
	
	@NamedQuery(name = "Car.findByEngineCapacityPeriod", query = "select a from Car a "
					+ "where a.engineCapacity between :from and :till"),
	@NamedQuery(name = "Car.findByYearPeriod", query = "select a from Car a "
					+ "where a.yearCar between :from and :till")
	
})

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	@Column(name = "license_Plate")
	private String licensePlate;
	@Column(name = "engine_Capacity")
	private double engineCapacity;
	@Column(name = "year_Car")
	private int yearCar;
	
	
	@ManyToOne
	@JoinColumn
	private Clubman clubman;
	
	@ManyToOne
	@JoinColumn
	private Carbrand carbrand;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "car_Carstyle", joinColumns = 
	@JoinColumn(name = "fk_car"), inverseJoinColumns = 
	@JoinColumn(name = "fk_carstyle"))
	private List<Carstyle> carstyles;
	
	@ManyToOne
	@JoinColumn
	private Carbody carbody;
	
	@ManyToOne
	@JoinColumn
	private Carfuel carfuel;
	
	@ManyToOne
	@JoinColumn
	private CarOrderdrive carorderdrive;
	
	
	
	public Car() {
		
	}
	
	
	public Car(String licensePlate, double engineCapacity, int yearCar) {
	
		this.licensePlate = licensePlate;
		this.engineCapacity = engineCapacity;
		this.yearCar = yearCar;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public double getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public int getYearCar() {
		return yearCar;
	}
	public void setYearCar(int yearCar) {
		this.yearCar = yearCar;
	}
	public Clubman getClubman() {
		return clubman;
	}
	public void setClubman(Clubman clubman) {
		this.clubman = clubman;
	}
	public Carbrand getCarbrand() {
		return carbrand;
	}
	public void setCarbrand(Carbrand carbrand) {
		this.carbrand = carbrand;
	}
	public List<Carstyle> getCarstyles() {
		return carstyles;
	}
	public void setCarstyles(List<Carstyle> carstyles) {
		this.carstyles = carstyles;
	}
	public Carbody getCarbody() {
		return carbody;
	}
	public void setCarbody(Carbody carbody) {
		this.carbody = carbody;
	}
	public Carfuel getCarfuel() {
		return carfuel;
	}
	public void setCarfuel(Carfuel carfuel) {
		this.carfuel = carfuel;
	}
	public CarOrderdrive getCarorderdrive() {
		return carorderdrive;
	}
	public void setCarorderdrive(CarOrderdrive carorderdrive) {
		this.carorderdrive = carorderdrive;
	}


	@Override
	public String toString() {
		return "Car [id=" + id + ", licensePlate=" + licensePlate
				+ ", engineCapacity=" + engineCapacity + ", yearCar=" + yearCar
				+ ", clubman=" + clubman + ", carbrand=" + carbrand
				+ ", carstyles=" + carstyles + ", carbody=" + carbody
				+ ", carfuel=" + carfuel + ", carorderdrive=" + carorderdrive
				+ "]";
	}
	
	
	
	

}
