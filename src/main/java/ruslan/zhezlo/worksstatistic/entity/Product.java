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
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String unitsOfMeasurement;

    private Long quantity;

    @OneToMany (mappedBy = "product")
    private List<File> files = new ArrayList<>();

    @ManyToOne
    private Division division;

    @ManyToMany(mappedBy = "products")
    private List<Client> clients = new ArrayList<>();

    @ManyToMany(mappedBy = "products")
    private List<Location> locations = new ArrayList<>();

    @ManyToMany
    private List<Date> dates = new ArrayList<>();

    @ManyToMany
    private List<Inspector> inspectors = new ArrayList<>();


}
