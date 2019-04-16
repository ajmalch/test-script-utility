package com.example.postman;

import java.util.List;
import lombok.Data;

@Data
public class PostmanCollection {

    private Information info;

    private List<CollectionItem> item;
}
