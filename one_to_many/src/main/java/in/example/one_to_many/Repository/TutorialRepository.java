package in.example.one_to_many.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.example.one_to_many.entity.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
