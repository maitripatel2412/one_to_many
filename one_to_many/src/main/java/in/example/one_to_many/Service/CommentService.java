package in.example.one_to_many.Service;

import java.util.List;

import in.example.one_to_many.entity.Comments;

public interface CommentService {

	List<Comments> getAllComment();

	Comments saveComments(Comments comments);

	Comments findById(Long id);

	void deleteById(Long id);

	Comments updateById(Long id, Comments comments);

}
