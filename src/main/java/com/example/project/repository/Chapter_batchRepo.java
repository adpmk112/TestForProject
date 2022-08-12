package com.example.project.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Chapter_batch;

@Repository
public interface Chapter_batchRepo extends CrudRepository<Chapter_batch, Long> {
	
		@Query(value = "SELECT CHAPTER.NAME,CHAPTER_BATCH.START_DATE,CHAPTER_BATCH.END_DATE FROM CHAPTER_BATCH\r\n"
				+ " JOIN CHAPTER ON CHAPTER_BATCH.CHAPTER_ID = CHAPTER.ID WHERE CHAPTER_BATCH.BATCH_ID = ?;",
				nativeQuery = true)
		Chapter_batch selectCourseDetail(Integer id);
		
		/*
		 * select chapter.name,chapter_batch.start_date,chapter_batch.end_date from
		 * chapter_batch join chapter on chapter_batch.chapter_id = chapter.id where
		 * chapter_batch.batch_id = 1;
		 */
}
