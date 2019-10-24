package ruslan.zhezlo.worksstatistic.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ruslan.zhezlo.worksstatistic.dto.client.ClientRequest;
import ruslan.zhezlo.worksstatistic.dto.client.ClientResponse;
import ruslan.zhezlo.worksstatistic.entity.Client;
import ruslan.zhezlo.worksstatistic.repository.ClientRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {
   @Autowired
    private ClientRepository clientRepository;

   public void create (ClientRequest request) {
       Client client = new Client();
       client.setName(request.getName());
       clientRepository.save(client);
   }

   public List<ClientResponse> findAll(){
       List<Client> all = clientRepository.findAll();
       return all.stream().map(this::clientToClientResponse).collect(Collectors.toList());
   }

   private ClientResponse clientToClientResponse (Client client){
       ClientResponse cr = new ClientResponse();
       cr.setName(client.getName());
       cr.setId(client.getId());
       return cr;
   }

}
