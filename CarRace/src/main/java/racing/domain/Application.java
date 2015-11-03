package racing.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;



@NamedQueries ({
	
	@NamedQuery(name = "Application.findByIdPeriod", query = "select a from Application a "
					+ "where a.id between :from and :till")
	
})

@Entity
public class Application {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "more_info")
	private String moreinfo;
	
	@ManyToOne
	@JoinColumn
	private Clubman clubman;

	public Application() {
		
	}

	public Application(String moreinfo) {
		super();
		this.moreinfo = moreinfo;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMoreinfo() {
		return moreinfo;
	}

	public void setMoreinfo(String moreinfo) {
		this.moreinfo = moreinfo;
	}

	public Clubman getClubman() {
		return clubman;
	}

	public void setClubman(Clubman clubman) {
		this.clubman = clubman;
	}

	@Override
	public String toString() {
		return "Application [id=" + id + ", moreinfo=" + moreinfo
				+ ", clubman=" + clubman + "]";
	}


	
	

}
