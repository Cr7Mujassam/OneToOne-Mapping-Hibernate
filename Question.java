package oneToOne.Mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Table(name="Question_Table")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Question_Id;
	
	@OneToOne
	private answers Answer_Id;

	public answers getAnswer_Id() {
		return Answer_Id;
	}

	public void setAnswer_Id(answers answer_Id) {
		Answer_Id = answer_Id;
	}

	
}
