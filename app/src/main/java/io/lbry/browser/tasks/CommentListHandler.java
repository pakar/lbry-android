package io.lbry.browser.tasks;

import java.util.List;

import io.lbry.browser.model.Comment;

public interface CommentListHandler {
    void onSuccess(List<Comment> comments, boolean hasReachedEnd);
    void onError(Exception error);
}
