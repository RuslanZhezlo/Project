package ruslan.zhezlo.worksstatistic.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ruslan.zhezlo.worksstatistic.entity.Date;

@Repository
public interface DateRepository extends JpaRepository<Date, Long> {
}
