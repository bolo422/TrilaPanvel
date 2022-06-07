package br.com.panvel.modulo7.chat;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public interface MessageUtil {
    static final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");

    public static String formatMessage(String sender, String message)
    {
        return sender + " - (" + sdf.format(new Timestamp(System.currentTimeMillis())) + "): " + message;
    }
}
