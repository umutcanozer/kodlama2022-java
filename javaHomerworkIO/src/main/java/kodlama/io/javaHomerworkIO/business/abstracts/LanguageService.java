package kodlama.io.javaHomerworkIO.business.abstracts;

import java.util.List;

import kodlama.io.javaHomerworkIO.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();

	Language add(Language language) throws Exception;

	void delete(int id);

	void update(Language newLanguage) throws Exception;

	Language getById(int id);
}
