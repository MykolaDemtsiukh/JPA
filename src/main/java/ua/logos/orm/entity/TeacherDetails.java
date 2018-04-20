package ua.logos.orm.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "teacher_details")
public class TeacherDetails extends BaseEntity {
	
	private String Email;
	
	private String hobby;

	public TeacherDetails() {
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	


}
