package com.meliksah.cra.model.auth;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.meliksah.cra.model.base.BaseEntity;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User extends BaseEntity {

	@NotNull
	@Column(nullable = false)
	private String name;

	@NotNull
	@Column(nullable = false)
	private String surname;

	@NotNull
	@Column(nullable = false)
	@JsonFormat(pattern = "dd-MM-yyyy", timezone = "Europe/Istanbul")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private String email;

}
