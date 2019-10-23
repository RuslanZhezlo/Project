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
public class Date {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;

    @ManyToMany (mappedBy = "dates")
    private List<File> files = new ArrayList<>();

    @ManyToMany (mappedBy = "dates")
    private List<Division> divisions = new ArrayList<>();

    @ManyToMany (mappedBy = "dates")
    private List<Client> clients = new ArrayList<>();

    @ManyToMany (mappedBy = "dates")
    private List<Product> products = new ArrayList<>();

    @ManyToMany (mappedBy = "dates")
    private List<Location> locations = new ArrayList<>();

    @ManyToMany (mappedBy = "dates")
    private List<Inspector> inspectors = new ArrayList<>();

}
