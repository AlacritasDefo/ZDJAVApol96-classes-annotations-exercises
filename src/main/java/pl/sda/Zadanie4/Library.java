package pl.sda.Zadanie4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library<T extends MediaCenter> {

    private List<T> mediaList = new ArrayList<>();
    public void addMedia (T medium) {
       mediaList.add(medium);
    }

    public Optional<T> mediaBorrow(String name){
        return mediaList.stream()
                .filter(media-> media.getName().equals(name))
                .findAny();
    }

    public Optional<T> mediaBorrowByNameAndType(String name, MediaCenterType type){
        return mediaList.stream()
                .filter(media-> media.getName().equals(name))
                .filter(media-> media.getType()==type)
                .findAny();
    }

}
