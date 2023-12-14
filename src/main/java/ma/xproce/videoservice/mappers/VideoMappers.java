package ma.xproce.videoservice.mappers;

import ma.xproce.videoservice.dtos.VideoDto;
import ma.xproce.videoservice.dtos.VideoDtoInput;
import ma.xproce.videoservice.entities.Video;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class VideoMappers {
    private final ModelMapper modelMapper=new ModelMapper();


    public Video fromVideoDtoToVideo(VideoDto videoDto) {
        return this.modelMapper.map(videoDto, Video.class);
    }

    public VideoDto fromVideoToVideoDto(Video video) {
        return this.modelMapper.map(video, VideoDto.class);
    }
    public VideoDto fromVideoDtoInputToVideoDto(VideoDtoInput videoDtoInput) {
        return this.modelMapper.map(videoDtoInput, VideoDto.class);
    }

    public VideoDtoInput fromVideoDtoToVideoDtoInput(VideoDto videoDTo) {
        return this.modelMapper.map(videoDTo, VideoDtoInput.class);
    }

    public Video fromVideoDtoInputToVideo(VideoDtoInput videoDtoInput) {
        return this.modelMapper.map(videoDtoInput, Video.class);
    }



}
