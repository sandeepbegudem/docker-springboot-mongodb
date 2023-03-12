package com.codin9ninja.top25ratedtvshows.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="shows")
public class TvShow {

    @Id
    private ObjectId id;
    private String tvShow;
    private Integer year;
    private Float rating;
}
