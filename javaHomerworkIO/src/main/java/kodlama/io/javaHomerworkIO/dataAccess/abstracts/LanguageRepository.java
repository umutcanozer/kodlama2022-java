package kodlama.io.javaHomerworkIO.dataAccess.abstracts;

import java.util.List;

import kodlama.io.javaHomerworkIO.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();

	Language add(Language language);

	void delete(int id);

	void update(Language newLanguage);

	Language getById(int id);
}
