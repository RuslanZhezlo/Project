package ruslan.zhezlo.worksstatistic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ruslan.zhezlo.worksstatistic.entity.Division;
import ruslan.zhezlo.worksstatistic.entity.File;


    @Repository
    public interface DivisionRepository extends JpaRepository<Division, Long> {

    }

