package com.bookify.model;
/*
-- Create table for storing book categories
CREATE TABLE tbl_book_category 
( 
    category_id VARCHAR2(10) NOT NULL, 
    category_name VARCHAR2(50) NOT NULL, 
    category_description VARCHAR2(1000), 
    category_image VARCHAR2(255),
CONSTRAINT pk_book_category
    PRIMARY KEY (category_id),
CONSTRAINT ck_category_id 
    CHECK (REGEXP_LIKE(category_id, 'bc[0-9]{5}'))
)
/ 
model package
1. java bean
2. has-a relationship
3. comparable
4. hashcode
5. equals
6. toString
 */

/*  
 * Represents a category of books.
 * TODO: Sets the unique identifier for the category.
 * 
 * @param categoryId The     ID to set. Must match the pattern 'bc[0-9]{5}'.
 * @throws IllegalArgumentException if the provided category ID is null or does not match the expected pattern.
 */

public class BookCategory implements Comparable<BookCategory> {
    private String categoryId;
    private String categoryName;
    private String categoryDescription;
    private String categoryImage;

    public BookCategory() {
        super();
    }

    // TODO: Implement auto-generation of categoryId with the format "bc00001" and "bc00002"
    // private static int counter = 1;

    // public static String generateCategoryId() {
    //     String categoryId = "bc" + String.format("%05d", counter);
    //     counter++;
    //     return categoryId;
    // }
    public BookCategory(String categoryId, String categoryName, String categoryDescription, String categoryImage) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.categoryImage = categoryImage;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((categoryId == null) ? 0 : categoryId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BookCategory other = (BookCategory) obj;
        if (categoryId == null) {
            if (other.categoryId != null)
                return false;
        } else if (!categoryId.equals(other.categoryId))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "BookCategory [categoryId=" + categoryId + ", categoryDescription=" + categoryDescription + ", categoryImage="
                + categoryImage + ", categoryName=" + categoryName + "]";
    }

    @Override
    public int compareTo(BookCategory o) {
        return this.categoryId.compareTo(o.categoryId);
    }
}