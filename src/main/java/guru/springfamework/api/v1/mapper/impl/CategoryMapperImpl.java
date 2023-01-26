package guru.springfamework.api.v1.mapper.impl;

import guru.springfamework.api.v1.mapper.CategoryMapper;
import guru.springfamework.api.v1.model.CategoryDTO;
import guru.springfamework.domain.Category;

public class CategoryMapperImpl implements CategoryMapper {
    @Override
    public CategoryDTO categoryToCategoryDTO(Category category) {
        if (category == null) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setName(category.getName());

        return categoryDTO;
    }

    @Override
    public Category categoryDtoToCategory(CategoryDTO categoryDTO) {
        if (categoryDTO == null) {
            return null;
        }

        Category category = new Category();

        category.setName(categoryDTO.getName());

        return category;

    }
}
