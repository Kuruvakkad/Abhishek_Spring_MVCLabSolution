package com.greatLearning.studentManagement.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.greatLearning.studentManagement.entity.Student;

public class StudentDaoImpl implements StudentDao{

	private SessionFactory sessionFactory;

	private Session session;
	public StudentDaoImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;
		try {
			session = sessionFactory.getCurrentSession();

		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
	}
	@Override
	public void saveStudent(Student student) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(student);
		
		
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> search(String name, String department) {
		// TODO Auto-generated method stub
		return null;
	}


}
