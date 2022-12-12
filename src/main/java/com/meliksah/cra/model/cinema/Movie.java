package com.meliksah.cra.model.cinema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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
@Table(name = "movie")
public class Movie extends BaseEntity {

	@Column(nullable = false)
	String name;

	@Column(nullable = false)
	String director;

	@Column(nullable = false)
	String genre;

}
