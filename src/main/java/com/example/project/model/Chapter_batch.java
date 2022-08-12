package com.example.project.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="chapter_batch")
public class Chapter_batch implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String start_date;
	private String end_date;
	private int delete_status;
	
	@ManyToOne
	@JoinColumn(name="chapter_id")
	private Chapter chapter;
	
	@ManyToOne
	@JoinColumn(name="batch_id")
	private Batch batch;
}
