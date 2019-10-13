package ruslan.zhezlo.worksstatistic.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ruslan.zhezlo.worksstatistic.entity.Travel;

@Repository
public interface TravelRepository extends JpaRepository<Travel, Long> {

}
