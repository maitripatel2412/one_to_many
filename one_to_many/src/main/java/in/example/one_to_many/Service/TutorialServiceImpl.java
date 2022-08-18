package in.example.one_to_many.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.example.one_to_many.Repository.TutorialRepository;
import in.example.one_to_many.entity.Tutorial;

@Service
public class TutorialServiceImpl implements TutorialService {

	@Autowired
	private TutorialRepository tRepo;
	
	@Override
	public List<Tutorial> getAllTutorial() {
		return tRepo.findAll();
	}

	@Override
	public Tutorial saveTutorial(Tutorial tutorial) {
		return tRepo.save(tutorial);
	}

	@Override
	public Tutorial findById(Long id) {
		return tRepo.findById(id).get();
	}

	@Override
	public void deleteById(Long id) {
		tRepo.deleteById(id);
	}

	@Override
	public Tutorial updateById(Long id, Tutorial tutorial) {
		Tutorial old = tRepo.findById(id).get();
		tutorial.setId(id);
		return tRepo.save(tutorial);
	}

}
