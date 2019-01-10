package org.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.entity.Comment;

public interface CommentMapper {
	List<Comment> getCommentBySeller(@Param("sellerId")int sellerId);
}
