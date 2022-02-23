package com.ziejacode.RecipeProject.repositories;

import com.ziejacode.RecipeProject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
