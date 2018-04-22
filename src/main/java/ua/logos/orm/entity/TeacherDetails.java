package ua.logos.orm.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "teacher_details")
@NoArgsConstructor
@Getter @Setter
public class TeacherDetails extends BaseEntity {
	
	private String Email;
	
	private String hobby;

	

}
