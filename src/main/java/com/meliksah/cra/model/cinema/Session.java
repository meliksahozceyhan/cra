package com.meliksah.cra.model.cinema;

import java.util.Date;

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
@Table(name = "session")
public class Session extends BaseEntity {

	String name;

	Date startDate;

	Date endDate;
}
