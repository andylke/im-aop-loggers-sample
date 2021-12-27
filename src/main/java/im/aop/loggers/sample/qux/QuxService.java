package im.aop.loggers.sample.qux;

import org.springframework.stereotype.Service;

import im.aop.loggers.advice.around.LogAround;

@Service
public class QuxService {

  @LogAround(elapsedTimeLimit = 5)
  public Qux accept(Qux qux) {
    try {
      Thread.sleep(10);
    } catch (InterruptedException e) {
    }
    return qux;
  }
}
