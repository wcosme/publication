package br.com.solution.publication.domain.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document(collation = "publications")
public class PublicationEntity {

    @MongoId
    private String id;
    private String title;
    private String imageURL;
    private String text;
}
