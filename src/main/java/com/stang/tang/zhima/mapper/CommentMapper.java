package com.stang.tang.zhima.mapper;

import java.util.List;

import com.stang.tang.zhima.entity.Comment;

public interface CommentMapper {

	public void createComment(Comment comment);

	public List<Comment> getCommentsByArticle(int articleId);

	public int getCommentsNumByArticle(int articleId);

}
