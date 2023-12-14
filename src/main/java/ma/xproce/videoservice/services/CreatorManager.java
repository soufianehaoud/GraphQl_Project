package ma.xproce.videoservice.services;

import ma.xproce.videoservice.dtos.CreatorDto;
import ma.xproce.videoservice.dtos.CreatorDtoInput;

public interface CreatorManager {
    CreatorDto getByID(Long id);
    CreatorDto saveCreator(CreatorDtoInput creatorDtoInput);
}
