package ma.xproce.videoservice.services;

import ma.xproce.videoservice.dtos.CreatorDto;
import ma.xproce.videoservice.dtos.CreatorDtoInput;
import ma.xproce.videoservice.dtos.VideoDto;
import ma.xproce.videoservice.dtos.VideoDtoInput;
import ma.xproce.videoservice.entities.Creator;
import ma.xproce.videoservice.entities.Video;
import ma.xproce.videoservice.mappers.CreatorMappers;
import ma.xproce.videoservice.mappers.VideoMappers;
import ma.xproce.videoservice.repositories.CreatorRepository;
import ma.xproce.videoservice.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreatorManagerFirstImplementation implements CreatorManager{
    @Autowired
    private CreatorRepository creatorRepository;
    @Autowired
    private CreatorMappers creatorMappers;

    public CreatorDto getByID(Long id) {
        return creatorMappers.fromCreatorToCreatorDto(creatorRepository.findById(id).get());
    }

    public CreatorDto saveCreator(CreatorDtoInput creatorDtoInput) {
        Creator creator = creatorMappers.fromCreatorDtoInputToCreator(creatorDtoInput);
        creator = creatorRepository.save(creator);
        return creatorMappers.fromCreatorToCreatorDto(creator);
    }
}
