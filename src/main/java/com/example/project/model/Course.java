package com.example.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="course")
public class Course implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String name;
	private String created_date;
	private int delete_status;
	
	@OneToMany(mappedBy = "course")
	private List <Chapter> chapters = new ArrayList<>();
	
	@OneToMany(mappedBy = "course")
	private List<Batch> batches = new ArrayList<>();
	
}
