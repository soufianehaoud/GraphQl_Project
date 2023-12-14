package ma.xproce.videoservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class VideoDtoInput {
    private Long id;
    private String name;
    private String url;
    private String description;
    private String datePublication;
    private CreatorDto creator;
}
