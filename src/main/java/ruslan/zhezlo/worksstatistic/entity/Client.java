package ruslan.zhezlo.worksstatistic.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder


@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @OneToMany (mappedBy = "client")
    private List<File> files = new ArrayList<>();

    @ManyToOne
    private Division division;

    @ManyToMany
    private List<Product> products = new ArrayList<>();

    @ManyToMany
    private List<Location> locations = new ArrayList<>();

    @ManyToMany
    private List<Date> dates = new ArrayList<>();

    @ManyToMany
    private List<Inspector> inspectors = new ArrayList<>();






}

