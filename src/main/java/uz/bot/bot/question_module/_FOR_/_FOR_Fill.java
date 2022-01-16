package uz.gita.bot.question_module._FOR_;


import uz.gita.bot.repository.QuestionRepository;

/**
 * Created by Bigman on 12.02.2018.
 */
public class _FOR_Fill {
    public static void main(String[] args) {
        fill();
    }

    public static void fill() {
        QuestionRepository questionRepository = new QuestionRepository();
        // <   &lt;
        // > &gt;
        // & &amp;
        //  muvaffaqiyatli
        questionRepository.saveQuestion(_001_Question.getQuestion()); //< _001_
        questionRepository.saveQuestion(_002_Question.getQuestion()); //< _002_
        questionRepository.saveQuestion(_003_Question.getQuestion()); //< _003_
        questionRepository.saveQuestion(_004_Question.getQuestion()); //< _004_
        questionRepository.saveQuestion(_005_Question.getQuestion()); //< _005_
        questionRepository.saveQuestion(_006_Question.getQuestion()); //< _006_
        questionRepository.saveQuestion(_007_Question.getQuestion()); //< _007_
        questionRepository.saveQuestion(_008_Question.getQuestion()); //< _008_
        questionRepository.saveQuestion(_009_Question.getQuestion()); //< _009_

        questionRepository.saveQuestion(_010_Question.getQuestion()); //< _010_
        questionRepository.saveQuestion(_011_Question.getQuestion()); //< _011_
        questionRepository.saveQuestion(_012_Question.getQuestion()); //< _012_
        questionRepository.saveQuestion(_013_Question.getQuestion()); //< _013_
        questionRepository.saveQuestion(_014_Question.getQuestion()); //< _014_
        questionRepository.saveQuestion(_015_Question.getQuestion()); //< _015_
        questionRepository.saveQuestion(_016_Question.getQuestion()); //< _016_
        questionRepository.saveQuestion(_017_Question.getQuestion()); //< _017_
        questionRepository.saveQuestion(_018_Question.getQuestion()); //< _018_
        questionRepository.saveQuestion(_019_Question.getQuestion()); //< _019_

        questionRepository.saveQuestion(_020_Question.getQuestion()); //< _020_
        questionRepository.saveQuestion(_021_Question.getQuestion()); //< _021_
        questionRepository.saveQuestion(_022_Question.getQuestion()); //< _022_
        questionRepository.saveQuestion(_023_Question.getQuestion()); //< _023_
        questionRepository.saveQuestion(_024_Question.getQuestion()); //< _024_
        questionRepository.saveQuestion(_025_Question.getQuestion()); //< _025_


    }
}
