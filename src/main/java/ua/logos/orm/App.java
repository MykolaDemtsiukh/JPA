package ua.logos.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.logos.orm.entity.Teacher;
import ua.logos.orm.entity.TeacherDetails;

public class App {

	public static void main(String[] args) {

		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		em.getTransaction().begin();
		
//		TeacherDetails teacherDetails = new TeacherDetails();
//		teacherDetails.setEmail("teacher@gmail.com");
//		teacherDetails.setHobby("run");
//		
//		em.persist(teacherDetails);
//		
//		
//		Teacher teacher = new Teacher();
//		teacher.setFirstName("John1");
//		teacher.setLastName("Doe1");
//		teacher.setAge(35);
//		teacher.setTeacherdetails(teacherDetails);
//		
//		em.persist(teacher);
//		
		
//		Teacher teacher = em.find(Teacher.class,1);
//		System.out.println("Teacher:" + teacher.getId()+" "+teacher.getFirstName());
//		
		em.getTransaction().commit();
		
		 
		em.close();
		entityManagerFactory.close();
		
	}

}
