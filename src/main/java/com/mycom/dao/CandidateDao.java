package com.mycom.dao;

import com.mycom.entity.Candidate;

import java.util.List;

public interface CandidateDao {

	public List<Candidate> findAll();

	public List<Candidate> sort(String type);

	public List<Candidate> findByState(String state);

	public Candidate findById(long id);

	public void insert(Candidate candidate);

	public void update(Candidate candidate);

	public void delete(long candidate_id);
}
