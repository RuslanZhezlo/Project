package ruslan.zhezlo.worksstatistic.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter

@Entity
public class Travel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;
    private Long daily;
    private Long dayHour;
    private Long nightHour;
    private Long live;
    private String address;
    private Long kilometers;
    private String route;


    @OneToOne (mappedBy = "travel")
    private Inspector inspector;


}
