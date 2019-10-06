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
    private Location location;

    @ManyToOne
    private Date date;

    @ManyToOne
    private Inspector inspector;

}


