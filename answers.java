package oneToOne.Mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Ans")
public class answers {
	
	@Id
	@Column(name="Answer_Id",length = 5)
	/* @GeneratedValue(strategy = GenerationType.IDENTITY) */
	private int Id;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
}
