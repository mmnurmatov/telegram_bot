package uz.gita.bot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import uz.gita.bot.model.QuestionTable;

public interface UserTableRepository extends CrudRepository<QuestionTable, Long>, PagingAndSortingRepository<QuestionTable, Long>, QueryByExampleExecutor<QuestionTable> {
}
