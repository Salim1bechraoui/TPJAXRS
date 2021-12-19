package model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Livre {
	public Livre(int id, String description, int qte) {
		super();
		this.id = id;
		this.description = description;
		this.qte = qte;
	}
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	private String description ;
	private int qte ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	} 

	@Override
	public String toString() {
		return "Livre [id=" + id + ", description=" + description + ", qte=" + qte + "]";
	}

}
