package com.training.demo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;

import com.training.demo.dao.CourseDao;
import com.training.demo.dao.StudentDao;
import com.training.demo.model.Course;
import com.training.demo.model.Student;
import com.training.demo.util.HibernateUtil;

public class App {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			while (true) {
				System.out.println("1. Register Student to Course");
				System.out.println("2. Show Student-Course Details");
				System.out.println("3. Add Student");
				System.out.println("4. Update Student");
				System.out.println("5. Delete Student");
				System.out.println("6. Add Course");
				System.out.println("7. Update Course");
				System.out.println("8. Delete Course");
				System.out.println("9. Show All Students");
				System.out.println("10. Show All Courses");				
				System.out.println("11. Exit");

				System.out.print("Enter your choice: ");
				int choice = scanner.nextInt();
				scanner.nextLine(); // Consume newline

				switch (choice) {
				case 1:
					registerStudentToCourse();
					break;
				case 2:
					showStudentCourseDetails();
					break;
				case 3:
					addStudent();
					break;
				case 4:
					updateStudent();
					break;
				case 5:
					deleteStudent();
					break;
				case 6:
					addCourse();
					break;
				case 7:
					updateCourse();
					break;
				case 8:
					deleteCourse();
					break;
				case 9:
					showAllStudents();
					break;
				case 10:
					showAllCourses();
					break;
				case 11:
					System.out.println("Exiting...");
					return;
				default:
					System.out.println("Invalid choice. Please try again.");
				}
			}
		} finally {
			scanner.close();
		}
	}

	private static void registerStudentToCourse() {
		// Get student and course details from user input
		System.out.print("Enter student name: ");
		String studentName = scanner.nextLine();
		System.out.print("Enter course name: ");
		String courseName = scanner.nextLine();

		// Create entities
		Student student = new Student();
		student.setName(studentName);
		Course course = new Course();
		course.setName(courseName);
		course.setStudent(student);

		// Save entities using DAOs
		try (Session session = HibernateUtil.getSession()) {
			StudentDao studentDao = new StudentDao(session);
			CourseDao courseDao = new CourseDao(session);

			studentDao.save(student);
			courseDao.save(course);

			System.out.println("Student '" + studentName + "' registered to course '" + courseName + "'.");
		} catch (Exception e) {
			System.out.println("Failed to register student to course: " + e.getMessage());
		}
	}

	private static void showStudentCourseDetails() {
		try (Session session = HibernateUtil.getSession()) {
			StudentDao studentDao = new StudentDao(session);
			List<Student> students = studentDao.getAll();

			System.out.println("Student-Course Details:");
			for (Student student : students) {
				System.out.println("Student ID: " + student.getId());
				System.out.println("Student Name: " + student.getName());
				Course course = student.getCourse();
				if (course != null) {
					System.out.println("Course ID: " + course.getId());
					System.out.println("Course Name: " + course.getName());
				} else {
					System.out.println("No course assigned.");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Failed to fetch student-course details: " + e.getMessage());
		}
	}

	private static void addStudent() {
		// Get student details from user input
		System.out.print("Enter student name: ");
		String studentName = scanner.nextLine();

		// Create student entity
		Student student = new Student();
		student.setName(studentName);

		// Save student using DAO
		try (Session session = HibernateUtil.getSession()) {
			StudentDao studentDao = new StudentDao(session);
			studentDao.save(student);
			System.out.println("Student '" + studentName + "' added successfully.");
		} catch (Exception e) {
			System.out.println("Failed to add student: " + e.getMessage());
		}
	}

	private static void updateStudent() {
		// Get student ID and new name from user input
		System.out.print("Enter student ID to update: ");
		Long studentId = scanner.nextLong();
		scanner.nextLine(); // Consume newline
		System.out.print("Enter new student name: ");
		String newStudentName = scanner.nextLine();

		// Get existing student by ID
		try (Session session = HibernateUtil.getSession()) {
			StudentDao studentDao = new StudentDao(session);
			Student student = studentDao.getById(studentId);
			if (student != null) {
				// Update student name
				student.setName(newStudentName);
				// Save updated student
				studentDao.update(student);
				System.out.println("Student updated successfully.");
			} else {
				System.out.println("Student not found with ID: " + studentId);
			}
		} catch (Exception e) {
			System.out.println("Failed to update student: " + e.getMessage());
		}
	}

	private static void deleteStudent() {
		// Get student ID from user input
		System.out.print("Enter student ID to delete: ");
		Long studentId = scanner.nextLong();
		scanner.nextLine(); // Consume newline

		// Get existing student by ID and delete
		try (Session session = HibernateUtil.getSession()) {
			StudentDao studentDao = new StudentDao(session);
			Student student = studentDao.getById(studentId);
			if (student != null) {
				studentDao.delete(student);
				System.out.println("Student deleted successfully.");
			} else {
				System.out.println("Student not found with ID: " + studentId);
			}
		} catch (Exception e) {
			System.out.println("Failed to delete student: " + e.getMessage());
		}
	}

	private static void addCourse() {
		// Get course details from user input
		System.out.print("Enter course name: ");
		String courseName = scanner.nextLine();

		// Create course entity
		Course course = new Course();
		course.setName(courseName);

		// Save course using DAO
		try (Session session = HibernateUtil.getSession()) {
			CourseDao courseDao = new CourseDao(session);
			courseDao.save(course);
			System.out.println("Course '" + courseName + "' added successfully.");
		} catch (Exception e) {
			System.out.println("Failed to add course: " + e.getMessage());
		}
	}

	private static void updateCourse() {
		// Get course ID and new name from user input
		System.out.print("Enter course ID to update: ");
		Long courseId = scanner.nextLong();
		scanner.nextLine(); // Consume newline
		System.out.print("Enter new course name: ");
		String newCourseName = scanner.nextLine();

		// Get existing course by ID
		try (Session session = HibernateUtil.getSession()) {
			CourseDao courseDao = new CourseDao(session);
			Course course = courseDao.getById(courseId);
			if (course != null) {
				// Update course name
				course.setName(newCourseName);
				// Save updated course
				courseDao.update(course);
				System.out.println("Course updated successfully.");
			} else {
				System.out.println("Course not found with ID: " + courseId);
			}
		} catch (Exception e) {
			System.out.println("Failed to update course: " + e.getMessage());
		}
	}

	private static void deleteCourse() {
		// Get course ID from user input
		System.out.print("Enter course ID to delete: ");
		Long courseId = scanner.nextLong();
		scanner.nextLine(); // Consume newline

		// Get existing course by ID and delete
		try (Session session = HibernateUtil.getSession()) {
			CourseDao courseDao = new CourseDao(session);
			Course course = courseDao.getById(courseId);
			if (course != null) {
				courseDao.delete(course);
				System.out.println("Course deleted successfully.");
			} else {
				System.out.println("Course not found with ID: " + courseId);
			}
		} catch (Exception e) {
			System.out.println("Failed to delete course: " + e.getMessage());
		}
	}

	private static void showAllStudents() {
		try (Session session = HibernateUtil.getSession()) {
			StudentDao studentDao = new StudentDao(session);
			List<Student> students = studentDao.getAll();

			System.out.println("All Students:");
			for (Student student : students) {
				System.out.println("Student ID: " + student.getId());
				System.out.println("Student Name: " + student.getName());
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Failed to fetch students: " + e.getMessage());
		}
	}

	private static void showAllCourses() {
		try (Session session = HibernateUtil.getSession()) {
			CourseDao courseDao = new CourseDao(session);
			List<Course> courses = courseDao.getAll();

			System.out.println("All Courses:");
			for (Course course : courses) {
				System.out.println("Course ID: " + course.getId());
				System.out.println("Course Name: " + course.getName());
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Failed to fetch courses: " + e.getMessage());
		}
	}
}
