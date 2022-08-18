package in.example.one_to_many.Service;

import java.util.List;

import in.example.one_to_many.entity.Tutorial;

public interface TutorialService {

	List<Tutorial> getAllTutorial();

	Tutorial saveTutorial(Tutorial tutorial);

	Tutorial findById(Long id);

	void deleteById(Long id);

	Tutorial updateById(Long id, Tutorial tutorial);

}
