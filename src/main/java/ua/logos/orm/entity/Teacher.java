package ua.logos.orm.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "teacher")
@NoArgsConstructor
@Getter @Setter
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
	
	public List<Course> getCourses() {
		return courses;
	}
	
	
	
	
}
