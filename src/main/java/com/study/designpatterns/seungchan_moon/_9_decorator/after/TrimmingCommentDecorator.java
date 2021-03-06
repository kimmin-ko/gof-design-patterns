package com.study.designpatterns.seungchan_moon._9_decorator.after;

public class TrimmingCommentDecorator extends CommentDecorator{

    public TrimmingCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }


    private String trim(String comment) {
        return comment.replace("...", "");
    }
}
