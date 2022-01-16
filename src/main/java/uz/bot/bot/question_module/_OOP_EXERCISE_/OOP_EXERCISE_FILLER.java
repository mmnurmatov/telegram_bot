package uz.gita.bot.question_module._OOP_EXERCISE_;

import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.common.QuestionState;
import uz.gita.bot.dto.QuestionDto;
import uz.gita.bot.dto.VideoDTO;
import uz.gita.bot.repository.QuestionRepository;
import uz.gita.bot.repository.VideoRepository;
import java.util.Date;

/**
 * Created by BigMan on 10.09.2018.
 */
public class OOP_EXERCISE_FILLER {

    public static void main(String[] args) {
      //  fill();
    }

    public static void fill() {
        library();
        vendingMachine();
        formula();
        clinic();
        flatRent();
        webForum();
        taxiCompany();

    }

    public static void library() {

        QuestionDto question = new QuestionDto();

        question.setQuestionId(1); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        question.setQuestionFileLink("BQADAgAD4gIAAh0c6EhNMWD-Vro_qgI");
        question.setTitle(" Library  loyihasi");
        question.setAnswerFileLink("BQADAgAD4wIAAh0c6Egt-CcJwwrZmwI");

        question.setQuestionState(QuestionState.FILE);
        question.setAnswerState(QuestionState.FILE);

        question.setVisible(true);
        question.setHasTest(false);

        QuestionRepository questionRepository = new QuestionRepository();
        Integer questionId = questionRepository.saveQuestion(question);

        question = null;

        // save
        VideoDTO videoDTO_1 = new VideoDTO();
        videoDTO_1.setVideoOrder(1);
        videoDTO_1.setVideoLink("BAADAgADbAMAAiMMqEj3y4UbOs6cAAEC");
        videoDTO_1.setParentId(questionId);
        videoDTO_1.setCreatedDate(new Date());
        videoDTO_1.setVisible(true);


        VideoDTO videoDTO_2 = new VideoDTO();
        videoDTO_2.setVideoOrder(2);
        videoDTO_2.setVideoLink("BAADAgADbQMAAiMMqEijcBWGqMh5RAI");
        videoDTO_2.setParentId(questionId);
        videoDTO_2.setCreatedDate(new Date());
        videoDTO_2.setVisible(true);


        VideoDTO videoDTO_3 = new VideoDTO();
        videoDTO_3.setVideoOrder(3);
        videoDTO_3.setVideoLink("BAADAgADbwMAAiMMqEiqcaE_dTGqRgI");
        videoDTO_3.setParentId(questionId);
        videoDTO_3.setCreatedDate(new Date());
        videoDTO_3.setVisible(true);


        VideoDTO videoDTO_4 = new VideoDTO();
        videoDTO_4.setVideoOrder(4);
        videoDTO_4.setVideoLink("BAADAgADcAMAAiMMqEhqRYe1g59NawI");
        videoDTO_4.setParentId(questionId);
        videoDTO_4.setCreatedDate(new Date());
        videoDTO_4.setVisible(true);


        VideoDTO videoDTO_5 = new VideoDTO();
        videoDTO_5.setVideoOrder(5);
        videoDTO_5.setVideoLink("BAADAgADfAIAAiMMsEgzeFTeajTZ_AI");
        videoDTO_5.setParentId(questionId);
        videoDTO_5.setCreatedDate(new Date());
        videoDTO_5.setVisible(true);


        VideoDTO videoDTO_6 = new VideoDTO();
        videoDTO_6.setVideoOrder(6);
        videoDTO_6.setVideoLink("BAADAgADfQIAAiMMsEgPSqWqGlkj3AI");
        videoDTO_6.setParentId(questionId);
        videoDTO_6.setCreatedDate(new Date());
        videoDTO_6.setVisible(true);

        VideoRepository videoRepository = new VideoRepository();

        videoRepository.add(videoDTO_1);
        videoRepository.add(videoDTO_2);
        videoRepository.add(videoDTO_3);
        videoRepository.add(videoDTO_4);
        videoRepository.add(videoDTO_5);
        videoRepository.add(videoDTO_6);


        // saave all
    }

