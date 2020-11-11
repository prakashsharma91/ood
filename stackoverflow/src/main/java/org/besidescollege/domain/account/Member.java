package org.besidescollege.domain.account;

import java.util.List;

public abstract class Member {
    Account account;

    public void changePassword() {
    };

    public void askQuestion(String question, List<String> tags) {
    };

    public void answerQuestion(String questionId, String answer) {
    };

    public void voteQuestion(String questionId, boolean up) {
    };

    public void voteAnswer(String answerId, boolean up) {
    };

    public void flagQuestion(String questionId) {
    }

    public void flagAnswer(String answerId) {
    }
}
