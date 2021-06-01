package mednotes3.demo.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Suggestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int suggestionId;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private Date date;

    public Suggestion(){
    }

    public Suggestion(String title, String content, Date date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public int getSuggestionId() {
        return suggestionId;
    }

    public void setSuggestionId(int suggestionId) {
        this.suggestionId = suggestionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
