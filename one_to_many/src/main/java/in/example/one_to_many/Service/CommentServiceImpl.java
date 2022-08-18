package in.example.one_to_many.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.example.one_to_many.Repository.CommentRepository;
import in.example.one_to_many.entity.Comments;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository cRepo;
	
	@Override
	public List<Comments> getAllComment() {
		return cRepo.findAll();
	}

	@Override
	public Comments saveComments(Comments comments) {
		return cRepo.save(comments);
	}

	@Override
	public Comments findById(Long id) {
		return cRepo.findById(id).get();
	}

	@Override
	public void deleteById(Long id) {
		cRepo.deleteById(id);
	}

	@Override
	public Comments updateById(Long id, Comments comments) {
		Comments old = cRepo.findById(id).get();
		comments.setId(id);
		return cRepo.save(comments);
	}

}
