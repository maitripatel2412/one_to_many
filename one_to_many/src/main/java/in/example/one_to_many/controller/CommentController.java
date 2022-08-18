package in.example.one_to_many.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.example.one_to_many.Service.CommentService;
import in.example.one_to_many.entity.Comments;
import in.example.one_to_many.entity.Tutorial;

@RestController
@RequestMapping("/comments")
public class CommentController {
	
	@Autowired
	private CommentService cService;

	@GetMapping("/hello")
	public String comment() {
		return "hellooo its a comment..........";
	}
	
	@GetMapping
	public List<Comments> getAllComment(){
		return cService.getAllComment();
	}
	
	@PostMapping("/save")
	public Comments saveComments(@RequestBody Comments comments) {
		return cService.saveComments(comments);
	}
	
	@GetMapping("/{id}")
	public Comments findById(@PathVariable Long id) {
		return cService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		cService.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public Comments updateById(@PathVariable Long id,@RequestBody Comments comments) {
		return cService.updateById(id,comments);
	}
	
}
