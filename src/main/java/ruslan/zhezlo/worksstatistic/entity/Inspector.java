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
public class Inspector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String login;
    private String password;

    @ManyToMany
    private List<File> files;

    @ManyToMany(mappedBy = "inspectors")
    private List<Division> divisions;

    @ManyToMany (mappedBy = "inspectors")
    private List<Client> clients;

    @ManyToMany (mappedBy = "inspectors")
    private List<Product> products;

    @ManyToMany
    private List<Location> locations;

    @ManyToMany
    private List<Date> dates;

    @OneToOne
    private Travel travel;


}
