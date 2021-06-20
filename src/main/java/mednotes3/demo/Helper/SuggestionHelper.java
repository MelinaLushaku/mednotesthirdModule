package mednotes3.demo.Helper;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

public class SuggestionHelper implements Serializable {



    private String title;


    private String content;


    private Date date;

    public SuggestionHelper(){
    }

    public SuggestionHelper(String title, String content, Date date) {
        this.title = title;
        this.content = content;
        this.date = date;
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
