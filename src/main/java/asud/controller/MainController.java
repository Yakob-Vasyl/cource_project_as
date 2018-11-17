package asud.controller;

import asud.dao.AutomationSystemDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

  private AutomationSystemDAO systemDAO;

  @RequestMapping(value = "/" , method = RequestMethod.GET)
  public String showPage(final Model model) {

//    systemDAO.findAll();
    model.addAttribute("hello", "Микитин зло");
    return "initial";
  }
}
