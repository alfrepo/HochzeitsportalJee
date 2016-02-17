package de.hochzeitsportal.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Foto
 *
 */
@Entity
public class Foto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	String id;
	
	@Column(name="pathPreviewFoto")
	String pathPreviewFoto;
	
	@Column(name="pathFullSizeFoto")
	String pathFullSizeFoto;
	
	@Column(name="priority")
	int priority;

	public Foto() {
		super();
	}
   
}
