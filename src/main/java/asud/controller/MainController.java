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

  @Autowired
  private AutomationSystemDAO systemDAO;

  @RequestMapping(value = "/" , method = RequestMethod.GET)
  public String showPage(final Model model) {

    final List<AutomationSystem> automationSystems = systemDAO.findAll();

    model.addAttribute("hello", "Микитин зло");
    return "initial";
  }

  @RequestMapping(value = "/login")
  public String loginPage(){
    return "login";
  }
}
