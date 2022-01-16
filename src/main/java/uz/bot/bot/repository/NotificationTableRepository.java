package uz.gita.bot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import uz.gita.bot.model.NotificationTable;

public interface NotificationTableRepository extends CrudRepository<NotificationTable, Long>, PagingAndSortingRepository<NotificationTable, Long>, QueryByExampleExecutor<NotificationTable> {
}
