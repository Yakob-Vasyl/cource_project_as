package asud.service.impl;

import asud.dao.CategoryDAO;
import asud.entity.Category;
import asud.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultCategoryService implements CategoryService {

  @Autowired
  private CategoryDAO categoryDAO;

  @Override
  public void save(final Category category) {
    categoryDAO.save(category);
  }

  @Override
  public List<Category> findAll() {
    return categoryDAO.findAll();
  }

  @Override
  public Category findOne(final long id) {
    return categoryDAO.findOne(id);
  }

  @Override
  public void delete(final long id) {
    categoryDAO.delete(id);
  }


}
