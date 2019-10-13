package ruslan.zhezlo.worksstatistic.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ruslan.zhezlo.worksstatistic.entity.Inspector;

@Repository
public interface InspectorRepository extends JpaRepository<Inspector, Long> {
}
