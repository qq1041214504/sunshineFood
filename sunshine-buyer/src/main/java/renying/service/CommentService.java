package renying.service;

import java.util.List;

import org.entity.Comment;

public interface CommentService {
	List<Comment> getCommentBySeller(int sellerId);
}