    public static void vendingMachine() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(2); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        question.setQuestionFileLink("BQADAgAD5AIAAh0c6EjW7zc-LWNOxQI");
        question.setTitle(" VendingMachine  loyihasi");
        question.setAnswerFileLink("BQADAgAD5QIAAh0c6EhOa3RtEscTZAI");

        question.setQuestionState(QuestionState.FILE);
        question.setAnswerState(QuestionState.FILE);

        question.setVisible(true);
        question.setHasTest(false);

        QuestionRepository questionRepository = new QuestionRepository();
        Integer questionId = questionRepository.saveQuestion(question);

        question = null;

        // save
        VideoDTO videoDTO_1 = new VideoDTO();
        videoDTO_1.setVideoOrder(1);
        videoDTO_1.setVideoLink("BAADAgADfwIAAiMMsEg83BtAAm_v0wI");
        videoDTO_1.setParentId(questionId);
        videoDTO_1.setCreatedDate(new Date());
        videoDTO_1.setVisible(true);

        VideoDTO videoDTO_2 = new VideoDTO();
        videoDTO_2.setVideoOrder(2);
        videoDTO_2.setVideoLink("BAADAgADgAIAAiMMsEhFMOJsXbGbQQI");
        videoDTO_2.setParentId(questionId);
        videoDTO_2.setCreatedDate(new Date());
        videoDTO_2.setVisible(true);

        VideoDTO videoDTO_3 = new VideoDTO();
        videoDTO_3.setVideoOrder(3);
        videoDTO_3.setVideoLink("BAADAgADgQIAAiMMsEhg0pPoWqbOzQI");
        videoDTO_3.setParentId(questionId);
        videoDTO_3.setCreatedDate(new Date());
        videoDTO_3.setVisible(true);


        VideoDTO videoDTO_4 = new VideoDTO();
        videoDTO_4.setVideoOrder(4);
        videoDTO_4.setVideoLink("BAADAgADggIAAiMMsEgEiCxBQouN-wI");
        videoDTO_4.setParentId(questionId);
        videoDTO_4.setCreatedDate(new Date());
        videoDTO_4.setVisible(true);


        VideoRepository videoRepository = new VideoRepository();

