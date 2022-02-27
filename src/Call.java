import java.util.Date;

public class Call {
    private String title;
    private Date date;

    public Call(String title, Date date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }
}