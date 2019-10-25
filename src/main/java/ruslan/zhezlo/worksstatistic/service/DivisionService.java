package ruslan.zhezlo.worksstatistic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ruslan.zhezlo.worksstatistic.dto.division.DivisionRequest;
import ruslan.zhezlo.worksstatistic.dto.division.DivisionResponse;
import ruslan.zhezlo.worksstatistic.entity.Client;
import ruslan.zhezlo.worksstatistic.entity.Division;
import ruslan.zhezlo.worksstatistic.repository.DivisionRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DivisionService {
    @Autowired
    private DivisionRepository divisionRepository;

    public void create(DivisionRequest request){
        Division division = new Division();
        division.setName(request.getName());
        divisionRepository.save(division);
    }

    public List<DivisionResponse> findAll() {
        List<Division> all = divisionRepository.findAll();
        return all.stream().map(this::divisionToDivisionResponse).collect(Collectors.toList());
    }

    public Division findOne(Long id){
        return divisionRepository.findById(id).
                orElseThrow(()->new IllegalArgumentException("Division with id " + id + "not exists"));
    }
    private DivisionResponse divisionToDivisionResponse(Division division){
        DivisionResponse dr = new DivisionResponse();
        dr.setName(division.getName());
        dr.setId(division.getId());
        return dr;
        }


}
