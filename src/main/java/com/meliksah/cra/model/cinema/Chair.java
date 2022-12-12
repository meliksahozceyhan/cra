package com.meliksah.cra.model.cinema;

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

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "chair")
public class Chair extends BaseEntity {

	@Column(nullable = false)
	String name;

	@JsonIgnore
	@OneToMany(mappedBy = "movieSession", cascade = CascadeType.ALL)
	List<MovieSessionChair> movieSessionChairs;
}
