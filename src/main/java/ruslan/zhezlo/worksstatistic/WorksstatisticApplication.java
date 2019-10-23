package ruslan.zhezlo.worksstatistic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ruslan.zhezlo.worksstatistic.entity.Client;
import ruslan.zhezlo.worksstatistic.entity.Date;
import ruslan.zhezlo.worksstatistic.entity.Division;
import ruslan.zhezlo.worksstatistic.repository.*;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class WorksstatisticApplication {

//    @Autowired
//    private ClientRepository clientRepository;
//
//    @Autowired
//    private DateRepository dateRepository;
//
//    @Autowired
//    private DivisionRepository divisionRepository;
//
//    @Autowired
//    private FileRepository fileRepository;
//
//    @Autowired
//    private InspectorRepository inspectorRepository;
//
//    @Autowired
//    private LocationRepository locationRepository;
//
//    @Autowired
//    private TravelRepository travelRepository;
//
//

//    @PostConstruct
//    public void init () {
//        Client client = new Client ();
//        client.setName("Jupaks");
//        clientRepository.save(client);
//
//        clientRepository.findAll().stream().map(Client::getName).forEach(System.out::println);
//    }





    public static void main(String[] args) {

        SpringApplication.run(WorksstatisticApplication.class, args);

        }
    }


