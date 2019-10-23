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
public class Inspector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String tabnumber;
    private String login;
    private String password;

    @ManyToMany
    private List<File> files = new ArrayList<>();

    @ManyToMany(mappedBy = "inspectors")
    private List<Division> divisions = new ArrayList<>();

    @ManyToMany (mappedBy = "inspectors")
    private List<Client> clients = new ArrayList<>();

    @ManyToMany (mappedBy = "inspectors")
    private List<Product> products = new ArrayList<>();

    @ManyToMany
    private List<Location> locations = new ArrayList<>();

    @ManyToMany
    private List<Date> dates = new ArrayList<>();

    @OneToMany (mappedBy = "inspector")
    private List<Travel> travels = new ArrayList<>();


}
