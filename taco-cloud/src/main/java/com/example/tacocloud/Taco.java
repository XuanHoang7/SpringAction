package com.example.tacocloud;

import lombok.Data;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Taco {
    @NotNull
    @Size(min = 5, message = ("Name must be least 5 characters long"))
    private String name;

    @NotNull
    @Size(min = 1, message = ("you must choose at least 1 ingredient"))
    private List<Ingredient> ingredients;
}
