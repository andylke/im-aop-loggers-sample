package im.aop.loggers.sample.fred;

import im.aop.loggers.advice.aftercommit.LogAfterCommit;
import im.aop.loggers.advice.afterrollback.LogAfterRollback;
import im.aop.loggers.advice.beforecommit.LogBeforeCommit;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FredService {

  @Autowired private FredRepository repository;

  public List<Fred> findAllByName(String name) {
    return repository.findAllByName(PageRequest.ofSize(10), "fred").getContent();
  }

  @LogBeforeCommit
  @LogAfterCommit
  public void save(Fred fred) {
    repository.save(fred);
  }

  @LogAfterRollback
  public void saveAndThrow(Fred fred) {
    repository.save(fred);
    throw new IllegalStateException();
  }
}
