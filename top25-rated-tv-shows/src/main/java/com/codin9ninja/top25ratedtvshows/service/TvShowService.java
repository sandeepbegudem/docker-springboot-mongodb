package com.codin9ninja.top25ratedtvshows.service;

import com.codin9ninja.top25ratedtvshows.entity.TvShow;
import com.codin9ninja.top25ratedtvshows.repository.TvShowRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class TvShowService {

    @Autowired
    private TvShowRepository tvShowRepository;

    public List<TvShow> getAllShows(){
        return tvShowRepository.findAll();
    }

    public TvShow saveAShow(TvShow show){
        return tvShowRepository.save(show);
    }

    public Optional<TvShow> getShowDetails(ObjectId id) {
        return tvShowRepository.findById(id);
    }

    public TvShow updateTvShow(TvShow tvShow) {
        TvShow existingTvShow = tvShowRepository.findById(tvShow.getId()).orElse(null);
        existingTvShow.setTvShow(tvShow.getTvShow());
        existingTvShow.setYear(tvShow.getYear());
        existingTvShow.setRating(tvShow.getRating());
        return tvShowRepository.save(existingTvShow);


    }
}
