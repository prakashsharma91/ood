package org.besidescollege.domain.account;

public class Admin extends Member {
    public boolean blockMember(Member member) {
        return false;
    };

    public boolean unblockMember(Member member) {
        return false;
    };
}
