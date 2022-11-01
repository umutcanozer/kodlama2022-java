package kodlama.io.javaHomerworkIO.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.javaHomerworkIO.dataAccess.abstracts.LanguageRepository;
import kodlama.io.javaHomerworkIO.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
	List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Java"));
		languages.add(new Language(3, "Python"));
		languages.add(new Language(4, "C++"));
	}

	@Override
	public List<Language> getAll() {
		return languages;
	}

	@Override
	public Language add(Language language) {
		languages.add(language);
		return getById(language.getId());
	}

	@Override
	public void delete(int id) {
		languages.remove(id);
		System.out.println("Language removed.");
	}

	@Override
	public void update(Language newLanguage) {
		for (Language language : languages) {
			if(language.getId()==newLanguage.getId())
				language.setName(newLanguage.getName());
		}
	}

	@Override
	public Language getById(int id) {
		for (Language language : languages) {
			if (language.getId() == id)
				return language;

		}
		return null;
	}

}
