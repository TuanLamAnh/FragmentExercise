package anhtuan.app.fragmentexercise;


import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<ArrayList<Photo>> generatePhotoData() {
        ArrayList<Photo> flowers = new ArrayList<Photo>();
        flowers.add(new Photo(0,  "https://images.unsplash.com/photo-1525310072745-f49212b5ac6d"));
        flowers.add(new Photo(1,  "https://images.unsplash.com/photo-1546842931-886c185b4c8c"));
        flowers.add(new Photo(2,  "https://images.unsplash.com/photo-1606041008023-472dfb5e530f"));

        ArrayList<Photo> animals = new ArrayList<Photo>();
        animals.add(new Photo(3,  "https://images.unsplash.com/photo-1484406566174-9da000fda645"));
        animals.add(new Photo(4,  "https://images.unsplash.com/photo-1474511320723-9a56873867b5"));
        animals.add(new Photo(5,  "https://images.unsplash.com/photo-1517849845537-4d257902454a"));

        ArrayList<Photo> foods = new ArrayList<Photo>();
        foods.add(new Photo(6,  "https://images.unsplash.com/photo-1504674900247-0877df9cc836"));
        foods.add(new Photo(7,  "https://images.unsplash.com/photo-1555939594-58d7cb561ad1"));
        foods.add(new Photo(8,  "https://images.unsplash.com/photo-1565958011703-44f9829ba187"));
        
        ArrayList<ArrayList<Photo>> photos = new ArrayList<>();
        photos.add(flowers);
        photos.add(animals);
        photos.add(foods);
        return photos;
    }

    public static Photo getPhotoFromId(int id) {
        ArrayList<ArrayList<Photo>> photos = generatePhotoData();
        for (ArrayList<Photo> cat:  photos
            ) {
            for (Photo item: cat
                 ) {if(item.getId() == id){
                return item;}
            }
        }
        return null;
    }
    public enum Cat{FLOWERS, ANIMALS, FOODS}
    public  static ArrayList<Photo> getPhotoByCat(Cat cat){
        ArrayList<ArrayList<Photo>> photos = generatePhotoData();
        switch (cat){
            case FLOWERS: return photos.get(0);
            case ANIMALS: return photos.get(1);
            case FOODS: return photos.get(2);
    }
    return null;
    }
}
