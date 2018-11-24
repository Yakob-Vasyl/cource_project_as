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
public class Protection {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;

  @ElementCollection(fetch = FetchType.EAGER)
  @Fetch(value = FetchMode.SUBSELECT)
  private List<String> protections;

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

  public List<String> getProtections() {
    return protections;
  }

  public void setProtections(final List<String> protections) {
    this.protections = protections;
  }

  public AutomationSystem getAutomationSystem() {
    return automationSystem;
  }

  public void setAutomationSystem(final AutomationSystem automationSystem) {
    this.automationSystem = automationSystem;
  }

  public Protection() {
  }

}
