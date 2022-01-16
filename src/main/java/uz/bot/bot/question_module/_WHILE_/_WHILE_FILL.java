package uz.gita.bot.question_module._WHILE_;


import uz.gita.bot.repository.QuestionRepository;

/**
 * Created by Bigman on 27.02.2018.
 */
public class _WHILE_FILL {
    public static void main(String[] args) {
        fill();
    }

    public static void fill() {
        QuestionRepository questionRepository = new QuestionRepository();

        questionRepository.saveQuestion(_001_Question.getQuestion()); //< _001_
        questionRepository.saveQuestion(_002_Question.getQuestion()); //< _002_
        questionRepository.saveQuestion(_003_Question.getQuestion()); //< _003_
    }
}
