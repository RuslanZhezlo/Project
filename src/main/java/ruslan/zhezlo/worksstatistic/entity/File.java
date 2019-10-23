package ruslan.zhezlo.worksstatistic.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder


@Entity
public class File {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;


    @ManyToOne
    private Division division;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Product product;

    @ManyToMany
    private List<Location> locations = new ArrayList<>();


    @ManyToMany
    private List<Date> dates = new ArrayList<>();

    @ManyToMany (mappedBy = "files")
    private List<Inspector> inspectors = new ArrayList<>();

}


