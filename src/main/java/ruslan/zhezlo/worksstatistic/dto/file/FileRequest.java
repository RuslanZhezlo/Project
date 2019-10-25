package ruslan.zhezlo.worksstatistic.dto.file;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FileRequest {

    private String number;
    private Long clientId;
    private Long dateId;
    private Long divisionId;
    private Long inspectorId;
    private Long locationId;
    private Long productId;

}
