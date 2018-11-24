package asud.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class AutomationSystem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;

  @OneToMany(mappedBy = "automationSystem", fetch = FetchType.EAGER)
  @Fetch(value = FetchMode.SUBSELECT)
  private List<Threat> threats;

  @OneToMany(mappedBy = "automationSystem", fetch = FetchType.EAGER)
  @Fetch(value = FetchMode.SUBSELECT)
  private List<Regulation> regulations;

  @OneToMany(mappedBy = "automationSystem", fetch = FetchType.EAGER)
  @Fetch(value = FetchMode.SUBSELECT)
  private List<Intruder> intruders;

  @OneToMany(mappedBy = "automationSystem", fetch = FetchType.EAGER)
  @Fetch(value = FetchMode.SUBSELECT)
  private List<Protection> protections;

  @ElementCollection(fetch = FetchType.EAGER)
  @Fetch(value = FetchMode.SUBSELECT)
  private List<String> functions;

  @ElementCollection(fetch = FetchType.EAGER)
  @Fetch(value = FetchMode.SUBSELECT)
  private List<String> examlpes;

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

  public List<Threat> getThreats() {
    return threats;
  }

  public void setThreats(final List<Threat> threats) {
    this.threats = threats;
  }

  public List<Regulation> getRegulations() {
    return regulations;
  }

  public void setRegulations(final List<Regulation> regulations) {
    this.regulations = regulations;
  }

  public List<Intruder> getIntruders() {
    return intruders;
  }

  public void setIntruders(final List<Intruder> intruders) {
    this.intruders = intruders;
  }

  public List<Protection> getProtections() {
    return protections;
  }

  public void setProtections(final List<Protection> protections) {
    this.protections = protections;
  }

  public List<String> getFunctions() {
    return functions;
  }

  public void setFunctions(final List<String> functions) {
    this.functions = functions;
  }

  public List<String> getExamlpes() {
    return examlpes;
  }

  public void setExamlpes(final List<String> examlpes) {
    this.examlpes = examlpes;
  }

  public AutomationSystem() {
  }
}
