package com.training.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.training.demo.model.Course;

public class CourseDao implements IDao<Course> {

	private final Session session;

	public CourseDao(Session session) {
		super();
		this.session = session;
	}

	@Override
	public void save(Course course) {

            Transaction transaction = session.beginTransaction();
            session.save(course);
            transaction.commit();
            System.out.println("Course '" + course.getName() + "' added successfully.");

	}
	 // Check if the course name is unique
    private boolean isCourseNameUnique(String courseName) {
        Query<Course> query = session.createQuery("FROM Course WHERE name = :name", Course.class);
        query.setParameter("name", courseName);
        List<Course> courses = query.getResultList();
        return courses.isEmpty();
    }

	@Override
    public void update(Course course) {
        Transaction transaction = session.beginTransaction();
        session.update(course);
        transaction.commit();
    }

    @Override
    public void delete(Course course) {
        Transaction transaction = session.beginTransaction();
        session.delete(course);
        transaction.commit();
    }
    @Override
    public Course getById(Long id) {
        return session.get(Course.class, id);
    }

    @Override
    public List<Course> getAll() {
        Query<Course> query = session.createQuery("FROM Course", Course.class);
        return query.getResultList();
    }
}
