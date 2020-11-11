package org.besidescollege.notificationservice;

import java.util.Date;

import org.besidescollege.domain.account.Account;

public abstract class NotificationService {
    private int notificationId;
    private Date createdOn;
    private String content;

    public boolean sendNotification(Account account) {
        return false;
    };
}
