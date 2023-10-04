package io.jelaoufi.moviecatalog.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CatalogItem {

    private String name;
    private String desc;
    private int rating;
}
