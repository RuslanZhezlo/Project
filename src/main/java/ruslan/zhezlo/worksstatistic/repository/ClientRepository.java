package ruslan.zhezlo.worksstatistic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ruslan.zhezlo.worksstatistic.entity.Client;



    @Repository
    public interface ClientRepository extends JpaRepository <Client, Long>{

    }

