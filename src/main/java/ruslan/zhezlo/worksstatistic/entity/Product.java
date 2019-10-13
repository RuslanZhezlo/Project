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
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String unitsOfMeasurement;

    private Long quantity;

    @OneToMany (mappedBy = "product")
    private List<File> files;

    @ManyToOne
    private Division division;

    @ManyToMany(mappedBy = "products")
    private List<Client> clients;

    @ManyToMany(mappedBy = "products")
    private List<Location> locations;

    @ManyToMany
    private List<Date> dates;

    @ManyToMany
    private List<Inspector> inspectors;




}
