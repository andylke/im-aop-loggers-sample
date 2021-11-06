package im.aop.loggers.demo.bar;

import org.springframework.stereotype.Service;

import im.aop.loggers.advice.after.returning.LogAfterReturning;

@Service
public class BarService {

  @LogAfterReturning
  public Bar accept(Bar bar) {
    return bar;
  }
}
