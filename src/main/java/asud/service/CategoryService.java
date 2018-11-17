package asud.service;

import asud.entity.Category;

import java.util.List;

public interface CategoryService {

  void save(Category category);

  List<Category> findAll();

  Category findOne(long id);

  void delete(long id);

}
