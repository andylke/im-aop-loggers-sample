package im.aop.loggers.sample.fred;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import im.aop.loggers.advice.around.LogAround;

@LogAround(declaringClass = FredRepository.class)
public interface FredRepository extends JpaRepository<Fred, Long> {

  Page<Fred> findAllByName(Pageable pageable, String name);
}
