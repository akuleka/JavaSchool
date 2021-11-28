public class Audio extends Media {

    long duration;

    @Override
    long getNoteSize() {
        return 0;
    }

    public long getDuration() {
        return duration;
    }
}
