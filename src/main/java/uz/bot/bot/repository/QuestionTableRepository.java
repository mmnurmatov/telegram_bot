package uz.gita.bot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import uz.gita.bot.model.UserTable;

public interface QuestionTableRepository extends CrudRepository<UserTable, Long>, PagingAndSortingRepository<UserTable, Long>, QueryByExampleExecutor<UserTable> {
}
