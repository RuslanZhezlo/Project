package ruslan.zhezlo.worksstatistic.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ruslan.zhezlo.worksstatistic.dto.client.ClientRequest;
import ruslan.zhezlo.worksstatistic.dto.client.ClientResponse;
import ruslan.zhezlo.worksstatistic.service.ClientService;

import java.util.List;

@RestController
@RequestMapping ("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public void create(@RequestBody ClientRequest request) {
        clientService.create(request);
    }

    @GetMapping
    public List<ClientResponse> findAll() {
        return clientService.findAll();
    }

}
