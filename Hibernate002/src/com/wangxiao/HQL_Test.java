package com.wangxiao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQL_Test {
	public static void main(String args[]){
		List<teachers> m = new ArrayList<teachers>(); 
		Session session = null;
		try{
			
			Configuration cfg = new Configuration();
	        SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
			session = sessionFactory.openSession();
			String hql = "from teachers tea"; 
			session.beginTransaction();
			Query q = session.createQuery(hql);
			m = q.list();
			session.getTransaction().commit();
			Iterator it = m.iterator();
			int i = 0;
			
			while(it.hasNext()){
			System.out.println(m.get(i).gettId()+"***"+m.get(i).getSex()+"***"+m.get(i).gettName());
			i++;
			if(i>=m.size()){
				break;
			}
			}
			
			
		}catch(Exception e){
			System.out.println("∂‘œÛ◊∞‘ÿ ß∞‹");
			e.printStackTrace();
		}finally{
			 session.close(); 
		}
	}
}
