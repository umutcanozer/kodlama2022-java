package kodlama.io.javaHomerworkIO.webApi.controllers;

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

import kodlama.io.javaHomerworkIO.business.abstracts.LanguageService;
import kodlama.io.javaHomerworkIO.entities.concretes.Language;

@RestController // annotation
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<Language> getAll() {
		return languageService.getAll();
	}

	@PostMapping("/add")
	public Language add(@RequestBody Language language) throws Exception  {
		return languageService.add(language);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		languageService.delete(id);
	}

	@PutMapping("/update")
	public void update(@RequestBody Language newLanguage) throws Exception {
		languageService.update(newLanguage);
	}

	@GetMapping("/{id}")
	public Language getById(@PathVariable int id) {
		return languageService.getById(id);
	}

}
