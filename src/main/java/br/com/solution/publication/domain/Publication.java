package br.com.solution.publication.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Publication {

    private String title;
    private String imageURL;
    private String text;
    private List<Comment> comments;

}
