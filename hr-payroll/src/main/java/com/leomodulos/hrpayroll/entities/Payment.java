package com.leomodulos.hrpayroll.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable{
	private static final long serialVersionUID = 1L;

	private String name;	
	private Double dailyIncome;	
	private Integer days;
	
	public double getTotal() {
		return days * dailyIncome;
	}
}
