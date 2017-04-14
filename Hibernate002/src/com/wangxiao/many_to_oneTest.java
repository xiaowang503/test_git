package com.wangxiao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class many_to_oneTest {

	 public static void main(String[] args) {
	     
		 Session session = null;
			try{
				Configuration cfg = new Configuration();
		        SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
				session = sessionFactory.openSession();
				student Student = (student) session.get(student.class,1);                     
				 // Student student = (Student) session.get("com.lt.crm.entity.Student", 1L);   
				 System.out.println(Student.getSid());
				 System.out.println(Student.getSname());  
				 System.out.println(Student.getAddress());  
				 System.out.println(Student.getSex());  
				 System.out.println(Student.getBirthday()); 
				 System.out.println("老师姓名："+Student.getTeachers().gettName());         
			}catch(Exception e){
				System.out.println("对象装载失败");
				e.printStackTrace();
			}finally{
				 session.close(); 
			}
		}

}

