package uz.gita.bot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import uz.gita.bot.model.VideoLessonTable;

public interface VideoLessonTableRepository extends CrudRepository<VideoLessonTable, Long>, PagingAndSortingRepository<VideoLessonTable, Long>, QueryByExampleExecutor<VideoLessonTable> {
}
