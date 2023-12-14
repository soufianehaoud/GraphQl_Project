package ma.xproce.videoservice.services;

import ma.xproce.videoservice.dtos.VideoDto;
import ma.xproce.videoservice.dtos.VideoDtoInput;

public interface VideoManager {
     VideoDto saveVideo(VideoDtoInput videoDtoInput);
     VideoDto getByID(Long id);
}
