package com.meliksah.cra.model.cinema;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.meliksah.cra.model.base.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "saloon")
@EqualsAndHashCode(callSuper = false)
public class MovieSession extends BaseEntity {

	@JoinColumn(name = "movie_id")
	@ManyToOne(cascade = CascadeType.PERSIST)
	Movie movie;

	@JoinColumn(name = "session_id")
	@ManyToOne(cascade = CascadeType.PERSIST)
	Session session;

	@JsonIgnore
	@OneToMany(mappedBy = "movieSession", cascade = CascadeType.ALL)
	List<MovieSessionChair> movieSessionChairs;
}
