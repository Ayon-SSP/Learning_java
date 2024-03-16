```java
[11:24 AM] Aditya Chidre
madam data types by java brains is members only video
 
[11:25 AM] Aditya Chidre
This is the first link you shared with us
[11:26 AM] Dhanashree Jawle
package com.training.demo.service;
 
import java.util.List;
 
public interface IService<T> {
 
	T create(T t) throws Exception;
	boolean update(int id,T t) throws Exception;
	boolean delete(int id) throws Exception;
	T findOne(int id) throws Exception;
	List<T> findAll() throws Exception;
 
}
 
[11:27 AM] Divya Rao
someone is waiting in the lobby
[11:28 AM] Dhanashree Jawle
package com.training.demo.service;
 
import java.util.List;
 
public interface IService<T> {
 
	T create(T t) throws Exception;
	boolean update(int id,T t) throws Exception;
	boolean delete(int id) throws Exception;
	T findOne(int id) throws Exception;
	List<T> findAll() throws Exception;
 
}
 
[11:28 AM] Dhanashree Jawle
package com.training.demo.service;
 
import java.util.List;
 
import com.training.demo.collection.UserList;
import com.training.demo.model.User;
 
public class UserService implements IService<User> {
 
	private UserList userList;
	@Override
	public User create(User t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public boolean update(int id, User t) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
 
	@Override
	public boolean delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
 
	@Override
	public User findOne(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public List<User> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
 
	
}
 
[11:28 AM] Dhanashree Jawle
package com.training.demo.collection;
 
import java.util.List;
 
public interface IList<T> {
	T create(T t) throws Exception;
	boolean update(int id,T t) throws Exception;
	boolean delete(int id) throws Exception;
	T findOne(int id) throws Exception;
	List<T> findAll() throws Exception;
 
}
 
[11:28 AM] Dhanashree Jawle
package com.training.demo.collection;
 
import java.util.List;
 
import com.training.demo.model.User;
 
public class UserList implements IList<User>{
 
	@Override
	public User create(User t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public boolean update(int id, User t) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
 
	@Override
	public boolean delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
 
	@Override
	public User findOne(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public List<User> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
 
	
}
 
[11:30 AM] Dhanashree Jawle
package com.training.demo.collection;
 
import java.util.List;
 
import com.training.demo.dao.UserDao;
import com.training.demo.model.User;
 
public class UserList implements IList<User>{
 
	private UserDao userDao;
	
	private UserList(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
 
	@Override
	public User create(User t) throws Exception {
	
		return userDao.create(t);
	}
 
	@Override
	public boolean update(int id, User t) throws Exception {
		
		return userDao.update(id, t);
	}
 
	@Override
	public boolean delete(int id) throws Exception {
 
		return userDao.delete(id);
	}
 
	@Override
	public User findOne(int id) throws Exception {
		
		return userDao.findOne(id);
	}
 
	@Override
	public List<User> findAll() throws Exception {
		
		return userDao.findAll();
	}
 
	
}
 
[11:47 AM] HARSHI JAIN
maam why you have put break statement in cse 1 only
[11:48 AM] Sanjeev Shah
maam will add break statement at the end
[11:56 AM] HARSHI JAIN
maam showing virus detected
[12:00 PM] Dhanashree Jawle
-- Has A 

create table student(

    id number primary key,

    name varchar2(100),

    age number(2)

);
 
create table address(

    id number primary key,

    street varchar2(100),

    city varchar2(100),

    zipcode varchar2(10),

    student_id number references student(id)

);
[12:03 PM] Dhanashree Jawle
-- Has A 

create table student(

    id number primary key,

    name varchar2(100),

    age number(2)

);
 
create table address(

    id number primary key,

    street varchar2(100),

    city varchar2(100),

    zipcode varchar2(10),

    student_id number references student(id)

);
 
 
insert into student values (1,'John Doe',20);

insert into student values (2,'Jane Smith',20);

insert into student values (3,'Alice Johnson',20);
 
insert into address values(101,'123 Main st','Anytown','12345',1);

insert into address values(102,'456 Elm St','Sometown','65432',2);

insert into address values(103,'789 Oak St','Othertown','98765',3);
 
commit ;
[12:08 PM] Dhanashree Jawle
package com.training.demo.model;
 
public class Student {
 
	private int id;
	private String name;
	private int age;
	private Address address;
	private Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Student(int id, String name, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	private Student(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Student other = (Student) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}
	
}
 
[12:08 PM] Dhanashree Jawle
package com.training.demo.model;
 
public class Address {
 
	private int id;
	private String street;
	private String city;
	private String zipcode;
	private Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Address(int id, String street, String city, String zipcode) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}
	private Address(String street, String city, String zipcode) {
		super();
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Address other = (Address) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}
	
}
 
[12:13 PM] Dhanashree Jawle
package com.training.demo.dao;
 
import java.util.List;
 
public interface IDao<T> {
 
	T create(T t) throws Exception;
	T findOne(int id)throws Exception;
	List<T> findALL(T t)throws Exception;
	//update
	//delete
}
 
```