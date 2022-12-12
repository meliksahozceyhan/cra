package com.meliksah.cra.model.cinema;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.meliksah.cra.model.base.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "session")
public class Session extends BaseEntity {

	@Column(nullable = false)
	String name;

	@Column(nullable = false)
	Date startDate;

	@Column(nullable = false)
	Date endDate;

	@JsonIgnore
	@OneToMany(mappedBy = "session", cascade = CascadeType.ALL)
	private List<MovieSession> movieSessions;
}
