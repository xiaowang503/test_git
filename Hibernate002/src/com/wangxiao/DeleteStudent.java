package com.wangxiao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {
	public static void main(String args[]){
		Session session = null;
		try{
			Configuration cfg = new Configuration();
	        SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
			session = sessionFactory.openSession();
			student Student = (student) session.get(student.class,4);                     
			 // Student student = (Student) session.get("com.lt.crm.entity.Student", 1L);
			System.out.println("����ɾ�����ݣ�");
			session.beginTransaction();
			session.delete(Student);
			//session.flush();
			session.getTransaction().commit();
			
			 System.out.println("ɾ���ɹ�");
		
		}catch(Exception e){
			System.out.println("����װ��ʧ��");
			e.printStackTrace();
		}finally{
			 session.close(); 
		}
	}
}
