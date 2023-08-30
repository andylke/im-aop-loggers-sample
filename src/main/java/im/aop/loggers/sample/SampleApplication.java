package im.aop.loggers.sample;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import im.aop.loggers.sample.bar.Bar;
import im.aop.loggers.sample.bar.BarService;
import im.aop.loggers.sample.baz.Baz;
import im.aop.loggers.sample.baz.BazService;
import im.aop.loggers.sample.foo.Foo;
import im.aop.loggers.sample.foo.FooService;
import im.aop.loggers.sample.fred.Fred;
import im.aop.loggers.sample.fred.FredService;
import im.aop.loggers.sample.qux.Qux;
import im.aop.loggers.sample.qux.QuxService;

@SpringBootApplication
@EnableScheduling
public class SampleApplication {

  private static final Logger LOGGER = LoggerFactory.getLogger(SampleApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(SampleApplication.class, args);
  }

  @Autowired private FooService fooService;

  @Autowired private BarService barService;

  @Autowired private BazService bazService;

  @Autowired private QuxService quxService;

  @Autowired private FredService fredService;

  @Scheduled(initialDelay = 1000, fixedDelay = 15000)
  void runDemo() {
    final Foo foo = fooService.accept(new Foo("abc"));
    LOGGER.info("FooService.accept(Foo) returned [{}]", foo);

    final Bar bar = barService.accept(new Bar("abc"));
    LOGGER.info("BarService.accept(Bar) returned [{}]", bar);

    try {
      bazService.accept(new Baz("abc"));

    } catch (Exception e) {
      LOGGER.info("BazService.accept(Baz) thrown exception [{}]", e.getMessage());
    }

    try {
      bazService.accept("");

    } catch (Exception e) {
      LOGGER.info("BazService.accept(String) thrown exception [{}]", e.getMessage());
    }

    final Qux qux = quxService.accept(new Qux("abc"));
    LOGGER.info("QuxService.accept(Qux) returned [{}]", qux);

    final List<Fred> freds = fredService.accept("fred");
    LOGGER.info("FredService.accept(\"fred\") returned [{}]", freds);
  }
}
