package com.training.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.training.demo.model.Student;

public class StudentDao implements IDao<Student> {

	private final Session session;

	public StudentDao(Session session) {
		super();
		this.session = session;
	}

	@Override
	public void save(Student student) {
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();

	}

	@Override
	public void update(Student student) {
		Transaction transaction = session.beginTransaction();
		session.update(student);
		transaction.commit();
	}

	@Override
	public void delete(Student student) {
		Transaction transaction = session.beginTransaction();
		session.delete(student);
		transaction.commit();
	}

	@Override
	public Student getById(Long id) {
		return session.get(Student.class, id);
	}

	@Override
	public List<Student> getAll() {
		Query<Student> query = session.createQuery("FROM Student", Student.class);
		return query.getResultList();
	}

}
