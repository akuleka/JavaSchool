public class TextNote extends Note {

    String title;

    @Override
    long getNoteSize() {
        return 0;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
