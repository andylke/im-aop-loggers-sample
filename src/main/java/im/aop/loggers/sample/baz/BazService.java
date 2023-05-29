package im.aop.loggers.sample.baz;

import im.aop.loggers.advice.afterthrowing.LogAfterThrowing;
import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

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
