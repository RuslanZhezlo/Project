package ruslan.zhezlo.worksstatistic.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter

@Entity
public class File {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;


    @ManyToOne
    private Division division;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Product product;

    @ManyToMany
    private List<Location> locatoin;


    @ManyToMany
    private List<Date> dates;

    @ManyToMany (mappedBy = "files")
    private List<Inspector> inspectors;

}


