import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FavoriteSongs {
    public static void main(String[] args) {
        ArrayList<String> favoriteSongs = new ArrayList<>();
        favoriteSongs.add("Let it go - Sturgil Simpson");
        favoriteSongs.add("Watch it fall - Billy Strings");
        favoriteSongs.add("Born and Raised - Bo Napoleon");
        favoriteSongs.add("Something About it - The Green");
        favoriteSongs.remove(0);
        Collections.sort(favoriteSongs);

        for(int i = 0; i < favoriteSongs.size() ; i++){
            System.out.println(favoriteSongs.get(i));



        }
    }
}
