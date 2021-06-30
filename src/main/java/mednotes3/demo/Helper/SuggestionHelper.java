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

    public SuggestionHelper(String content) {

        this.content = content;

    }



    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
