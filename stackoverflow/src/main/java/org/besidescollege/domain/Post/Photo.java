package org.besidescollege.domain.Post;

import java.util.Date;

import org.besidescollege.domain.account.Member;

public class Photo {
    private int photoId;
    private String photoPath;
    private Date creationDate;

    private Member creatingMember;

    public boolean delete() {
        return false;
    };
}
