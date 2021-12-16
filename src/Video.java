import java.util.Date;

public class Video extends Note implements Playable {

    long duration;

    Video(String author, Date date, String message, MessageType messageType, long noteSize, long duration) {
        super(author, date, message, messageType, noteSize);
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
        System.out.println("Play video");
    }

}

