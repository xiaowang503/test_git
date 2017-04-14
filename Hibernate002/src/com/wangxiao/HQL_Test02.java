package com.wangxiao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQL_Test02 {
	public static void main(String args[]){
		List<teachers> m = new ArrayList<teachers>(); 
		Session session = null;
		try{
			
			Configuration cfg = new Configuration();
	        SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
			session = sessionFactory.openSession();
			//String hql = "from teachers tea";	//查询所有的teachers数据
			String hql2 = "from teachers tea order by tea.tId asc";  //通过ID排序查询
			//String hql3 = "select min(tea.tId) from teachers tea";
			session.beginTransaction();
			Query q = session.createQuery(hql2);
			m = q.list();
			session.getTransaction().commit();
			Iterator it = m.iterator();
		//	System.out.println(m.get(0).gettId()+"***"+m.get(0).getSex()+"***"+m.get(0).gettName());
			
			int i = 0;
			
			while(it.hasNext()){
			System.out.println(m.get(i).gettId()+"***"+m.get(i).getSex()+"***"+m.get(i).gettName());
			i++;
			if(i>=m.size()){
				break;
			}
			}
			
			
			
		}catch(Exception e){
			System.out.println("对象装载失败");
			e.printStackTrace();
		}finally{
			 session.close(); 
		}
	}
}
