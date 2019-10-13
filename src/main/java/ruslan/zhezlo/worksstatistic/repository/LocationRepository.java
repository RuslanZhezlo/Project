package ruslan.zhezlo.worksstatistic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ruslan.zhezlo.worksstatistic.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

}
