package ruslan.zhezlo.worksstatistic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ruslan.zhezlo.worksstatistic.entity.File;
import ruslan.zhezlo.worksstatistic.entity.Product;



    @Repository
    public interface ProductRepository extends JpaRepository<Product, Long> {

    }

