package org.besidescollege.domain.account;

public abstract class Account {
    String id;
    String username;
    String password;
    private AccountStatus status;
    private Person person;
}
