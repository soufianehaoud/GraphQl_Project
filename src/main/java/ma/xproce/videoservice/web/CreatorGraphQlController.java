package ma.xproce.videoservice.web;

import ma.xproce.videoservice.dtos.CreatorDto;
import ma.xproce.videoservice.dtos.CreatorDtoInput;
import ma.xproce.videoservice.dtos.VideoDto;
import ma.xproce.videoservice.dtos.VideoDtoInput;
import ma.xproce.videoservice.services.CreatorManagerFirstImplementation;
import ma.xproce.videoservice.services.VideoManagerFirstImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CreatorGraphQlController {
    @Autowired
    private CreatorManagerFirstImplementation creatorManager;

    @QueryMapping
    public CreatorDto getByID(@Argument Long id){return creatorManager.getByID(id);}
    @MutationMapping
    public CreatorDto saveCreator(@Argument CreatorDtoInput creatorDtoInput){
        return creatorManager.saveCreator(creatorDtoInput);

    }
}
