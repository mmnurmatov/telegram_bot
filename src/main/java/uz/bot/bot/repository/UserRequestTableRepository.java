package uz.gita.bot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import uz.gita.bot.model.UserRequestTable;

public interface UserRequestTableRepository extends CrudRepository<UserRequestTable, Long>, PagingAndSortingRepository<UserRequestTable, Long>, QueryByExampleExecutor<UserRequestTable> {
}
