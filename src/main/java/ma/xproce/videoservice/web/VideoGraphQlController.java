package ma.xproce.videoservice.web;


import ma.xproce.videoservice.dtos.VideoDto;
import ma.xproce.videoservice.dtos.VideoDtoInput;
import ma.xproce.videoservice.entities.Video;
import ma.xproce.videoservice.services.VideoManagerFirstImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


import java.util.List;

@Controller
public class VideoGraphQlController {
    @Autowired
    private VideoManagerFirstImplementation videoManager;

    @QueryMapping
    public VideoDto getByID(@Argument Long id){return videoManager.getByID(id);}
    @MutationMapping
    public VideoDto saveVideo(@Argument VideoDtoInput VideoDtoInput){
        return videoManager.saveVideo(VideoDtoInput);

    }

}