        videoRepository.add(videoDTO_1);
        videoRepository.add(videoDTO_2);
        videoRepository.add(videoDTO_3);
        videoRepository.add(videoDTO_4);

    }

    public static void formula() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(3); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        question.setQuestionFileLink("BQADAgAD5gIAAh0c6EgVkTq-U8T10QI");
        question.setTitle(" Formula  loyihasi");
        question.setAnswerFileLink("BQADAgAD5wIAAh0c6EgOsOwtv3NnFgI");

        question.setQuestionState(QuestionState.FILE);
        question.setAnswerState(QuestionState.FILE);

        question.setVisible(true);
        question.setHasTest(false);

        QuestionRepository questionRepository = new QuestionRepository();
        Integer questionId = questionRepository.saveQuestion(question);

        question = null;

        // save
        VideoDTO videoDTO_1 = new VideoDTO();
        videoDTO_1.setVideoOrder(1);
        videoDTO_1.setVideoLink("BAADAgADiQIAAiMMsEhwl2QUA7KTiQI");
        videoDTO_1.setParentId(questionId);
        videoDTO_1.setCreatedDate(new Date());
        videoDTO_1.setVisible(true);


        VideoDTO videoDTO_2 = new VideoDTO();
        videoDTO_2.setVideoOrder(2);
        videoDTO_2.setVideoLink("BAADAgADigIAAiMMsEi_s3Zs1ub6eAI");
        videoDTO_2.setParentId(questionId);
        videoDTO_2.setCreatedDate(new Date());
        videoDTO_2.setVisible(true);

        VideoDTO videoDTO_3 = new VideoDTO();
        videoDTO_3.setVideoOrder(3);
        videoDTO_3.setVideoLink("BAADAgADjAIAAiMMsEhgXY8GCYKvyAI");
        videoDTO_3.setParentId(questionId);
        videoDTO_3.setCreatedDate(new Date());
        videoDTO_3.setVisible(true);


        VideoDTO videoDTO_4 = new VideoDTO();
        videoDTO_4.setVideoOrder(4);
        videoDTO_4.setVideoLink("BAADAgADjQIAAiMMsEgid1JYZj4tiAI");
        videoDTO_4.setParentId(questionId);
        videoDTO_4.setCreatedDate(new Date());
        videoDTO_4.setVisible(true);


        VideoDTO videoDTO_5 = new VideoDTO();
        videoDTO_5.setVideoOrder(5);
        videoDTO_5.setVideoLink("BAADAgADjgIAAiMMsEgJYZnNQeebCAI");
        videoDTO_5.setParentId(questionId);
        videoDTO_5.setCreatedDate(new Date());
        videoDTO_5.setVisible(true);

        VideoRepository videoRepository = new VideoRepository();

        videoRepository.add(videoDTO_1);
        videoRepository.add(videoDTO_2);
        videoRepository.add(videoDTO_3);
        videoRepository.add(videoDTO_4);
        videoRepository.add(videoDTO_5);

    }

    public static void clinic() {

        QuestionDto question = new QuestionDto();

        question.setQuestionId(4); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        question.setQuestionFileLink("BQADAgAD6AIAAh0c6EgkVejQEuugBAI");
        question.setTitle(" Clinic  loyihasi");
        question.setAnswerFileLink("BQADAgAD6QIAAh0c6EhNosaAFb0oagI");

        question.setQuestionState(QuestionState.FILE);
        question.setAnswerState(QuestionState.FILE);

        question.setVisible(true);
        question.setHasTest(false);

        QuestionRepository questionRepository = new QuestionRepository();
        Integer questionId = questionRepository.saveQuestion(question);

        question = null;

        // save
        VideoDTO videoDTO_1 = new VideoDTO();
        videoDTO_1.setVideoOrder(1);
        videoDTO_1.setVideoLink("BAADAgADjwIAAiMMsEjxqZCqMdT1QQI");
        videoDTO_1.setParentId(questionId);
        videoDTO_1.setCreatedDate(new Date());
        videoDTO_1.setVisible(true);


        VideoDTO videoDTO_2 = new VideoDTO();
        videoDTO_2.setVideoOrder(2);
        videoDTO_2.setVideoLink("BAADAgADkAIAAiMMsEjuqT0-1CucMwI");
        videoDTO_2.setParentId(questionId);
        videoDTO_2.setCreatedDate(new Date());
        videoDTO_2.setVisible(true);

        VideoDTO videoDTO_3 = new VideoDTO();
        videoDTO_3.setVideoOrder(3);
        videoDTO_3.setVideoLink("BAADAgADkQIAAiMMsEjjgHcoY5oG5wI");
        videoDTO_3.setParentId(questionId);
        videoDTO_3.setCreatedDate(new Date());
        videoDTO_3.setVisible(true);


        VideoDTO videoDTO_4 = new VideoDTO();
        videoDTO_4.setVideoOrder(4);
        videoDTO_4.setVideoLink("BAADAgADkgIAAiMMsEjTX5cDeuejFwI");
        videoDTO_4.setParentId(questionId);
        videoDTO_4.setCreatedDate(new Date());
        videoDTO_4.setVisible(true);


        VideoDTO videoDTO_5 = new VideoDTO();
        videoDTO_5.setVideoOrder(5);
        videoDTO_5.setVideoLink("BAADAgADkwIAAiMMsEj3OEE06R4LbAI");
        videoDTO_5.setParentId(questionId);
        videoDTO_5.setCreatedDate(new Date());
        videoDTO_5.setVisible(true);

        VideoDTO videoDTO_6 = new VideoDTO();
        videoDTO_6.setVideoOrder(6);
        videoDTO_6.setVideoLink("BAADAgADlAIAAiMMsEgMnUX--bqnDgI");
        videoDTO_6.setParentId(questionId);
        videoDTO_6.setCreatedDate(new Date());
        videoDTO_6.setVisible(true);


        VideoDTO videoDTO_7 = new VideoDTO();
        videoDTO_7.setVideoOrder(7);
        videoDTO_7.setVideoLink("BAADAgADlwIAAiMMsEitZpba6TFLAgI");
        videoDTO_7.setParentId(questionId);
        videoDTO_7.setCreatedDate(new Date());
        videoDTO_7.setVisible(true);

        VideoRepository videoRepository = new VideoRepository();

        videoRepository.add(videoDTO_1);
        videoRepository.add(videoDTO_2);
        videoRepository.add(videoDTO_3);
        videoRepository.add(videoDTO_4);
        videoRepository.add(videoDTO_5);
        videoRepository.add(videoDTO_6);
        videoRepository.add(videoDTO_7);
    }

    public static void flatRent() {

        QuestionDto question = new QuestionDto();

        question.setQuestionId(5); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        question.setQuestionFileLink("BQADAgAD6gIAAh0c6EiF6DWUEHxwjgI");
        question.setTitle(" Flat Rent  loyihasi");
        question.setAnswerFileLink("BQADAgAD6wIAAh0c6EjipdMFM5A6EQI");

        question.setQuestionState(QuestionState.FILE);
        question.setAnswerState(QuestionState.FILE);

        question.setVisible(true);
        question.setHasTest(false);

        QuestionRepository questionRepository = new QuestionRepository();
        Integer questionId = questionRepository.saveQuestion(question);

        question = null;


        // save
        VideoDTO videoDTO_1 = new VideoDTO();
        videoDTO_1.setVideoOrder(1);
        videoDTO_1.setVideoLink("BAADAgADmQIAAiMMsEg22LPWqSSbagI");
        videoDTO_1.setParentId(questionId);
        videoDTO_1.setCreatedDate(new Date());
        videoDTO_1.setVisible(true);


        VideoDTO videoDTO_2 = new VideoDTO();
        videoDTO_2.setVideoOrder(2);
        videoDTO_2.setVideoLink("BAADAgADmwIAAiMMsEiku114TryclwI");
        videoDTO_2.setParentId(questionId);
        videoDTO_2.setCreatedDate(new Date());
        videoDTO_2.setVisible(true);

        VideoDTO videoDTO_3 = new VideoDTO();
        videoDTO_3.setVideoOrder(3);
        videoDTO_3.setVideoLink("BAADAgADnQIAAiMMsEi3BDkys8IHIwI");
        videoDTO_3.setParentId(questionId);
        videoDTO_3.setCreatedDate(new Date());
        videoDTO_3.setVisible(true);


        VideoDTO videoDTO_4 = new VideoDTO();
        videoDTO_4.setVideoOrder(4);
        videoDTO_4.setVideoLink("BAADAgADnQIAAngEqEhIxiVnf79tzwI");
        videoDTO_4.setParentId(questionId);
        videoDTO_4.setCreatedDate(new Date());
        videoDTO_4.setVisible(true);

        VideoRepository videoRepository = new VideoRepository();

        videoRepository.add(videoDTO_1);
        videoRepository.add(videoDTO_2);
        videoRepository.add(videoDTO_3);
        videoRepository.add(videoDTO_4);

    }

    public static void webForum() {

        QuestionDto question = new QuestionDto();

        question.setQuestionId(6); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        question.setQuestionFileLink("BQADAgAD7AIAAh0c6EiVXq-xu_Nx6gI");
        question.setTitle(" WebForum  loyihasi");
        question.setAnswerFileLink("BQADAgAD7QIAAh0c6EgeIdRC_qzOSgI");

        question.setQuestionState(QuestionState.FILE);
        question.setAnswerState(QuestionState.FILE);

        question.setVisible(true);
        question.setHasTest(false);

        QuestionRepository questionRepository = new QuestionRepository();
        Integer questionId = questionRepository.saveQuestion(question);

        question = null;

        // save
        VideoDTO videoDTO_1 = new VideoDTO();
        videoDTO_1.setVideoOrder(1);
        videoDTO_1.setVideoLink("BAADAgADngIAAiMMsEhKFGhWCvjvuwI");
        videoDTO_1.setParentId(questionId);
        videoDTO_1.setCreatedDate(new Date());
        videoDTO_1.setVisible(true);


        VideoDTO videoDTO_2 = new VideoDTO();
        videoDTO_2.setVideoOrder(2);
        videoDTO_2.setVideoLink("BAADAgADoAIAAiMMsEgGL1TKxzNkWAI");
        videoDTO_2.setParentId(questionId);
        videoDTO_2.setCreatedDate(new Date());
        videoDTO_2.setVisible(true);

        VideoDTO videoDTO_3 = new VideoDTO();
        videoDTO_3.setVideoOrder(3);
        videoDTO_3.setVideoLink("BAADAgADowIAAiMMsEgvQwRvljV3kgI");
        videoDTO_3.setParentId(questionId);
        videoDTO_3.setCreatedDate(new Date());
        videoDTO_3.setVisible(true);


        VideoDTO videoDTO_4 = new VideoDTO();
        videoDTO_4.setVideoOrder(4);
        videoDTO_4.setVideoLink("BAADAgADpQIAAiMMsEiV3xzrrn__OAI");
        videoDTO_4.setParentId(questionId);
        videoDTO_4.setCreatedDate(new Date());
        videoDTO_4.setVisible(true);

        VideoRepository videoRepository = new VideoRepository();

        videoRepository.add(videoDTO_1);
        videoRepository.add(videoDTO_2);
        videoRepository.add(videoDTO_3);
        videoRepository.add(videoDTO_4);

    }

    public static void taxiCompany() {
        QuestionDto question = new QuestionDto();

        question.setQuestionId(7); //< QUESTION ORDER RELATIVE TO PARENT
        question.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        question.setQuestionFileLink("BQADAgAD7gIAAh0c6EiH4R8020huswI");
        question.setTitle(" TaxiCompany  loyihasi");
        question.setAnswerFileLink("BQADAgAD7wIAAh0c6Ei3-JQnKZyOhAI");

        question.setQuestionState(QuestionState.FILE);
        question.setAnswerState(QuestionState.FILE);

        question.setVisible(true);
        question.setHasTest(false);

        QuestionRepository questionRepository = new QuestionRepository();
        Integer questionId = questionRepository.saveQuestion(question);

        question = null;

        // save
        VideoDTO videoDTO_1 = new VideoDTO();
        videoDTO_1.setVideoOrder(1);
        videoDTO_1.setVideoLink("BAADAgADpgIAAiMMsEiOWfaemKy78QI");
        videoDTO_1.setParentId(questionId);
        videoDTO_1.setCreatedDate(new Date());
        videoDTO_1.setVisible(true);


        VideoDTO videoDTO_2 = new VideoDTO();
        videoDTO_2.setVideoOrder(2);
        videoDTO_2.setVideoLink("BAADAgADqAIAAiMMsEhmc5ngAx_KkwI");
        videoDTO_2.setParentId(questionId);
        videoDTO_2.setCreatedDate(new Date());
        videoDTO_2.setVisible(true);

        VideoDTO videoDTO_3 = new VideoDTO();
        videoDTO_3.setVideoOrder(3);
        videoDTO_3.setVideoLink("BAADAgADtAIAAiMMsEgDAsiRC7AV8gI");
        videoDTO_3.setParentId(questionId);
        videoDTO_3.setCreatedDate(new Date());
        videoDTO_3.setVisible(true);


        VideoDTO videoDTO_4 = new VideoDTO();
        videoDTO_4.setVideoOrder(4);
        videoDTO_4.setVideoLink("BAADAgADtgIAAiMMsEi_JfyluKa3bwI");
        videoDTO_4.setParentId(questionId);
        videoDTO_4.setCreatedDate(new Date());
        videoDTO_4.setVisible(true);

        VideoDTO videoDTO_5 = new VideoDTO();
        videoDTO_5.setVideoOrder(5);
        videoDTO_5.setVideoLink("BAADAgADtwIAAiMMsEgEL-I1AAH-_s0C");
        videoDTO_5.setParentId(questionId);
        videoDTO_5.setCreatedDate(new Date());
        videoDTO_5.setVisible(true);

        VideoDTO videoDTO_6 = new VideoDTO();
        videoDTO_6.setVideoOrder(6);
        videoDTO_6.setVideoLink("BAADAgADvAIAAiMMsEiq7HxuWCXyBAI");
        videoDTO_6.setParentId(questionId);
        videoDTO_6.setCreatedDate(new Date());
        videoDTO_6.setVisible(true);

        VideoRepository videoRepository = new VideoRepository();

        videoRepository.add(videoDTO_1);
        videoRepository.add(videoDTO_2);
        videoRepository.add(videoDTO_3);
        videoRepository.add(videoDTO_4);
        videoRepository.add(videoDTO_5);
        videoRepository.add(videoDTO_6);
    }

}
