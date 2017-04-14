package com.wangxiao;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TeachersTest {
	
	 public static void main(String[] args) {
	     
	        
	        Configuration cfg = new Configuration();
	        SessionFactory sf = cfg.configure().buildSessionFactory();
	        Session session = sf.openSession();
	        teachers t = new  teachers();
	        t.settName("¸ßÓñÁ¼");
	        t.setSex("ÄÐ");
	        t.settId(1);
	        session.beginTransaction();
	        session.save(t);
	        session.getTransaction().commit();
	        session.close();
	        sf.close();
}
}
