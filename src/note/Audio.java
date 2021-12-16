package note;

import java.util.Date;

public class Audio extends Media implements Playable{

    long duration;

    Audio(String author, Date date, String message, MessageType messageType, long noteSize, String extension, long duration) {
        super(author, date, message, messageType, noteSize, extension);
        this.duration = duration;
    }

    @Override
    long getNoteSize() {
        return 0;
    }

    public long getDuration() {
        return duration;
    }

    @Override
    void showContent() {
        super.showContent();
        System.out.println(duration);
    }

    @Override
    public void play() {
        showContent();
        System.out.println("Play audio");
    }
}
