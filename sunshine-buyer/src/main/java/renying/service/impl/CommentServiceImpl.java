package renying.service.impl;

import java.util.List;

import org.dao.CommentMapper;
import org.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import renying.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentMapper commentMapper;
	@Override
	public List<Comment> getCommentBySeller(int sellerId) {
		
		return commentMapper.getCommentBySeller(sellerId);
	}

}
