public class Video extends Note {

    long duration;

    @Override
    long getNoteSize() {
        return 0;
    }

    public long getDuration() {
        return duration;
    }
}

