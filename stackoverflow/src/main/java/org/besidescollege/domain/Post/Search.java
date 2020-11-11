package org.besidescollege.domain.Post;

import java.util.List;

public interface Search<T> {
    public static List<T> search(String query);
}
