package com.robertleitner.movieenjoy.controller;

import com.robertleitner.movieenjoy.dto.UploadVideoResponse;
import com.robertleitner.movieenjoy.dto.VideoDto;
import com.robertleitner.movieenjoy.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/videos")
@RequiredArgsConstructor
public class VideoController {

    private final VideoService videoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UploadVideoResponse uploadVideo(@RequestParam("file")MultipartFile multipartFile) {
        return videoService.uploadVideo(multipartFile);
    }

    @PostMapping("/thumbnail")
    @ResponseStatus(HttpStatus.CREATED)
    public String uploadThumbnail(@RequestParam("file")MultipartFile multipartFile, @RequestParam("videoId") String videoId) {
        return videoService.uploadThumbnail(multipartFile, videoId);
    }


    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public VideoDto editVideoMetadata(@RequestBody VideoDto videoDto) {
        return videoService.editVideo(videoDto);
    }
}
