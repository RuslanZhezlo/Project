package ruslan.zhezlo.worksstatistic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ruslan.zhezlo.worksstatistic.dto.division.DivisionRequest;
import ruslan.zhezlo.worksstatistic.dto.division.DivisionResponse;
import ruslan.zhezlo.worksstatistic.service.DivisionService;

import java.util.List;

@RestController
@RequestMapping("/division")
public class DivisionController {

    @Autowired
    private DivisionService divisionService;

    @PostMapping
    public void create (@RequestBody DivisionRequest request){
        divisionService.create(request);
    }

    @GetMapping
    public List<DivisionResponse> findAll(){
        return divisionService.findAll();
    }


}
