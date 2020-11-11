package org.besidescollege.domain.Post;

import java.util.Date;
import java.util.List;

import org.besidescollege.domain.account.Member;

public abstract class Post {
    String id;
    String description;
    Date postedOn;
    Member postedBy;
    Member editedBy;
    int numberOfUpVotes;
    int numberOfDownVotes;
    List<Tag> tags;
}
