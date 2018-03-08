import java.util.ArrayList;
import java.util.List;

public class Marvel extends Verlag {
    List<Comic> comics = new ArrayList<Comic>();

    void CreateComics(){
        comics.add(new Spiderman(1));
    }
}
