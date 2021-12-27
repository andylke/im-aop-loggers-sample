package im.aop.loggers.sample.baz;

import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import im.aop.loggers.advice.afterthrowing.LogAfterThrowing;

@Validated
@Service
public class BazService {

  @LogAfterThrowing
  public Baz accept(Baz baz) {
    throw new IllegalArgumentException("Baz");
  }

  @LogAfterThrowing
  public Baz accept(@NotBlank String message) {
    return new Baz(message);
  }
}
