package uz.gita.bot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import uz.gita.bot.model.SuggestionTable;

public interface SuggestionTableRepository extends CrudRepository<SuggestionTable, Long>, PagingAndSortingRepository<SuggestionTable, Long>, QueryByExampleExecutor<SuggestionTable> {
}
