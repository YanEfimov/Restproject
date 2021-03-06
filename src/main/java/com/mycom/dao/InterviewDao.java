package com.mycom.dao;

import com.mycom.entity.Interview;

import java.util.List;

public interface InterviewDao {

	public List<Interview> findAll();

	public List<Interview> sort(String type);

	public Interview FindById(long id);

	public void insert(Interview interview);

	public void update(Interview interview);

	public void delete(long interview_id);

}
