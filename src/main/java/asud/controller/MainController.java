package asud.controller;

import asud.entity.Category;
import asud.entity.Segment;
import asud.service.CategoryService;
import asud.service.SegmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class MainController {
  private static final long DEFAULT_CATEGORY_ID = 1L;

  @Autowired
  private CategoryService categoryService;

  @Autowired
  private SegmentService segmentService;

  @GetMapping("/")
  public String showPage(final Model model) {
    setupModel(DEFAULT_CATEGORY_ID, model);
    return "index";
  }

  @GetMapping("/{id}")
  public String showPage(@PathVariable final long id, final Model model) {
    setupModel(id, model);
    return "index";
  }

  @GetMapping("/login")
  public String loginPage(final Model model){
    return "login";
  }

  private void setupModel(final long id, final Model model) {
    final String categoryName = categoryService.findOne(id).getName();
    final List<Segment> segmentsByCategory = segmentService.findSegmentsByCategory(categoryName);
    model.addAttribute("category", categoryName);
    model.addAttribute("segments", segmentsByCategory);
  }

  @ModelAttribute()
  public void setupCategories(final Model model){
    final List<Category> categoryList = categoryService.findAll();
    model.addAttribute("listCategory", categoryList);
  }
}
