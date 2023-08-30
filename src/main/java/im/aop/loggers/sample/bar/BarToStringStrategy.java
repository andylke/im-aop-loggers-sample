package im.aop.loggers.sample.bar;

import org.springframework.stereotype.Component;

import im.aop.loggers.messageinterpolation.ToStringStrategy;

@Component
public class BarToStringStrategy implements ToStringStrategy {

  @Override
  public boolean supports(Object object) {
    return object instanceof Bar;
  }

  @Override
  public String toString(Object object) {
    return "Bar is " + ((Bar) object).getBar();
  }
}
