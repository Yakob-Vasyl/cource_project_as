package asud.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Intruder {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;

  @ElementCollection(fetch = FetchType.EAGER)
  @Fetch(value = FetchMode.SUBSELECT)
  private List<String> intruders;

  @ManyToOne
  private AutomationSystem automationSystem;

  public long getId() {
    return id;
  }

  public void setId(final long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public List<String> getIntruders() {
    return intruders;
  }

  public AutomationSystem getAutomationSystem() {
    return automationSystem;
  }

  public void setAutomationSystem(final AutomationSystem automationSystem) {
    this.automationSystem = automationSystem;
  }

  public void setIntruders(final List<String> intruders) {
    this.intruders = intruders;
  }

  public Intruder() {
  }
}
