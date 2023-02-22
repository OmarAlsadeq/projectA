package org.example.demo.Models.dto;


import org.example.demo.Models.CategoryData;

import javax.validation.constraints.NotNull;
import java.io.File;

public class FileCategoryDTO {

    @NotNull
    private File file;

    @NotNull
    private CategoryData category;

    public FileCategoryDTO(){}

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public CategoryData getCategory() {
        return category;
    }

    public void setCategory(CategoryData category) {
        this.category = category;
    }
}
