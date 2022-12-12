package com.meliksah.cra.model.member;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.meliksah.cra.model.base.BaseEntity;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "member")
public class Member extends BaseEntity {

	@NotNull
	@Column(unique = false)
	private String memberStatus;

	@NotNull
	@Column(unique = false)
	private String memberStage;

	@NotNull
	@Column(unique = false)
	private Date applicationDate;

	@NotNull
	@Column(unique = false)
	private Date memberDate;

	@Column
	private String rejectionMessage;

	@Column
	private Long digitalCurrency;

	@Column
	private Long digitalLoan;

}
