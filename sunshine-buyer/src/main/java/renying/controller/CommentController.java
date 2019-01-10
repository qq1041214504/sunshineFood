package renying.controller;

import java.util.List;

import org.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import renying.service.CommentService;

@RestController
@RequestMapping("comment")
public class CommentController {
	@Autowired
	private CommentService commentService;
	
	@RequestMapping("getCommentBySeller")
	public List<Comment> getCommentBySeller(@RequestParam(required=false,value="sellerId")int sellerId){
		System.out.println("进来了");
		return commentService.getCommentBySeller(sellerId);
	}
}
