package ua.logos.orm.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course extends BaseEntity {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer ID;
	
	private String title;
	
	@Column(length = 1000)
	private String description;
	
	@Column(columnDefinition = "DECIMAL(5,2)")
	private BigDecimal price;
	
	
	@ManyToOne
	@JoinColumn(name = "teacher_id")
	private Teacher teacher;

	@ManyToMany
	@JoinTable(name = "student_course",
			joinColumns = @JoinColumn(name = "course_id"),
			inverseJoinColumns = @JoinColumn(name = "student_id"))
	private List<Student> student = new ArrayList<Student>();
	
	public Course() {
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

//	public Integer getID() {
//		return ID;
//	}
//
//	public void setID(Integer iD) {
//		ID = iD;
//	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
	
	
	
	
}
