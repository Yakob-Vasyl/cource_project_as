package asud.entity;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;
import java.util.Objects;

@Entity
public class Threat {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;

  @ElementCollection
  private List<String> softwareThreats;

  @ElementCollection
  private List<String> hardwareThreats;

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

  public List<String> getSoftwareThreats() {
    return softwareThreats;
  }

  public void setSoftwareThreats(final List<String> softwareThreats) {
    this.softwareThreats = softwareThreats;
  }

  public List<String> getHardwareThreats() {
    return hardwareThreats;
  }

  public void setHardwareThreats(final List<String> hardwareThreats) {
    this.hardwareThreats = hardwareThreats;
  }

  public AutomationSystem getAutomationSystem() {
    return automationSystem;
  }

  public void setAutomationSystem(final AutomationSystem automationSystem) {
    this.automationSystem = automationSystem;
  }


  public Threat() {
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    final Threat threat = (Threat) o;
    return id == threat.id &&
            Objects.equals(name, threat.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }
}
