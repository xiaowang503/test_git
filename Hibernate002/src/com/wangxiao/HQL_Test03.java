package com.wangxiao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQL_Test03 {
	public static void main(String args[]){
	//	List<teachers> m = new ArrayList<teachers>(); 
		Session session = null;
		try{
			
			Configuration cfg = new Configuration();
	        SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
			session = sessionFactory.openSession();
			//String hql = "from teachers tea";	//查询所有的teachers数据
			//String hql2 = "from teachers tea order by tea.tId asc";  //通过ID排序查询
			//String hql3 = "select max(tea.tId) from teachers tea";
			String hql4 = "select tea.sex,count(*) from teachers tea group by tea.sex";
			session.beginTransaction();
			Query q = session.createQuery(hql4);
			List m = q.list();
			session.getTransaction().commit();
			Iterator it = m.iterator();
		//	System.out.println(m.get(0).gettId()+"***"+m.get(0).getSex()+"***"+m.get(0).gettName());
			
			int i = 0;
			
			while(it.hasNext()){
				//teachers[] s = (teachers)it.next();
				Object[] obj = (Object[])it.next();
			System.out.println("性别："+obj[0]+"  人数："+obj[1]);
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
