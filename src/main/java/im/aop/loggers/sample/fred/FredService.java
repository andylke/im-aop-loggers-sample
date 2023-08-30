package im.aop.loggers.sample.fred;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class FredService {

  @Autowired private FredRepository repository;

  public List<Fred> accept(String name) {
    return repository.findAllByName(PageRequest.ofSize(10), "fred").getContent();
  }
}
