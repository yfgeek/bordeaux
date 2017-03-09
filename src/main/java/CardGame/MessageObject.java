package CardGame;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by tom on 06/03/17.
 */
public class MessageObject {
    private String userName;
    private String message;
    private Date timeStamp;

    public MessageObject(String userName, String message) {
        this.userName = userName;
        this.message = message;

        this.timeStamp = new Date();
    }

    public String getUserName() {
        return userName;
    }

    public String getMessage() {
        return message;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        return "MessageObject{" +
                "userName='" + userName + '\'' +
                ", message='" + message + '\'' +
                ", timeStamp=" + df.format(timeStamp) +
                '}';
    }
}
