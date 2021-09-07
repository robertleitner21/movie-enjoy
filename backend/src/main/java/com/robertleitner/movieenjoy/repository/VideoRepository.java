package com.robertleitner.movieenjoy.repository;

import com.robertleitner.movieenjoy.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video, String> {

}
