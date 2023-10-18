package com.angef.gymManager.entity;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "SUBSCRIBER")
public class Subscriber {
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "name", nullable = false)
	private String surname;
	@Column(name = "name", nullable = false)
	private String dni;
	@Column(name = "name", nullable = false)
	private String phone;

}
