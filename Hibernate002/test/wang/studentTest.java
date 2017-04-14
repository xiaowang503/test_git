package wang;
import com.wangxiao.student;

import java.util.Date;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class studentTest {
	private SessionFactory sessionFactory;
	private Session session;
	
	@Before
	public void init(){
		Configuration config = new Configuration().configure();
		sessionFactory = config.buildSessionFactory();
		session = sessionFactory.openSession();
	} 
	
	@After
	public void destory(){
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}
	@Test
	public void testSaveStudent(){
		student s = new student();
		s.setSid(1);
		s.setBirthday(new Date());
		s.setAddress("É½Î÷");
		s.setSex("ÄÐ");
		s.setSname("ÍõÏþ");
		session.beginTransaction();
        session.save(s);
       	
	}
	
}
