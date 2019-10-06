package ruslan.zhezlo.worksstatistic.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Setter

@Entity
public class Inspector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}