package com.meliksah.cra.model.cinema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.meliksah.cra.model.base.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name = "actor")
@Entity
public class Actor extends BaseEntity {

	@Column(nullable = false)
	String name;

	@Column(nullable = false)
	String surname;

}
