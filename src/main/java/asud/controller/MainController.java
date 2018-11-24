package asud.controller;

import asud.dao.AutomationSystemDAO;
import asud.entity.AutomationSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MainController {
  private static final long DEFAULT_ID = 1L;

  @Autowired
  private AutomationSystemDAO systemDAO;

  @RequestMapping(value = "/" , method = RequestMethod.GET)
  public String showPage(final Model model) {

    final List<AutomationSystem> automationSystems = systemDAO.findAll();
    final AutomationSystem automationSystem = systemDAO.findOne(DEFAULT_ID);
    model.addAttribute("automationSystemsList", automationSystems);
    model.addAttribute("automationSystem", automationSystem);
    return "index";
  }

  @RequestMapping(value = "/login")
  public String loginPage(){
    return "login";
  }
}
