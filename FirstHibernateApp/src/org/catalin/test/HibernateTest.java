package org.catalin.test;

import org.catalin.dto.UserDetails;
import org.catalin.dto.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDetails user=new UserDetails();
		user.setUserName("231");
		
		
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("nume vehicul");
		Vehicle vehicle2=new Vehicle();
		vehicle2.setVehicleName("nume 2");
		
		user.getVehicle().add(vehicle);
		user.getVehicle().add(vehicle2);
		
		vehicle.setUser(user);
		vehicle2.setUser(user);
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.persist(user);
	
		
		session.getTransaction().commit();
	}

}
