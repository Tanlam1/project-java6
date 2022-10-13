package com.poly.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.poly.dao.CategoryDAO;
import com.poly.entity.Category;
import com.poly.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired private CategoryDAO cDao;

	@Override
	public Category findById(String username) {
		return cDao.findById(username).get();
	}

	@Override
	public List<Category> findAll() {
		return cDao.findAll();
	}

	@Override
	public Category create(Category category) {
		return cDao.save(category);
	}

	@Override
	public Category update(Category category) {
		return cDao.save(category);
	}

	@Override
	public void deleteById(String id) {
		cDao.deleteById(id);
	}
	
}
