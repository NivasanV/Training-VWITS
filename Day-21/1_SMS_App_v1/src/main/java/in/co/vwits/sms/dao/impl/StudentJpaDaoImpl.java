package in.co.vwits.sms.dao.impl;

import java.util.List;
import java.util.Optional;

import in.co.vwits.sms.dao.StudentDao;
import in.co.vwits.sms.model.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class StudentJpaDaoImpl implements StudentDao {

	private EntityManagerFactory factory;

	public StudentJpaDaoImpl(){
		factory = Persistence.createEntityManagerFactory("smsapp");
	}

	@Override
	public int save(Student s) {
		// s is the entity object in the Transient stage
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(s); // This fires insert QUERY
		tx.commit();
		em.close();
		return 1;
	}

	@Override
	public void deleteStudent(int rollno) {
		// TODO Auto-generated method stub
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.remove(em.find(Student.class, rollno));  // This fires delete QUERY 
		tx.commit();
		em.close();

	}

	@Override
	public Optional<Student> findByRollNo(int rollno) {
		// TODO Auto-generated method stub
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Student s = em.find(Student.class, rollno); // This fires select QUERY
		tx.commit();
		em.close();
		return Optional.of(s);
	}

	@Override
	public List<Student> findAll() {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		// call a method which returns all the records from the database
		String jpql = "FROM Student";
		TypedQuery<Student> query = em.createQuery(jpql,Student.class);
		List<Student> studentList = query.getResultList();
		tx.commit();
		em.close();
		return studentList;
	}

	@Override
	public void updateMark(int rollno, double mark) {
		// TODO Auto-generated method stub
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Student s = new Student();
		s.setRollno(rollno);
		s.setPercentage(mark);
		em.merge(s);	// This fires delete QUERY 
		tx.commit();
		em.close();
	}

	@Override
	public void updateByRollno(Student s) {
		// TODO Auto-generated method stub
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(s);	// This fires delete QUERY 
		tx.commit();
		em.close();
	}

	@Override
	public List<Student> findAllWithSubjects() {
		// TODO Auto-generated method stub
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		//String jpql = "FROM Student AS s LEFT JOIN FETCH s.subjectsLearning"; // no
		//List<Student> studentList = em.createQuery(jpql, Student.class).getResultList();
		List<Student> studentList = em.createNamedQuery("findAllWithSubjects", Student.class).getResultList();
		tx.commit();
		em.close();
		return studentList;
	}

	@Override
	public Optional<Student> findOneWithSubjectsLearning(int r) {
		// TODO Auto-generated method stub
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		String jpql = "FROM Student AS s LEFT JOIN FETCH s.subjectsLearning WHERE s.rollno = :rno";
		TypedQuery<Student> query = em.createQuery(jpql, Student.class);
		query.setParameter("rno", r);
		Student s = query.getSingleResult();
		tx.commit();
		em.close();
		return Optional.of(s);
	}

}
