package ruslan.zhezlo.worksstatistic.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter

@Entity
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;



    @OneToMany (mappedBy = "Division")
    private List <File> files;

    @OneToMany(mappedBy = "Division")
    private List<Client> clients;

    @OneToMany(mappedBy = "Division")
    private List<Product> products;

    @OneToMany(mappedBy = "Divisions")
    private List<Location> locations;

    @ManyToMany
    private Date date;

    @ManyToMany(mappedBy = "Divisions")
    private Inspector inspector;







}
