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
import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @OneToMany (mappedBy = "client")
    private List<File> files;

    @ManyToOne
    private Division division;

    @ManyToMany
    private List<Product> product;

    @ManyToMany
    private Location location;

    @ManyToMany
    private List<Date> dates;

    @ManyToMany (mappedBy = "clients")
    private Inspector inspector;






}

