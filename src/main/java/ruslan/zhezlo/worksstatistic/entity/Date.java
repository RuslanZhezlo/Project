package ruslan.zhezlo.worksstatistic.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter

@Entity
public class Date {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;

    @ManyToMany (mappedBy = "dates")
    private List<File> files;

    @ManyToMany (mappedBy = "dates")
    private List<Division> divisions;

    @ManyToMany (mappedBy = "dates")
    private List<Client> clients;

    @ManyToMany (mappedBy = "dates")
    private List<Product> products;

    @ManyToMany (mappedBy = "dates")
    private List<Location> locations;

    @ManyToMany (mappedBy = "dates")
    private List<Inspector> inspectors;



}
