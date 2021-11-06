package im.aop.loggers.demo.foo;

import org.springframework.stereotype.Service;

import im.aop.loggers.advice.before.LogBefore;

@Service
public class FooService {

  @LogBefore
  public Foo accept(final Foo foo) {
    return foo;
  }
}
