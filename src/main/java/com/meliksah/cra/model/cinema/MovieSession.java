package com.meliksah.cra.model.cinema;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	@OneToMany(cascade = CascadeType.PERSIST)
	Movie movie;

	@JoinColumn(name = "session_id")
	@OneToMany(cascade = CascadeType.PERSIST)
	Session session;

}
