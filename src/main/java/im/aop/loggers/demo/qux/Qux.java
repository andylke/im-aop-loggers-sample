package im.aop.loggers.demo.qux;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Qux {

  private String qux;

  public Qux() {}

  public Qux(String qux) {
    this.qux = qux;
  }

  public String getQux() {
    return qux;
  }

  public void setQuz(String qux) {
    this.qux = qux;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
