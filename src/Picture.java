public class Picture extends Media {

    int wight, height;

    @Override
    long getNoteSize() {
        return 0;
    }

    public int getWight() {
        return wight;
    }

    public int getHeight() {
        return height;
    }
}
