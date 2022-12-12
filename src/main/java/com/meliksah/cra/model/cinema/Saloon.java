package com.meliksah.cra.model.cinema;

import javax.persistence.Column;
import javax.persistence.Entity;
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
public class Saloon extends BaseEntity {

	@Column(nullable = false)
	String name;
}
