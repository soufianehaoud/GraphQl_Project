package ma.xproce.videoservice.mappers;

import ma.xproce.videoservice.dtos.CreatorDto;
import ma.xproce.videoservice.dtos.CreatorDtoInput;
import ma.xproce.videoservice.dtos.VideoDto;
import ma.xproce.videoservice.dtos.VideoDtoInput;
import ma.xproce.videoservice.entities.Creator;
import ma.xproce.videoservice.entities.Video;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CreatorMappers {
    private final ModelMapper modelMapper=new ModelMapper();


    public Creator fromCreatorDtoToCreator(CreatorDto creatorDto) {
        return this.modelMapper.map(creatorDto, Creator.class);
    }

    public CreatorDto fromCreatorToCreatorDto(Creator creator) {
        return this.modelMapper.map(creator, CreatorDto.class);
    }
    public CreatorDto fromCreatorDtoInputToCreatorDto(CreatorDtoInput creatorDtoInput) {
        return this.modelMapper.map(creatorDtoInput, CreatorDto.class);
    }

    public CreatorDtoInput fromCreatorDtoToCreatorDtoInput(CreatorDto creatorDTo) {
        return this.modelMapper.map(creatorDTo, CreatorDtoInput.class);
    }

    public Creator fromCreatorDtoInputToCreator(CreatorDtoInput creatorDtoInput) {
        return this.modelMapper.map(creatorDtoInput, Creator.class);
    }
}
