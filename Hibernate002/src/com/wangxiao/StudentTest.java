package com.wangxiao;
import com.wangxiao.teachers;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentTest {
	
	 public static void main(String[] args) {
	     
	        
	        Configuration cfg = new Configuration();
	        SessionFactory sf = cfg.configure().buildSessionFactory();
	        Session session = sf.openSession();
	        student s = new student();
	        teachers t = new teachers();
	        t.settId(1);
	        s.setSid(1);
			s.setBirthday(new Date());
			s.setAddress("É½Î÷");
			s.setSex("ÄÐ");
			s.setSname("ÍõÏþ");
			s.setTeachers(t);
	        session.beginTransaction();
	        session.save(s);
	        session.getTransaction().commit();
	        session.close();
	        sf.close();
}
}
