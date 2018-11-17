package asud.entity;

import javax.persistence.Entity;

@Entity
public class AutomationSystem {

  private long id;

  private String name;


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

  public AutomationSystem() {
  }
}
