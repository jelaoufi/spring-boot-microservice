package io.jelaoufi.moviecatalog.resources;

import io.jelaoufi.moviecatalog.models.CatalogItem;
import io.jelaoufi.moviecatalog.models.Movie;
import io.jelaoufi.moviecatalog.models.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

        return Stream.of("1234", "5678")
                .map(movieId ->
                    new CatalogItem(
                            restTemplate.getForObject("http://movie-info/movies/" + movieId, Movie.class).getName(),
                            "Description",
                            restTemplate.getForObject("http://ratings-data/ratingsdata/" + movieId, Rating.class).getRating())                )
                .collect(Collectors.toList());
    }
}
