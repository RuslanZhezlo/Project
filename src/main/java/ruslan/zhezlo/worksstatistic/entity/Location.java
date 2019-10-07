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
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameOfCompany;
    private String station;
    private String locality;
    private String region;

    @ManyToMany(mappedBy = "location")
    private List<File> files;

    @ManyToOne
    private List<Division> divisions;

    @ManyToMany (mappedBy = "location")
    private List<Client> clients;

    @ManyToMany
    private Product product;

    @ManyToMany
    private List<Date> dates;

    @ManyToMany(mappedBy = "inspector")
    private List<Inspector> inspectors;








}
