package com.idat.tareabodega.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Bodega")
@Entity
public class Bodega  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8930122964314706464L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idBodega;
	private String nombreBodega;
	
	public Integer getIdBodega() {
		return idBodega;
	}
	public void setIdBodega(Integer idBodega) {
		this.idBodega = idBodega;
	}
	public String getNombreBodega() {
		return nombreBodega;
	}
	public void setNombreBodega(String nombreBodega) {
		this.nombreBodega = nombreBodega;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Bodega() {
		super();
	}
	
	
	

}
