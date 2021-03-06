package asud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Regulation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;

  @ManyToOne
  private AutomationSystem automationSystem;

  public Regulation() {
  }

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

  public AutomationSystem getAutomationSystem() {
    return automationSystem;
  }

  public void setAutomationSystem(final AutomationSystem system) {
    this.automationSystem = system;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    final Regulation that = (Regulation) o;
    return id == that.id &&
            Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }
}
