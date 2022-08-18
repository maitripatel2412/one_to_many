package in.example.one_to_many.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.example.one_to_many.entity.Comments;

@Repository
public interface CommentRepository extends JpaRepository<Comments, Long> {

}
