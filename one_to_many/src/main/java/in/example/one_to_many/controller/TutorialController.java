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

import in.example.one_to_many.Service.TutorialService;
import in.example.one_to_many.entity.Tutorial;

@RestController
@RequestMapping("/tutorials")
public class TutorialController {

	@Autowired
	private TutorialService tService;
	
	@GetMapping("/h")
	public String tutorial() {
		return "hellooo";
	}
	
	@GetMapping
	public List<Tutorial> getAllTutorial(){
		return tService.getAllTutorial();
	}
	
	@PostMapping("/save")
	public Tutorial saveTutorial(@RequestBody Tutorial tutorial) {
		return tService.saveTutorial(tutorial);
	}
	
	@GetMapping("/{id}")
	public Tutorial findById(@PathVariable Long id) {
		return tService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		tService.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public Tutorial updateById(@PathVariable Long id,@RequestBody Tutorial tutorial) {
		return tService.updateById(id,tutorial);
	}
}
