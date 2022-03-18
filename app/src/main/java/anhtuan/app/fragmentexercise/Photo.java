package anhtuan.app.fragmentexercise;

public class Photo {
    private int id;
    private String source_photo;

    public Photo(int id, String source_photo) {
        this.id = id;
        this.source_photo = source_photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSource_photo() {
        return source_photo;
    }

    public void setSource_photo(String source_photo) {
        this.source_photo = source_photo;
    }

}

