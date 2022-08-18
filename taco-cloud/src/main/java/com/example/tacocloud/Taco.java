package com.example.tacocloud;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Taco {

    @Id
    private Long id;
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Date createAt = new Date();

    @NotNull
    @Size(min = 5, message = ("Name must be least 5 characters long"))
    private String name;

    @NotNull
    @ManyToMany
    @Size(min = 1, message = ("you must choose at least 1 ingredient"))
    private List<Ingredient> ingredients;
}
