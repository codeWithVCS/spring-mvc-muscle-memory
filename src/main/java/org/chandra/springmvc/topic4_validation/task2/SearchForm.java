package org.chandra.springmvc.topic4_validation.task2;

public class SearchForm {

    private String keyword;
    private String sortBy = "relevance";

    public String getKeyword() {return keyword;}
    public void setKeyword(String keyword) {this.keyword = keyword;}
    public String getSortBy() {return sortBy;}
    public void setSortBy(String sortBy) {this.sortBy = sortBy;}
}
