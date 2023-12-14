package ma.xproce.videoservice.services;

import ma.xproce.videoservice.dtos.VideoDto;
import ma.xproce.videoservice.dtos.VideoDtoInput;
import ma.xproce.videoservice.entities.Video;
import ma.xproce.videoservice.mappers.VideoMappers;
import ma.xproce.videoservice.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VideoManagerFirstImplementation implements VideoManager {
    @Autowired
    private VideoRepository videoRepository;
    @Autowired
    private VideoMappers videoMappers;

    public VideoDto getByID(Long id) {
        return videoMappers.fromVideoToVideoDto(videoRepository.findById(id).get());
    }

    public VideoDto saveVideo(VideoDtoInput videoDtoInput) {
        Video video = videoMappers.fromVideoDtoInputToVideo(videoDtoInput);
        video = videoRepository.save(video);
        return videoMappers.fromVideoToVideoDto(video);
    }
}
