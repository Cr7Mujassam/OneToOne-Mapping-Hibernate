package oneToOne.Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( " Session Started" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        //created the object for question table
        Question q = new Question();
        
        //created the object for answer table
        answers ans = new answers();
        //setting the id of answer
        ans.setId(12);
        
        //seting the object variable for question class answer variable
        q.setAnswer_Id(ans);
        
        
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(ans);
        session.save(q);
        tx.commit();
        session.close();
        factory.close();
	}

}
