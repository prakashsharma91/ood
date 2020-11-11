package org.besidescollege.domain.account;

import org.besidescollege.domain.library.BookItem;

public class Librarian extends Account {
    public boolean addBookItem(BookItem bookItem) {
        return true;
    };

    public boolean blockMember(Member member) {
        return true;
    };

    public boolean unBlockMember(Member member) {
        return true;
    };
}
