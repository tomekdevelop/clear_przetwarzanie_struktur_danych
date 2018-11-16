package pl.infoshare.processing._5_json._2_exercise;

import java.util.Set;

public class Post {

    private String title;
    private String text;
    private int views;
    private boolean published;
    private Set<String> tags;

    public Post(String title, String text, int views, boolean published, Set<String> tags) {
        this.title = title;
        this.text = text;
        this.views = views;
        this.published = published;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public void incrementViews() {
        views++;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", views=" + views +
                ", published=" + published +
                ", tags=" + tags +
                '}';
    }
}
