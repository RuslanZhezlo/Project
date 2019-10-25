package ruslan.zhezlo.worksstatistic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ruslan.zhezlo.worksstatistic.dto.file.FileRequest;
import ruslan.zhezlo.worksstatistic.service.FileService;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping
    public void create(@RequestBody FileRequest fileRequest) {
        fileService.create(fileRequest);
    }

    @PutMapping
    public void update (Long id, @RequestBody FileRequest fileRequest) {
        fileService.update(id, fileRequest);
    }
}
