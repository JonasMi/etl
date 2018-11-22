package com.nestvision.nest.proxy.nest.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nestvision.nest.proxy.base.entity.BaseEntity;

import lombok.Data;

@Data
@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "SOLVE_DEGREE")
public class SolveDegree {
	@Id
    @GeneratedValue
	private Long id;
	private String upHospital;
	private String upHospitalName;
	private Integer errorCount = 0;
	private Integer solveCount = 0;
	private float solveRate = 0f;
	private Date time;
	private SolveType solveType;
	
	public enum SolveType{
		day,week,month
	}
}
