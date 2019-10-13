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

    @ManyToMany(mappedBy = "locations")
    private List<File> files;

    @ManyToOne
    private Division division;

    @ManyToMany (mappedBy = "locations")
    private List<Client> clients;

    @ManyToMany
    private List<Product> products;

    @ManyToMany
    private List<Date> dates;

    @ManyToMany(mappedBy = "locations")
    private List<Inspector> inspectors;








}
