package org.besidescollege.domain.product;

import org.besidescollege.domain.account.Member;

public class Review {
    String productId;
    int rating;
    String title;
    String description;

    Member reviewer;
}
