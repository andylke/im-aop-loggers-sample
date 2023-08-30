package im.aop.loggers.sample.fred;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Fred {

  @Id private long id;

  private String name;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
