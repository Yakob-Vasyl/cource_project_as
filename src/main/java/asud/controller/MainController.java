package asud.controller;

import asud.dao.AutomationSystemDAO;
import asud.entity.AutomationSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MainController {
  private static final long DEFAULT_ID = 1L;

  @Autowired
  private AutomationSystemDAO systemDAO;

  @RequestMapping(value = "/" , method = RequestMethod.GET)
  public String showPageFirst(final Model model) {
    return show(model,DEFAULT_ID);
  }

  @RequestMapping(value = "/{id}")
  public String showPage(final Model model, @PathVariable("id") final long id){
    return show(model, id);
  }
  private String show(final Model model, final long id) {
    final List<AutomationSystem> automationSystems = systemDAO.findAll();
    final AutomationSystem automationSystem = systemDAO.findOne(id);
    model.addAttribute("automationSystemsList", automationSystems);
    model.addAttribute("automationSystem", automationSystem);
    return "index";
  }


  @RequestMapping(value = "/login")
  public String loginPage(){
    return "login";
  }
}
