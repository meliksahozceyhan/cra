package com.meliksah.cra.model.cinema;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.meliksah.cra.model.base.BaseEntity;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name = "saloon")
public class MovieSessionChair extends BaseEntity {

	@NotNull
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "movie_session_id")
	private MovieSession movieSession;

	@NotNull
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "chair_id")
	private Chair chair;

	@NotNull
	@Column(nullable = false)
	private String chairStatus;
}
