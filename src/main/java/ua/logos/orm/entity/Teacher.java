package ua.logos.orm.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher extends BaseEntity {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer ID;
//	
	@Column(name = "first_name", length = 50) //VARCHAR (50)
	private String firstName; // firat_name
	
	@Column(name = "last_name", length = 60)
	private String lastName;
	
	private int age;
	
	@OneToMany(mappedBy = "teacher")
	private List<Course> courses = new ArrayList<Course>();

	@OneToOne
	@JoinColumn(name = "teacher_details_id")
	private TeacherDetails teacherdetails;
	
	
	
	public Teacher() {
	}
	
	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public TeacherDetails getTeacherdetails() {
		return teacherdetails;
	}

	public void setTeacherdetails(TeacherDetails teacherdetails) {
		this.teacherdetails = teacherdetails;
	}

//	public Integer getID() {
//		return ID;
//	}
//
//	public void setID(Integer iD) {
//		ID = iD;
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
