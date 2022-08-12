package com.example.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="batch")
@Data
public class Batch implements Serializable {
	
	private static final long serialVersionUID = 1L;
		@Id
		private int id;
		private String name;
		private int created_date;
		private int delete_status;
		
		@ManyToOne
		@JoinColumn(name="course_id")
		private Course course;
		
		@OneToMany(mappedBy = "batch")
		private List<Chapter_batch> chapter_batches = new ArrayList<>();
}
