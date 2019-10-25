package ruslan.zhezlo.worksstatistic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ruslan.zhezlo.worksstatistic.dto.file.FileRequest;
import ruslan.zhezlo.worksstatistic.entity.Client;
import ruslan.zhezlo.worksstatistic.entity.Division;
import ruslan.zhezlo.worksstatistic.entity.File;
import ruslan.zhezlo.worksstatistic.repository.FileRepository;

@Service
public class FileService {

    @Autowired
    private FileRepository fileRepository;

    @Autowired
    private ClientService clientService;

    @Autowired
    private DivisionService divisionService;




    public void create(FileRequest request) {
        Client client = clientService.findOne(request.getClientId());
        Division division = divisionService.findOne(request.getDivisionId());
        File.builder()
                .number(request.getNumber())
                .client(client)
                .division(division)
                .build();
    }


    public void update(Long id, FileRequest request) {
        Client client = clientService.findOne(request.getClientId());
        Division division = divisionService.findOne(request.getDivisionId());
        File file = findOne(id);
        file.setNumber(request.getNumber());
        file.setClient(client);
        file.setDivision(division);
        fileRepository.save(file);
    }

    public void delete (Long id){
        fileRepository.delete(findOne(id));
    }

    public File findOne(Long id){
        return fileRepository.findById(id).
                orElseThrow(()->new IllegalArgumentException("File with id " + id + "not exists"));
    }

}
