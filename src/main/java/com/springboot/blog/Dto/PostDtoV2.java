package com.springboot.blog.Dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Set;

@Data
public class PostDtoV2 {

    private long id;

    @NotEmpty
    @Size(min = 2, message = "Post title should have at lease 2 characters")
    private String title;

    @NotEmpty
    @Size(min = 10, message = "Post description should have at lease 10 characters")
    private String description;

    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
    private List<String> tags;
}
