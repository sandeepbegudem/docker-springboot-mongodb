package com.codin9ninja.top25ratedtvshows.repository;

import com.codin9ninja.top25ratedtvshows.entity.TvShow;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TvShowRepository extends MongoRepository<TvShow, ObjectId> {
    Optional<TvShow> findById(TvShow tvShow);
}
