package im.aop.loggers.demo.foo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Foo {

  private String foo;

  public Foo() {}

  public Foo(String foo) {
    this.foo = foo;
  }

  public String getFoo() {
    return foo;
  }

  public void setFoo(String foo) {
    this.foo = foo;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
