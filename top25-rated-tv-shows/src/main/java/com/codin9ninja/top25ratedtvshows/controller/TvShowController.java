package com.codin9ninja.top25ratedtvshows.controller;

import com.codin9ninja.top25ratedtvshows.entity.TvShow;
import com.codin9ninja.top25ratedtvshows.service.TvShowService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RequestMapping("/api/v1/shows")
@RestController
public class TvShowController {

    @Autowired
    private TvShowService tvShowService;

    @GetMapping("/top25shows")
    @ResponseStatus(HttpStatus.OK)
    public List<TvShow> allShows(){
        return tvShowService.getAllShows();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<TvShow> getShowInfo(@PathVariable ObjectId id){
        return tvShowService.getShowDetails(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public TvShow save(@RequestBody TvShow show){
        return tvShowService.saveAShow(show);
    }

    @PutMapping("/update/")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<TvShow> update(@RequestBody TvShow tvShow){
        return new ResponseEntity<>(tvShowService.updateTvShow(tvShow), HttpStatus.OK);
    }
}
