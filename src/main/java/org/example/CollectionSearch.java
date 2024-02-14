package org.example;
import java.util.List;
import java.util.Optional;
 class CollectionSearch {

    public static <T> T searchItem(List<T> collection, T item){
        Optional<T> result = collection.stream().filter(e -> e.equals(item)).findFirst();
        return result.orElse(null);
    }
}
