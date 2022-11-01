package kodlama.io.javaHomerworkIO.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.javaHomerworkIO.business.abstracts.LanguageService;
import kodlama.io.javaHomerworkIO.dataAccess.abstracts.LanguageRepository;
import kodlama.io.javaHomerworkIO.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public Language add(Language language) throws Exception {
		if (isExist(language))
			throw new Exception("Program name cannot be repeated");
		if (language.getName().isBlank() || language.getName().isEmpty())
			throw new Exception("Program name cannot be blank or empty.");

		return languageRepository.add(language);
	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);
	}

	@Override
	public void update(Language newLanguage) throws Exception {
		if (isExist(newLanguage))
			throw new Exception("Program name cannot be repeated");
		if (newLanguage.getName().isBlank() || newLanguage.getName().isEmpty())
			throw new Exception("Program name cannot be blank or empty.");
		
		languageRepository.update(newLanguage);
	}

	@Override
	public Language getById(int id) {
		return languageRepository.getById(id);
	}

	private boolean isExist(Language language) {
		for (Language tempLanguage : languageRepository.getAll()) {
			if (tempLanguage.getName().equalsIgnoreCase(language.getName())) {
				return true;
			}
		}
		return false;
	}

}
