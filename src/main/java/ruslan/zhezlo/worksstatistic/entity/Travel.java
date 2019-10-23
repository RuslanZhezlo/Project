package ruslan.zhezlo.worksstatistic.entity;


import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder


@Entity
public class Travel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;
    private Long daily;
    private Long hourDay;
    private Long hourNight;
    private Long live;
    private String address;
    private Long kilometers;
    private String route;


    @ManyToOne
    private Inspector inspector;


}
