package uz.gita.bot.question_module._MATRIX_;


import uz.gita.bot.repository.QuestionRepository;

/**
 * Created by Bigman on 15.02.2018.
 */
public class _MATRIX_FILL {

    public static void main(String[] args) {
        fill();
    }

    public static void fill() {
        QuestionRepository questionRepository = new QuestionRepository();
        questionRepository.saveQuestion(_001_Question.getQuestion()); //< _001_
        questionRepository.saveQuestion(_002_Question.getQuestion()); //< _002_
        questionRepository.saveQuestion(_003_Question.getQuestion()); //< _003_
        questionRepository.saveQuestion(_004_Question.getQuestion()); //< _004_
        questionRepository.saveQuestion(_005_Question.getQuestion()); //< _005_
    }
}
