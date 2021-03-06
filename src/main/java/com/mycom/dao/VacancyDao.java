package com.mycom.dao;

import com.mycom.entity.Vacancy;

import java.util.List;

public interface VacancyDao {

	public List<Vacancy> findAll();

	public List<Vacancy> sort(String type);

	public Vacancy findById(long id);

	public void insert(Vacancy vacancy);

	public void update(Vacancy vacancy);

	public void delete(long vacancy_id);

}
