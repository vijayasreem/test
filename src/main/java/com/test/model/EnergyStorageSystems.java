package com.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="energy_storage_systems")
public class EnergyStorageSystems {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
	
	@Column(name="cost_effectiveness")
    private boolean costEffectiveness;
	
	@Column(name="efficiency")
    private boolean efficiency;
	
	@Column(name="reliability")
    private boolean reliability;
	
	@Column(name="security")
    private boolean security;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isCostEffectiveness() {
		return costEffectiveness;
	}

	public void setCostEffectiveness(boolean costEffectiveness) {
		this.costEffectiveness = costEffectiveness;
	}

	public boolean isEfficiency() {
		return efficiency;
	}

	public void setEfficiency(boolean efficiency) {
		this.efficiency = efficiency;
	}

	public boolean isReliability() {
		return reliability;
	}

	public void setReliability(boolean reliability) {
		this.reliability = reliability;
	}

	public boolean isSecurity() {
		return security;
	}

	public void setSecurity(boolean security) {
		this.security = security;
	}
	
}