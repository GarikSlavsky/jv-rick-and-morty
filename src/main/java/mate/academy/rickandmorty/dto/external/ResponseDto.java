package mate.academy.rickandmorty.dto.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import lombok.Data;
import mate.academy.rickandmorty.dto.internal.CreatePersonageRequestDto;
import org.springframework.stereotype.Component;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class ResponseDto {
    private List<CreatePersonageRequestDto> results;
    private InfoDto info;
}
