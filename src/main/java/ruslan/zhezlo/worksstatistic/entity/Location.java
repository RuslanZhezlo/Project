package ruslan.zhezlo.worksstatistic.entity;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder


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
    private List<File> files = new ArrayList<>();

    @ManyToOne
    private Division division;

    @ManyToMany (mappedBy = "locations")
    private List<Client> clients = new ArrayList<>();

    @ManyToMany
    private List<Product> products = new ArrayList<>();

    @ManyToMany
    private List<Date> dates = new ArrayList<>();

    @ManyToMany(mappedBy = "locations")
    private List<Inspector> inspectors = new ArrayList<>();


}
