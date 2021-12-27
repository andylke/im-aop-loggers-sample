package im.aop.loggers.sample.bar;

import org.springframework.stereotype.Service;

import im.aop.loggers.advice.afterreturning.LogAfterReturning;

@Service
public class BarService {

  @LogAfterReturning
  public Bar accept(Bar bar) {
    return bar;
  }
}
