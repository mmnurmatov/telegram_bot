package uz.gita.bot.question_module._LESSON_;


import uz.gita.bot.common.ParentQuestion;
import uz.gita.bot.dto.VideoLessonDto;
import uz.gita.bot.repository.VideoLessonRepository;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Bigman on 27.05.2018.
 */
public class Lesson_Filler {
    public static List<VideoLessonDto> list = new LinkedList<VideoLessonDto>();

    public static void main(String[] args) {
   //     fill();

    }

    public static void fill() {
        fill_BASIC();
        fill_IF();
        fill_MTHOD();
        fill_FOR();
        fill_WHILE();
        fill_NESTED_FOR();
        fill_ARRAY();
        fill_MATRIX();
        fill_OOP();
        fill_COLLECTION();
        fill_COLLECTION_SORT();
        fill_CURSORS();
        fill_MAP();

        VideoLessonRepository repository = new VideoLessonRepository();
        int count = 1;
        for (VideoLessonDto dto : list) {
            Boolean result = repository.add(dto);
          //  System.out.println(count++ + "  " + result);
        }
    }

    private static void fill_BASIC() {

        /*_BASIC_01*/
        VideoLessonDto _basic_01 = new VideoLessonDto();
        _basic_01.setQuestionId(1);  //< QUESTION ORDER RELATIVE TO PARENT
        _basic_01.setParentId(ParentQuestion.BASIC); //< QUESTION PARENT
        _basic_01.setVisible(true);
        _basic_01.setVideoLink("BAADAgADDAIAAmBIoEgrvOgk-CVDswI");
        _basic_01.setTitle("");
        _basic_01.setCreatedDate(new Date());

        VideoLessonDto _basic_02 = new VideoLessonDto();
        _basic_02.setQuestionId(2);  //< QUESTION ORDER RELATIVE TO PARENT
        _basic_02.setParentId(ParentQuestion.BASIC); //< QUESTION PARENT
        _basic_02.setVisible(true);
        _basic_02.setVideoLink("BAADAgADCwIAAmhmUEhJb6EJLarrpgI");
        _basic_02.setTitle("");
        _basic_02.setCreatedDate(new Date());

        VideoLessonDto _basic_03 = new VideoLessonDto();
        _basic_03.setQuestionId(3);  //< QUESTION ORDER RELATIVE TO PARENT
        _basic_03.setParentId(ParentQuestion.BASIC); //< QUESTION PARENT
        _basic_03.setVisible(true);
        _basic_03.setVideoLink("BAADAgADDAIAAmhmUEgoGYAwBVXmYAI");
        _basic_03.setTitle("");
        _basic_03.setCreatedDate(new Date());

        VideoLessonDto _basic_04 = new VideoLessonDto();
        _basic_04.setQuestionId(4);  //< QUESTION ORDER RELATIVE TO PARENT
        _basic_04.setParentId(ParentQuestion.BASIC); //< QUESTION PARENT
        _basic_04.setVisible(true);
        _basic_04.setVideoLink("BAADAgADrwEAAt2NUEhfrPKabu2R7gI");
        _basic_04.setTitle("");
        _basic_04.setCreatedDate(new Date());

        VideoLessonDto _basic_05 = new VideoLessonDto();
        _basic_05.setQuestionId(5);  //< QUESTION ORDER RELATIVE TO PARENT
        _basic_05.setParentId(ParentQuestion.BASIC); //< QUESTION PARENT
        _basic_05.setVisible(true);
        _basic_05.setVideoLink("BAADAgADsAEAAt2NUEhoP4VKfgHLBgI");
        _basic_05.setTitle("");
        _basic_05.setCreatedDate(new Date());


        VideoLessonDto _basic_06 = new VideoLessonDto();
        _basic_06.setQuestionId(6);  //< QUESTION ORDER RELATIVE TO PARENT
        _basic_06.setParentId(ParentQuestion.BASIC); //< QUESTION PARENT
        _basic_06.setVisible(true);
        _basic_06.setVideoLink("BAADAgADDQIAAmhmUEik2PmsRze6ZQI");
        _basic_06.setTitle("");
        _basic_06.setCreatedDate(new Date());

        VideoLessonDto _basic_07 = new VideoLessonDto();
        _basic_07.setQuestionId(7);  //< QUESTION ORDER RELATIVE TO PARENT
        _basic_07.setParentId(ParentQuestion.BASIC); //< QUESTION PARENT
        _basic_07.setVisible(true);
        _basic_07.setVideoLink("BAADAgADDgIAAmhmUEg9oq9lSxaOBgI");
        _basic_07.setTitle("");
        _basic_07.setCreatedDate(new Date());

        VideoLessonDto _basic_08 = new VideoLessonDto();
        _basic_08.setQuestionId(8);  //< QUESTION ORDER RELATIVE TO PARENT
        _basic_08.setParentId(ParentQuestion.BASIC); //< QUESTION PARENT
        _basic_08.setVisible(true);
        _basic_08.setVideoLink("BAADAgADDwIAAmhmUEhomct25IUUpAI");
        _basic_08.setTitle("");
        _basic_08.setCreatedDate(new Date());


        VideoLessonDto _basic_09 = new VideoLessonDto();
        _basic_09.setQuestionId(9);  //< QUESTION ORDER RELATIVE TO PARENT
        _basic_09.setParentId(ParentQuestion.BASIC); //< QUESTION PARENT
        _basic_09.setVisible(true);
        _basic_09.setVideoLink("BAADAgADEAIAAmhmUEjTpSWW3sp4DwI");
        _basic_09.setTitle("");
        _basic_09.setCreatedDate(new Date());


        VideoLessonDto _basic_10 = new VideoLessonDto();
        _basic_10.setQuestionId(10);  //< QUESTION ORDER RELATIVE TO PARENT
        _basic_10.setParentId(ParentQuestion.BASIC); //< QUESTION PARENT
        _basic_10.setVisible(true);
        _basic_10.setVideoLink("BAADAgADEQIAAmhmUEhpxWYawMAC2wI");
        _basic_10.setTitle("");
        _basic_10.setCreatedDate(new Date());


        VideoLessonDto _basic_11 = new VideoLessonDto();
        _basic_11.setQuestionId(11);  //< QUESTION ORDER RELATIVE TO PARENT
        _basic_11.setParentId(ParentQuestion.BASIC); //< QUESTION PARENT
        _basic_11.setVisible(true);
        _basic_11.setVideoLink("BAADAgADsQEAAt2NUEjMilUE2J9OpgI");
        _basic_11.setTitle("");
        _basic_11.setCreatedDate(new Date());


        VideoLessonDto _basic_12 = new VideoLessonDto();
        _basic_12.setQuestionId(12);  //< QUESTION ORDER RELATIVE TO PARENT
        _basic_12.setParentId(ParentQuestion.BASIC); //< QUESTION PARENT
        _basic_12.setVisible(true);
        _basic_12.setVideoLink("BAADAgADsgEAAt2NUEj3bFHj4fMFVwI");
        _basic_12.setTitle("");
        _basic_12.setCreatedDate(new Date());


        VideoLessonDto _basic_13 = new VideoLessonDto();
        _basic_13.setQuestionId(13);  //< QUESTION ORDER RELATIVE TO PARENT
        _basic_13.setParentId(ParentQuestion.BASIC); //< QUESTION PARENT
        _basic_13.setVisible(true);
        _basic_13.setVideoLink("BAADAgADEgIAAmhmUEgAAfJWRV0yv-oC");
        _basic_13.setTitle("");
        _basic_13.setCreatedDate(new Date());

        list.add(_basic_01);
        list.add(_basic_02);
        list.add(_basic_03);
        list.add(_basic_04);
        list.add(_basic_05);
        list.add(_basic_06);
        list.add(_basic_07);
        list.add(_basic_08);
        list.add(_basic_09);
        list.add(_basic_10);
        list.add(_basic_11);
        list.add(_basic_12);
        list.add(_basic_13);
    }

    private static void fill_IF() {

        VideoLessonDto _if_01 = new VideoLessonDto();
        _if_01.setQuestionId(1);  //< QUESTION ORDER RELATIVE TO PARENT
        _if_01.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT
        _if_01.setVisible(true);
        _if_01.setVideoLink("BAADAgADEwIAAmhmUEjNCrSk2guMSQI");
        _if_01.setTitle("");
        _if_01.setCreatedDate(new Date());


        VideoLessonDto _if_02 = new VideoLessonDto();
        _if_02.setQuestionId(2);  //< QUESTION ORDER RELATIVE TO PARENT
        _if_02.setParentId(ParentQuestion.IF_ELSE); //< QUESTION PARENT
        _if_02.setVisible(true);
        _if_02.setVideoLink("BAADAgADFAIAAmhmUEiEt8DMWHLO5QI");
        _if_02.setTitle("");
        _if_02.setCreatedDate(new Date());

        list.add(_if_01);
        list.add(_if_02);
    }

    private static void fill_MTHOD() {
        VideoLessonDto _method_01 = new VideoLessonDto();
        _method_01.setQuestionId(1);  //< QUESTION ORDER RELATIVE TO PARENT
        _method_01.setParentId(ParentQuestion.METHOD); //< QUESTION PARENT
        _method_01.setVisible(true);
        _method_01.setVideoLink("BAADAgADtQEAAt2NUEj7UzCRkQRAfAI");
        _method_01.setTitle("");
        _method_01.setCreatedDate(new Date());


        VideoLessonDto _method_02 = new VideoLessonDto();
        _method_02.setQuestionId(2);  //< QUESTION ORDER RELATIVE TO PARENT
        _method_02.setParentId(ParentQuestion.METHOD); //< QUESTION PARENT
        _method_02.setVisible(true);
        _method_02.setVideoLink("BAADAgADFgIAAmhmUEihcV-0hGowtwI");
        _method_02.setTitle("");
        _method_02.setCreatedDate(new Date());

        VideoLessonDto _method_03 = new VideoLessonDto();
        _method_03.setQuestionId(3);  //< QUESTION ORDER RELATIVE TO PARENT
        _method_03.setParentId(ParentQuestion.METHOD); //< QUESTION PARENT
        _method_03.setVisible(true);
        _method_03.setVideoLink("BAADAgADFwIAAmhmUEh4BGmoPSK2MwI");
        _method_03.setTitle("");
        _method_03.setCreatedDate(new Date());

        VideoLessonDto _method_04 = new VideoLessonDto();
        _method_04.setQuestionId(4);  //< QUESTION ORDER RELATIVE TO PARENT
        _method_04.setParentId(ParentQuestion.METHOD); //< QUESTION PARENT
        _method_04.setVisible(true);
        _method_04.setVideoLink("BAADAgADtgEAAt2NUEjpWLQtw6lJlwI");
        _method_04.setTitle("");
        _method_04.setCreatedDate(new Date());


        VideoLessonDto _method_05 = new VideoLessonDto();
        _method_05.setQuestionId(5);  //< QUESTION ORDER RELATIVE TO PARENT
        _method_05.setParentId(ParentQuestion.METHOD); //< QUESTION PARENT
        _method_05.setVisible(true);
        _method_05.setVideoLink("BAADAgADGAIAAmhmUEi6bpybaVj4IQI");
        _method_05.setTitle("");
        _method_05.setCreatedDate(new Date());


        VideoLessonDto _method_06 = new VideoLessonDto();
        _method_06.setQuestionId(6);  //< QUESTION ORDER RELATIVE TO PARENT
        _method_06.setParentId(ParentQuestion.METHOD); //< QUESTION PARENT
        _method_06.setVisible(true);
        _method_06.setVideoLink("BAADAgADGQIAAmhmUEj61tRItdbtKgI");
        _method_06.setTitle("");
        _method_06.setCreatedDate(new Date());


        VideoLessonDto _method_07 = new VideoLessonDto();
        _method_07.setQuestionId(7);  //< QUESTION ORDER RELATIVE TO PARENT
        _method_07.setParentId(ParentQuestion.METHOD); //< QUESTION PARENT
        _method_07.setVisible(true);
        _method_07.setVideoLink("BAADAgADtwEAAt2NUEicboR5j9aexwI");
        _method_07.setTitle("");
        _method_07.setCreatedDate(new Date());

        list.add(_method_01);
        list.add(_method_02);
        list.add(_method_03);
        list.add(_method_04);
        list.add(_method_05);
        list.add(_method_06);
        list.add(_method_07);
    }

    private static void fill_FOR() {

        VideoLessonDto _for_01 = new VideoLessonDto();
        _for_01.setQuestionId(1);  //< QUESTION ORDER RELATIVE TO PARENT
        _for_01.setParentId(ParentQuestion.FOR); //< QUESTION PARENT
        _for_01.setVisible(true);
        _for_01.setVideoLink("BAADAgADuAEAAt2NUEjlnb8WgVsGnQI");
        _for_01.setTitle("");
        _for_01.setCreatedDate(new Date());


        VideoLessonDto _for_02 = new VideoLessonDto();
        _for_02.setQuestionId(2);  //< QUESTION ORDER RELATIVE TO PARENT
        _for_02.setParentId(ParentQuestion.FOR); //< QUESTION PARENT
        _for_02.setVisible(true);
        _for_02.setVideoLink("BAADAgADGgIAAmhmUEg6hJCaf1Oo_wI");
        _for_02.setTitle("");
        _for_02.setCreatedDate(new Date());


        VideoLessonDto _for_03 = new VideoLessonDto();
        _for_03.setQuestionId(3);  //< QUESTION ORDER RELATIVE TO PARENT
        _for_03.setParentId(ParentQuestion.FOR); //< QUESTION PARENT
        _for_03.setVisible(true);
        _for_03.setVideoLink("BAADAgADGwIAAmhmUEjoXVG_JUaKywI");
        _for_03.setTitle("");
        _for_03.setCreatedDate(new Date());


        VideoLessonDto _for_04 = new VideoLessonDto();
        _for_04.setQuestionId(4);  //< QUESTION ORDER RELATIVE TO PARENT
        _for_04.setParentId(ParentQuestion.FOR); //< QUESTION PARENT
        _for_04.setVisible(true);
        _for_04.setVideoLink("BAADAgADuQEAAt2NUEi_lHvDuJa0mwI");
        _for_04.setTitle("");
        _for_04.setCreatedDate(new Date());

        list.add(_for_01);
        list.add(_for_02);
        list.add(_for_03);
        list.add(_for_04);
    }

    private static void fill_WHILE() {

        VideoLessonDto _while_01 = new VideoLessonDto();
        _while_01.setQuestionId(1);  //< QUESTION ORDER RELATIVE TO PARENT
        _while_01.setParentId(ParentQuestion.WHILE); //< QUESTION PARENT
        _while_01.setVisible(true);
        _while_01.setVideoLink("BAADAgADugEAAt2NUEgyHkuJuev3BgI");
        _while_01.setTitle("");
        _while_01.setCreatedDate(new Date());


        VideoLessonDto _while_02 = new VideoLessonDto();
        _while_02.setQuestionId(2);  //< QUESTION ORDER RELATIVE TO PARENT
        _while_02.setParentId(ParentQuestion.WHILE); //< QUESTION PARENT
        _while_02.setVisible(true);
        _while_02.setVideoLink("BAADAgADHQIAAmhmUEjuKNTZHMEYjAI");
        _while_02.setTitle("");
        _while_02.setCreatedDate(new Date());


        VideoLessonDto _while_03 = new VideoLessonDto();
        _while_03.setQuestionId(3);  //< QUESTION ORDER RELATIVE TO PARENT
        _while_03.setParentId(ParentQuestion.WHILE); //< QUESTION PARENT
        _while_03.setVisible(true);
        _while_03.setVideoLink("BAADAgADuwEAAt2NUEh4VMES0DiBOAI");
        _while_03.setTitle("");
        _while_03.setCreatedDate(new Date());

        list.add(_while_01);
        list.add(_while_02);
        list.add(_while_03);
    }

    private static void fill_NESTED_FOR() {

        VideoLessonDto _nested_for_01 = new VideoLessonDto();
        _nested_for_01.setQuestionId(1);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_01.setParentId(ParentQuestion.NESTED_FOR); //< QUESTION PARENT
        _nested_for_01.setVisible(true);
        _nested_for_01.setVideoLink("BAADAgADHgIAAmhmUEgB-MGdoJrKYwI");
        _nested_for_01.setTitle("");
        _nested_for_01.setCreatedDate(new Date());


        VideoLessonDto _nested_for_02 = new VideoLessonDto();
        _nested_for_02.setQuestionId(2);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_02.setParentId(ParentQuestion.NESTED_FOR); //< QUESTION PARENT
        _nested_for_02.setVisible(true);
        _nested_for_02.setVideoLink("BAADAgADvAEAAt2NUEhKLj_ximVZ4AI");
        _nested_for_02.setTitle("");
        _nested_for_02.setCreatedDate(new Date());


        VideoLessonDto _nested_for_03 = new VideoLessonDto();
        _nested_for_03.setQuestionId(3);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_03.setParentId(ParentQuestion.NESTED_FOR); //< QUESTION PARENT
        _nested_for_03.setVisible(true);
        _nested_for_03.setVideoLink("BAADAgADHwIAAmhmUEgte6T1-3jU-AI");
        _nested_for_03.setTitle("");
        _nested_for_03.setCreatedDate(new Date());

        list.add(_nested_for_01);
        list.add(_nested_for_02);
        list.add(_nested_for_03);
    }

    private static void fill_ARRAY() {

        VideoLessonDto _array_01 = new VideoLessonDto();
        _array_01.setQuestionId(1);  //< QUESTION ORDER RELATIVE TO PARENT
        _array_01.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT
        _array_01.setVisible(true);
        _array_01.setVideoLink("BAADAgADjQMAAvVgwUgRYGJf-V17VgI");
        _array_01.setTitle("");
        _array_01.setCreatedDate(new Date());


        VideoLessonDto _array_02 = new VideoLessonDto();
        _array_02.setQuestionId(2);  //< QUESTION ORDER RELATIVE TO PARENT
        _array_02.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT
        _array_02.setVisible(true);
        _array_02.setVideoLink("BAADAgADjgMAAvVgwUhfShbY1gd29AI");
        _array_02.setTitle("");
        _array_02.setCreatedDate(new Date());


        VideoLessonDto _array_03 = new VideoLessonDto();
        _array_03.setQuestionId(3);  //< QUESTION ORDER RELATIVE TO PARENT
        _array_03.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT
        _array_03.setVisible(true);
        _array_03.setVideoLink("BAADAgADjwMAAvVgwUiACJLYklQdngI");
        _array_03.setTitle("");
        _array_03.setCreatedDate(new Date());


        VideoLessonDto _array_04 = new VideoLessonDto();
        _array_04.setQuestionId(4);  //< QUESTION ORDER RELATIVE TO PARENT
        _array_04.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT
        _array_04.setVisible(true);
        _array_04.setVideoLink("BAADAgADkAMAAvVgwUgyLKt37W-hUgI");
        _array_04.setTitle("");
        _array_04.setCreatedDate(new Date());


        VideoLessonDto _array_05 = new VideoLessonDto();
        _array_05.setQuestionId(5);  //< QUESTION ORDER RELATIVE TO PARENT
        _array_05.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT
        _array_05.setVisible(true);
        _array_05.setVideoLink("BAADAgADkQMAAvVgwUiPCTfL7TZ0SQI");
        _array_05.setTitle("");
        _array_05.setCreatedDate(new Date());


        VideoLessonDto _array_06 = new VideoLessonDto();
        _array_06.setQuestionId(6);  //< QUESTION ORDER RELATIVE TO PARENT
        _array_06.setParentId(ParentQuestion.ARRAY); //< QUESTION PARENT
        _array_06.setVisible(true);
        _array_06.setVideoLink("BAADAgADkgMAAvVgwUgMRFYuZe2E0wI");
        _array_06.setTitle("");
        _array_06.setCreatedDate(new Date());

        list.add(_array_01);
        list.add(_array_02);
        list.add(_array_03);
        list.add(_array_04);
        list.add(_array_05);
        list.add(_array_06);


    }

    private static void fill_MATRIX() {

        VideoLessonDto _matrix_01 = new VideoLessonDto();
        _matrix_01.setQuestionId(1);  //< QUESTION ORDER RELATIVE TO PARENT
        _matrix_01.setParentId(ParentQuestion.MATRIX); //< QUESTION PARENT
        _matrix_01.setVisible(true);
        _matrix_01.setVideoLink("BAADAgADkwMAAvVgwUjpVD9MuFpFCgI");
        _matrix_01.setTitle("");
        _matrix_01.setCreatedDate(new Date());

        VideoLessonDto _matrix_02 = new VideoLessonDto();
        _matrix_02.setQuestionId(2);  //< QUESTION ORDER RELATIVE TO PARENT
        _matrix_02.setParentId(ParentQuestion.MATRIX); //< QUESTION PARENT
        _matrix_02.setVisible(true);
        _matrix_02.setVideoLink("BAADAgADlAMAAvVgwUifCWsxjeC9YwI");
        _matrix_02.setTitle("");
        _matrix_02.setCreatedDate(new Date());

        VideoLessonDto _matrix_03 = new VideoLessonDto();
        _matrix_03.setQuestionId(3);  //< QUESTION ORDER RELATIVE TO PARENT
        _matrix_03.setParentId(ParentQuestion.MATRIX); //< QUESTION PARENT
        _matrix_03.setVisible(true);
        _matrix_03.setVideoLink("BAADAgADlQMAAvVgwUgktfBBVAijlwI");
        _matrix_03.setTitle("");
        _matrix_03.setCreatedDate(new Date());

        VideoLessonDto _matrix_04 = new VideoLessonDto();
        _matrix_04.setQuestionId(4);  //< QUESTION ORDER RELATIVE TO PARENT
        _matrix_04.setParentId(ParentQuestion.MATRIX); //< QUESTION PARENT
        _matrix_04.setVisible(true);
        _matrix_04.setVideoLink("BAADAgADlgMAAvVgwUhZEEyMhHflWAI");
        _matrix_04.setTitle("");
        _matrix_04.setCreatedDate(new Date());

        VideoLessonDto _matrix_05 = new VideoLessonDto();
        _matrix_05.setQuestionId(5);  //< QUESTION ORDER RELATIVE TO PARENT
        _matrix_05.setParentId(ParentQuestion.MATRIX); //< QUESTION PARENT
        _matrix_05.setVisible(true);
        _matrix_05.setVideoLink("BAADAgADmAMAAvVgwUjHcUplznAVRgI");
        _matrix_05.setTitle("");
        _matrix_05.setCreatedDate(new Date());

        VideoLessonDto _matrix_06 = new VideoLessonDto();
        _matrix_06.setQuestionId(6);  //< QUESTION ORDER RELATIVE TO PARENT
        _matrix_06.setParentId(ParentQuestion.MATRIX); //< QUESTION PARENT
        _matrix_06.setVisible(true);
        _matrix_06.setVideoLink("BAADAgADmgMAAvVgwUihAAFkBI459qQC");
        _matrix_06.setTitle("");
        _matrix_06.setCreatedDate(new Date());

        list.add(_matrix_01);
        list.add(_matrix_02);
        list.add(_matrix_03);
        list.add(_matrix_04);
        list.add(_matrix_05);
        list.add(_matrix_06);

    }

    private static void fill_OOP() {

        VideoLessonDto _nested_for_01 = new VideoLessonDto();
        _nested_for_01.setQuestionId(1);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_01.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_01.setVisible(true);
        _nested_for_01.setVideoLink("BAADAgADLAMAAiMMqEgB7bu0HS9GRgI");
        _nested_for_01.setTitle("Salom dunyo");
        _nested_for_01.setCreatedDate(new Date());

        VideoLessonDto _nested_for_02 = new VideoLessonDto();
        _nested_for_02.setQuestionId(2);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_02.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_02.setVisible(true);
        _nested_for_02.setVideoLink("BAADAgADLQMAAiMMqEhdqP4gTv_0egI");
        _nested_for_02.setTitle("Salom");
        _nested_for_02.setCreatedDate(new Date());

        VideoLessonDto _nested_for_03 = new VideoLessonDto();
        _nested_for_03.setQuestionId(3);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_03.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_03.setVisible(true);
        _nested_for_03.setVideoLink("BAADAgADLgMAAiMMqEiS6qL2TJAB5wI");
        _nested_for_03.setTitle("Salom");
        _nested_for_03.setCreatedDate(new Date());

        VideoLessonDto _nested_for_04 = new VideoLessonDto();
        _nested_for_04.setQuestionId(4);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_04.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_04.setVisible(true);
        _nested_for_04.setVideoLink("BAADAgADMQMAAiMMqEip4lOFLyZttgI");
        _nested_for_04.setTitle("Salom");
        _nested_for_04.setCreatedDate(new Date());

        VideoLessonDto _nested_for_05 = new VideoLessonDto();
        _nested_for_05.setQuestionId(5);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_05.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_05.setVisible(true);
        _nested_for_05.setVideoLink("BAADAgADMgMAAiMMqEhZPtxGwp9SxgI");
        _nested_for_05.setTitle("Salom");
        _nested_for_05.setCreatedDate(new Date());


        VideoLessonDto _nested_for_06 = new VideoLessonDto();
        _nested_for_06.setQuestionId(6);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_06.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_06.setVisible(true);
        _nested_for_06.setVideoLink("BAADAgADMwMAAiMMqEgKL7Fqc5KqzgI");
        _nested_for_06.setTitle("Salom");
        _nested_for_06.setCreatedDate(new Date());

        VideoLessonDto _nested_for_07 = new VideoLessonDto();
        _nested_for_07.setQuestionId(7);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_07.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_07.setVisible(true);
        _nested_for_07.setVideoLink("BAADAgADNAMAAiMMqEiGCwihL89rrwI");
        _nested_for_07.setTitle("Salom");
        _nested_for_07.setCreatedDate(new Date());


        VideoLessonDto _nested_for_08 = new VideoLessonDto();
        _nested_for_08.setQuestionId(8);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_08.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_08.setVisible(true);
        _nested_for_08.setVideoLink("BAADAgADNQMAAiMMqEjD9vHYHeqg_QI");
        _nested_for_08.setTitle("Salom");
        _nested_for_08.setCreatedDate(new Date());


        VideoLessonDto _nested_for_09 = new VideoLessonDto();
        _nested_for_09.setQuestionId(9);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_09.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_09.setVisible(true);
        _nested_for_09.setVideoLink("BAADAgADNwMAAiMMqEhw4xOALhZtwAI");
        _nested_for_09.setTitle("Salom");
        _nested_for_09.setCreatedDate(new Date());


        VideoLessonDto _nested_for_10 = new VideoLessonDto();
        _nested_for_10.setQuestionId(10);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_10.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_10.setVisible(true);
        _nested_for_10.setVideoLink("BAADAgADOAMAAiMMqEhKYJGkNrxYBgI");
        _nested_for_10.setTitle("Salom");
        _nested_for_10.setCreatedDate(new Date());

        VideoLessonDto _nested_for_11 = new VideoLessonDto();
        _nested_for_11.setQuestionId(11);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_11.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_11.setVisible(true);
        _nested_for_11.setVideoLink("BAADAgADOQMAAiMMqEgMNCLWCk_WvgI");
        _nested_for_11.setTitle("Salom");
        _nested_for_11.setCreatedDate(new Date());


        VideoLessonDto _nested_for_12 = new VideoLessonDto();
        _nested_for_12.setQuestionId(12);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_12.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_12.setVisible(true);
        _nested_for_12.setVideoLink("BAADAgADOgMAAiMMqEgib9YacbdjmQI");
        _nested_for_12.setTitle("Salom");
        _nested_for_12.setCreatedDate(new Date());


        VideoLessonDto _nested_for_13 = new VideoLessonDto();
        _nested_for_13.setQuestionId(13);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_13.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_13.setVisible(true);
        _nested_for_13.setVideoLink("BAADAgADOwMAAiMMqEgWSbtJYdqjkQI");
        _nested_for_13.setTitle("Salom");
        _nested_for_13.setCreatedDate(new Date());


        VideoLessonDto _nested_for_14 = new VideoLessonDto();
        _nested_for_14.setQuestionId(14);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_14.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_14.setVisible(true);
        _nested_for_14.setVideoLink("BAADAgADPAMAAiMMqEj6B9Tw8helBgI");
        _nested_for_14.setTitle("Salom");
        _nested_for_14.setCreatedDate(new Date());


        VideoLessonDto _nested_for_15 = new VideoLessonDto();
        _nested_for_15.setQuestionId(15);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_15.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_15.setVisible(true);
        _nested_for_15.setVideoLink("BAADAgADPQMAAiMMqEhhZDcyzKNxxAI");
        _nested_for_15.setTitle("Salom");
        _nested_for_15.setCreatedDate(new Date());


        VideoLessonDto _nested_for_16 = new VideoLessonDto();
        _nested_for_16.setQuestionId(16);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_16.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_16.setVisible(true);
        _nested_for_16.setVideoLink("BAADAgADPwMAAiMMqEhlBZkk8drYYwI");
        _nested_for_16.setTitle("Salom");
        _nested_for_16.setCreatedDate(new Date());


        VideoLessonDto _nested_for_17 = new VideoLessonDto();
        _nested_for_17.setQuestionId(17);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_17.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_17.setVisible(true);
        _nested_for_17.setVideoLink("BAADAgADQAMAAiMMqEhlXvRYpMsk7AI");
        _nested_for_17.setTitle("Salom");
        _nested_for_17.setCreatedDate(new Date());


        VideoLessonDto _nested_for_18 = new VideoLessonDto();
        _nested_for_18.setQuestionId(18);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_18.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_18.setVisible(true);
        _nested_for_18.setVideoLink("BAADAgADQQMAAiMMqEiXGZgtew46iwI");
        _nested_for_18.setTitle("Salom");
        _nested_for_18.setCreatedDate(new Date());


        VideoLessonDto _nested_for_19 = new VideoLessonDto();
        _nested_for_19.setQuestionId(19);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_19.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_19.setVisible(true);
        _nested_for_19.setVideoLink("BAADAgADSwMAAiMMqEjszeoAAfL6OB4C");
        _nested_for_19.setTitle("Salom");
        _nested_for_19.setCreatedDate(new Date());


        VideoLessonDto _nested_for_20 = new VideoLessonDto();
        _nested_for_20.setQuestionId(20);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_20.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_20.setVisible(true);
        _nested_for_20.setVideoLink("BAADAgADTAMAAiMMqEj3qUXXXeDt1wI");
        _nested_for_20.setTitle("Salom");
        _nested_for_20.setCreatedDate(new Date());


        VideoLessonDto _nested_for_21 = new VideoLessonDto();
        _nested_for_21.setQuestionId(21);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_21.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_21.setVisible(true);
        _nested_for_21.setVideoLink("BAADAgADTQMAAiMMqEgYPuiuRdXGCAI");
        _nested_for_21.setTitle("Salom");
        _nested_for_21.setCreatedDate(new Date());


        VideoLessonDto _nested_for_22 = new VideoLessonDto();
        _nested_for_22.setQuestionId(22);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_22.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_22.setVisible(true);
        _nested_for_22.setVideoLink("BAADAgADUQMAAiMMqEgHYMyWQG02zQI");
        _nested_for_22.setTitle("Salom");
        _nested_for_22.setCreatedDate(new Date());


        VideoLessonDto _nested_for_23 = new VideoLessonDto();
        _nested_for_23.setQuestionId(23);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_23.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_23.setVisible(true);
        _nested_for_23.setVideoLink("BAADAgADUgMAAiMMqEhKSqAzA8GUiAI");
        _nested_for_23.setTitle("Salom");
        _nested_for_23.setCreatedDate(new Date());


        VideoLessonDto _nested_for_24 = new VideoLessonDto();
        _nested_for_24.setQuestionId(24);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_24.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_24.setVisible(true);
        _nested_for_24.setVideoLink("BAADAgADUwMAAiMMqEhRcowewilJcwI");
        _nested_for_24.setTitle("Salom");
        _nested_for_24.setCreatedDate(new Date());


        VideoLessonDto _nested_for_25 = new VideoLessonDto();
        _nested_for_25.setQuestionId(25);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_25.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_25.setVisible(true);
        _nested_for_25.setVideoLink("BAADAgADVAMAAiMMqEhu5d8meZ-sLAI");
        _nested_for_25.setTitle("Salom");
        _nested_for_25.setCreatedDate(new Date());

        VideoLessonDto _nested_for_26 = new VideoLessonDto();
        _nested_for_26.setQuestionId(26);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_26.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_26.setVisible(true);
        _nested_for_26.setVideoLink("BAADAgADVgMAAiMMqEiy-lHs7NOr7gI");
        _nested_for_26.setTitle("Salom");
        _nested_for_26.setCreatedDate(new Date());


        VideoLessonDto _nested_for_27 = new VideoLessonDto();
        _nested_for_27.setQuestionId(27);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_27.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_27.setVisible(true);
        _nested_for_27.setVideoLink("BAADAgADVwMAAiMMqEi9-sn1fkPomQI");
        _nested_for_27.setTitle("Salom");
        _nested_for_27.setCreatedDate(new Date());


        VideoLessonDto _nested_for_28 = new VideoLessonDto();
        _nested_for_28.setQuestionId(28);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_28.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_28.setVisible(true);
        _nested_for_28.setVideoLink("BAADAgADWgMAAiMMqEhadX6cfeLVNwI");
        _nested_for_28.setTitle("Salom");
        _nested_for_28.setCreatedDate(new Date());


        VideoLessonDto _nested_for_29 = new VideoLessonDto();
        _nested_for_29.setQuestionId(29);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_29.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_29.setVisible(true);
        _nested_for_29.setVideoLink("BAADAgADWwMAAiMMqEik7SeSUDFqOAI");
        _nested_for_29.setTitle("Salom");
        _nested_for_29.setCreatedDate(new Date());


        VideoLessonDto _nested_for_30 = new VideoLessonDto();
        _nested_for_30.setQuestionId(30);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_30.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_30.setVisible(true);
        _nested_for_30.setVideoLink("BAADAgADXAMAAiMMqEiz_qozSnAybgI");
        _nested_for_30.setTitle("Salom");
        _nested_for_30.setCreatedDate(new Date());


        VideoLessonDto _nested_for_31 = new VideoLessonDto();
        _nested_for_31.setQuestionId(31);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_31.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_31.setVisible(true);
        _nested_for_31.setVideoLink("BAADAgADXQMAAiMMqEjLw3L5fZE7lgI");
        _nested_for_31.setTitle("Salom");
        _nested_for_31.setCreatedDate(new Date());

        VideoLessonDto _nested_for_32 = new VideoLessonDto();
        _nested_for_32.setQuestionId(32);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_32.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_32.setVisible(true);
        _nested_for_32.setVideoLink("BAADAgADXgMAAiMMqEi2OiJllD5KDwI");
        _nested_for_32.setTitle("Salom");
        _nested_for_32.setCreatedDate(new Date());


        VideoLessonDto _nested_for_33 = new VideoLessonDto();
        _nested_for_33.setQuestionId(33);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_33.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_33.setVisible(true);
        _nested_for_33.setVideoLink("BAADAgADXwMAAiMMqEiK-upgDKjCrAI");
        _nested_for_33.setTitle("Salom");
        _nested_for_33.setCreatedDate(new Date());


        VideoLessonDto _nested_for_34 = new VideoLessonDto();
        _nested_for_34.setQuestionId(34);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_34.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_34.setVisible(true);
        _nested_for_34.setVideoLink("BAADAgADYAMAAiMMqEgmJyaH8k7qBwI");
        _nested_for_34.setTitle("Salom");
        _nested_for_34.setCreatedDate(new Date());


        VideoLessonDto _nested_for_35 = new VideoLessonDto();
        _nested_for_35.setQuestionId(35);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_35.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_35.setVisible(true);
        _nested_for_35.setVideoLink("BAADAgADYQMAAiMMqEjrDZcVeMcZUgI");
        _nested_for_35.setTitle("Salom");
        _nested_for_35.setCreatedDate(new Date());


        VideoLessonDto _nested_for_36 = new VideoLessonDto();
        _nested_for_36.setQuestionId(36);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_36.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_36.setVisible(true);
        _nested_for_36.setVideoLink("BAADAgADYgMAAiMMqEgUec4WY4Ia0AI");
        _nested_for_36.setTitle("Salom");
        _nested_for_36.setCreatedDate(new Date());


        VideoLessonDto _nested_for_37 = new VideoLessonDto();
        _nested_for_37.setQuestionId(37);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_37.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_37.setVisible(true);
        _nested_for_37.setVideoLink("BAADAgADYwMAAiMMqEgydw0edf5IcwI");
        _nested_for_37.setTitle("Salom");
        _nested_for_37.setCreatedDate(new Date());


        VideoLessonDto _nested_for_38 = new VideoLessonDto();
        _nested_for_38.setQuestionId(38);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_38.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_38.setVisible(true);
        _nested_for_38.setVideoLink("BAADAgADZAMAAiMMqEjW30KIB8G5twI");
        _nested_for_38.setTitle("Salom");
        _nested_for_38.setCreatedDate(new Date());


        VideoLessonDto _nested_for_39 = new VideoLessonDto();
        _nested_for_39.setQuestionId(39);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_39.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_39.setVisible(true);
        _nested_for_39.setVideoLink("BAADAgADZQMAAiMMqEhWIEEGoW_CKwI");
        _nested_for_39.setTitle("Salom");
        _nested_for_39.setCreatedDate(new Date());


        VideoLessonDto _nested_for_40 = new VideoLessonDto();
        _nested_for_40.setQuestionId(40);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_40.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_40.setVisible(true);
        _nested_for_40.setVideoLink("BAADAgADZgMAAiMMqEjnZBP1sjco7QI");
        _nested_for_40.setTitle("Salom");
        _nested_for_40.setCreatedDate(new Date());


        VideoLessonDto _nested_for_41 = new VideoLessonDto();
        _nested_for_41.setQuestionId(41);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_41.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_41.setVisible(true);
        _nested_for_41.setVideoLink("BAADAgADZwMAAiMMqEiOvN5riHuLCAI");
        _nested_for_41.setTitle("Salom");
        _nested_for_41.setCreatedDate(new Date());

        VideoLessonDto _nested_for_42 = new VideoLessonDto();
        _nested_for_42.setQuestionId(42);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_42.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_42.setVisible(true);
        _nested_for_42.setVideoLink("BAADAgADaQMAAiMMqEga6JYAARbvYHIC");
        _nested_for_42.setTitle("Salom");
        _nested_for_42.setCreatedDate(new Date());


        VideoLessonDto _nested_for_43 = new VideoLessonDto();
        _nested_for_43.setQuestionId(43);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_43.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_43.setVisible(true);
        _nested_for_43.setVideoLink("BAADAgADagMAAiMMqEiHSlJ53iBoawI");
        _nested_for_43.setTitle("Salom");
        _nested_for_43.setCreatedDate(new Date());


        VideoLessonDto _nested_for_44 = new VideoLessonDto();
        _nested_for_44.setQuestionId(44);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_44.setParentId(ParentQuestion.OOP); //< QUESTION PARENT
        _nested_for_44.setVisible(true);
        _nested_for_44.setVideoLink("BAADAgADawMAAiMMqEijXjbdWb7fjAI");
        _nested_for_44.setTitle("Salom");
        _nested_for_44.setCreatedDate(new Date());


        list.add(_nested_for_01);
        list.add(_nested_for_02);
        list.add(_nested_for_03);
        list.add(_nested_for_04);
        list.add(_nested_for_05);
        list.add(_nested_for_06);
        list.add(_nested_for_07);
        list.add(_nested_for_08);
        list.add(_nested_for_09);
        list.add(_nested_for_10);

        list.add(_nested_for_11);
        list.add(_nested_for_12);
        list.add(_nested_for_13);
        list.add(_nested_for_14);
        list.add(_nested_for_15);
        list.add(_nested_for_16);
        list.add(_nested_for_17);
        list.add(_nested_for_18);
        list.add(_nested_for_19);
        list.add(_nested_for_20);

        list.add(_nested_for_21);
        list.add(_nested_for_22);
        list.add(_nested_for_23);
        list.add(_nested_for_24);
        list.add(_nested_for_25);
        list.add(_nested_for_26);
        list.add(_nested_for_27);
        list.add(_nested_for_29);
        list.add(_nested_for_30);

        list.add(_nested_for_31);
        list.add(_nested_for_32);
        list.add(_nested_for_33);
        list.add(_nested_for_34);
        list.add(_nested_for_35);
        list.add(_nested_for_36);
        list.add(_nested_for_37);
        list.add(_nested_for_38);
        list.add(_nested_for_39);
        list.add(_nested_for_40);

        list.add(_nested_for_41);
        list.add(_nested_for_42);
        list.add(_nested_for_43);
        list.add(_nested_for_44);

    }

    private static void fill_COLLECTION() {

        VideoLessonDto _nested_for_01 = new VideoLessonDto();
        _nested_for_01.setQuestionId(1);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_01.setParentId(ParentQuestion.COLLECTION); //< QUESTION PARENT
        _nested_for_01.setVisible(true);
        _nested_for_01.setVideoLink("BAADAgADywIAAiMMsEhetSok4kYrXAI");
        _nested_for_01.setTitle("Salom dunyo");
        _nested_for_01.setCreatedDate(new Date());

        VideoLessonDto _nested_for_02 = new VideoLessonDto();
        _nested_for_02.setQuestionId(2);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_02.setParentId(ParentQuestion.COLLECTION); //< QUESTION PARENT
        _nested_for_02.setVisible(true);
        _nested_for_02.setVideoLink("BAADAgADzAIAAiMMsEivTvId25ER1gI");
        _nested_for_02.setTitle("Salom");
        _nested_for_02.setCreatedDate(new Date());

        VideoLessonDto _nested_for_03 = new VideoLessonDto();
        _nested_for_03.setQuestionId(3);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_03.setParentId(ParentQuestion.COLLECTION); //< QUESTION PARENT
        _nested_for_03.setVisible(true);
        _nested_for_03.setVideoLink("BAADAgADzQIAAiMMsEgLntiY5jzMsAI");
        _nested_for_03.setTitle("Salom");
        _nested_for_03.setCreatedDate(new Date());

        VideoLessonDto _nested_for_04 = new VideoLessonDto();
        _nested_for_04.setQuestionId(4);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_04.setParentId(ParentQuestion.COLLECTION); //< QUESTION PARENT
        _nested_for_04.setVisible(true);
        _nested_for_04.setVideoLink("BAADAgADbQEAArkrqUjBcPcCAU11mAI");
        _nested_for_04.setTitle("Salom");
        _nested_for_04.setCreatedDate(new Date());

        VideoLessonDto _nested_for_05 = new VideoLessonDto();
        _nested_for_05.setQuestionId(5);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_05.setParentId(ParentQuestion.COLLECTION); //< QUESTION PARENT
        _nested_for_05.setVisible(true);
        _nested_for_05.setVideoLink("BAADAgADfgEAArkrqUg0sV4UEnxYWgI");
        _nested_for_05.setTitle("Salom");
        _nested_for_05.setCreatedDate(new Date());


        VideoLessonDto _nested_for_06 = new VideoLessonDto();
        _nested_for_06.setQuestionId(6);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_06.setParentId(ParentQuestion.COLLECTION); //< QUESTION PARENT
        _nested_for_06.setVisible(true);
        _nested_for_06.setVideoLink("BAADAgADjwEAArkrqUiGkUD469yIqwI");
        _nested_for_06.setTitle("Salom");
        _nested_for_06.setCreatedDate(new Date());

        VideoLessonDto _nested_for_07 = new VideoLessonDto();
        _nested_for_07.setQuestionId(7);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_07.setParentId(ParentQuestion.COLLECTION); //< QUESTION PARENT
        _nested_for_07.setVisible(true);
        _nested_for_07.setVideoLink("BAADAgADkAEAArkrqUiqAAEyUS1TEwQC");
        _nested_for_07.setTitle("Salom");
        _nested_for_07.setCreatedDate(new Date());


        VideoLessonDto _nested_for_08 = new VideoLessonDto();
        _nested_for_08.setQuestionId(8);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_08.setParentId(ParentQuestion.COLLECTION); //< QUESTION PARENT
        _nested_for_08.setVisible(true);
        _nested_for_08.setVideoLink("BAADAgADkQEAArkrqUjDJ-MQQgGXsQI");
        _nested_for_08.setTitle("Salom");
        _nested_for_08.setCreatedDate(new Date());


        VideoLessonDto _nested_for_09 = new VideoLessonDto();
        _nested_for_09.setQuestionId(9);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_09.setParentId(ParentQuestion.COLLECTION); //< QUESTION PARENT
        _nested_for_09.setVisible(true);
        _nested_for_09.setVideoLink("BAADAgADkgEAArkrqUiTuJ2RPHVYLQI");
        _nested_for_09.setTitle("Salom");
        _nested_for_09.setCreatedDate(new Date());


        VideoLessonDto _nested_for_10 = new VideoLessonDto();
        _nested_for_10.setQuestionId(10);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_10.setParentId(ParentQuestion.COLLECTION); //< QUESTION PARENT
        _nested_for_10.setVisible(true);
        _nested_for_10.setVideoLink("BAADAgADkwEAArkrqUi2pjgNuHONBQI");
        _nested_for_10.setTitle("Salom");
        _nested_for_10.setCreatedDate(new Date());

        VideoLessonDto _nested_for_11 = new VideoLessonDto();
        _nested_for_11.setQuestionId(11);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_11.setParentId(ParentQuestion.COLLECTION); //< QUESTION PARENT
        _nested_for_11.setVisible(true);
        _nested_for_11.setVideoLink("BAADAgADlQEAArkrqUhZdBNdrTEKKAI");
        _nested_for_11.setTitle("Salom");
        _nested_for_11.setCreatedDate(new Date());


        VideoLessonDto _nested_for_12 = new VideoLessonDto();
        _nested_for_12.setQuestionId(12);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_12.setParentId(ParentQuestion.COLLECTION); //< QUESTION PARENT
        _nested_for_12.setVisible(true);
        _nested_for_12.setVideoLink("BAADAgADlgEAArkrqUjUipmq6vrDAwI");
        _nested_for_12.setTitle("Salom");
        _nested_for_12.setCreatedDate(new Date());


        VideoLessonDto _nested_for_13 = new VideoLessonDto();
        _nested_for_13.setQuestionId(13);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_13.setParentId(ParentQuestion.COLLECTION); //< QUESTION PARENT
        _nested_for_13.setVisible(true);
        _nested_for_13.setVideoLink("BAADAgADlwEAArkrqUgn_LIxcuLDpwI");
        _nested_for_13.setTitle("Salom");
        _nested_for_13.setCreatedDate(new Date());


        VideoLessonDto _nested_for_14 = new VideoLessonDto();
        _nested_for_14.setQuestionId(14);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_14.setParentId(ParentQuestion.COLLECTION); //< QUESTION PARENT
        _nested_for_14.setVisible(true);
        _nested_for_14.setVideoLink("BAADAgADmgEAArkrqUjo1MzA8MJnYgI");
        _nested_for_14.setTitle("Salom");
        _nested_for_14.setCreatedDate(new Date());


        VideoLessonDto _nested_for_15 = new VideoLessonDto();
        _nested_for_15.setQuestionId(15);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_15.setParentId(ParentQuestion.COLLECTION); //< QUESTION PARENT
        _nested_for_15.setVisible(true);
        _nested_for_15.setVideoLink("BAADAgADmwEAArkrqUj2hUZ7adfwuQI");
        _nested_for_15.setTitle("Salom");
        _nested_for_15.setCreatedDate(new Date());


        VideoLessonDto _nested_for_16 = new VideoLessonDto();
        _nested_for_16.setQuestionId(16);  //< QUESTION ORDER RELATIVE TO PARENT
        _nested_for_16.setParentId(ParentQuestion.COLLECTION); //< QUESTION PARENT
        _nested_for_16.setVisible(true);
        _nested_for_16.setVideoLink("BAADAgADqQEAArkrqUgOO3OCZBrJxgI");
        _nested_for_16.setTitle("Salom");
        _nested_for_16.setCreatedDate(new Date());

        list.add(_nested_for_01);
        list.add(_nested_for_02);
        list.add(_nested_for_03);
        list.add(_nested_for_04);
        list.add(_nested_for_05);
        list.add(_nested_for_06);
        list.add(_nested_for_07);
        list.add(_nested_for_08);
        list.add(_nested_for_09);
        list.add(_nested_for_10);

        list.add(_nested_for_11);
        list.add(_nested_for_12);
        list.add(_nested_for_13);
        list.add(_nested_for_14);
        list.add(_nested_for_15);
        list.add(_nested_for_16);
    }

    private static void fill_COLLECTION_SORT() {

        VideoLessonDto _collection_sort_01 = new VideoLessonDto();
        _collection_sort_01.setQuestionId(1);  //< QUESTION ORDER RELATIVE TO PARENT
        _collection_sort_01.setParentId(ParentQuestion.COLLECTION_SORT); //< QUESTION PARENT
        _collection_sort_01.setVisible(true);
        _collection_sort_01.setVideoLink("BAADAgAD4gEAAl-S2Ugt6S6eAAG4iqYC");
        _collection_sort_01.setTitle("Salom dunyo");
        _collection_sort_01.setCreatedDate(new Date());

        VideoLessonDto _collection_sort_02 = new VideoLessonDto();
        _collection_sort_02.setQuestionId(2);  //< QUESTION ORDER RELATIVE TO PARENT
        _collection_sort_02.setParentId(ParentQuestion.COLLECTION_SORT); //< QUESTION PARENT
        _collection_sort_02.setVisible(true);
        _collection_sort_02.setVideoLink("BAADAgAD4wEAAl-S2Uh2LdlT9_ZWawI");
        _collection_sort_02.setTitle("Salom");
        _collection_sort_02.setCreatedDate(new Date());

        VideoLessonDto _collection_sort_03 = new VideoLessonDto();
        _collection_sort_03.setQuestionId(3);  //< QUESTION ORDER RELATIVE TO PARENT
        _collection_sort_03.setParentId(ParentQuestion.COLLECTION_SORT); //< QUESTION PARENT
        _collection_sort_03.setVisible(true);
        _collection_sort_03.setVideoLink("BAADAgAD5QEAAl-S2UjIvTk-eySMnAI");
        _collection_sort_03.setTitle("Salom");
        _collection_sort_03.setCreatedDate(new Date());

        VideoLessonDto _collection_sort_04 = new VideoLessonDto();
        _collection_sort_04.setQuestionId(4);  //< QUESTION ORDER RELATIVE TO PARENT
        _collection_sort_04.setParentId(ParentQuestion.COLLECTION_SORT); //< QUESTION PARENT
        _collection_sort_04.setVisible(true);
        _collection_sort_04.setVideoLink("BAADAgAD5wEAAl-S2UhwKDZeLB1ApgI");
        _collection_sort_04.setTitle("Salom");
        _collection_sort_04.setCreatedDate(new Date());


        list.add(_collection_sort_01);
        list.add(_collection_sort_02);
        list.add(_collection_sort_03);
        list.add(_collection_sort_04);
    }

    private static void fill_CURSORS() {
        VideoLessonDto _cursor_01 = new VideoLessonDto();
        _cursor_01.setQuestionId(1);  //< QUESTION ORDER RELATIVE TO PARENT
        _cursor_01.setParentId(ParentQuestion.CURSOR); //< QUESTION PARENT
        _cursor_01.setVisible(true);
        _cursor_01.setVideoLink("BAADAgAD6QEAAl-S2Uh39CQnNuriywI");
        _cursor_01.setTitle("Salom dunyo");
        _cursor_01.setCreatedDate(new Date());

        VideoLessonDto _cursor_02 = new VideoLessonDto();
        _cursor_02.setQuestionId(2);  //< QUESTION ORDER RELATIVE TO PARENT
        _cursor_02.setParentId(ParentQuestion.CURSOR); //< QUESTION PARENT
        _cursor_02.setVisible(true);
        _cursor_02.setVideoLink("BAADAgAD7QEAAl-S2UglqzwS4Ekw8wI");
        _cursor_02.setTitle("Salom");
        _cursor_02.setCreatedDate(new Date());

        VideoLessonDto _cursor_03 = new VideoLessonDto();
        _cursor_03.setQuestionId(3);  //< QUESTION ORDER RELATIVE TO PARENT
        _cursor_03.setParentId(ParentQuestion.CURSOR); //< QUESTION PARENT
        _cursor_03.setVisible(true);
        _cursor_03.setVideoLink("BAADAgAD7gEAAl-S2UjGHxHQsJZ81QI");
        _cursor_03.setTitle("Salom");
        _cursor_03.setCreatedDate(new Date());

        VideoLessonDto _cursor_04 = new VideoLessonDto();
        _cursor_04.setQuestionId(4);  //< QUESTION ORDER RELATIVE TO PARENT
        _cursor_04.setParentId(ParentQuestion.CURSOR); //< QUESTION PARENT
        _cursor_04.setVisible(true);
        _cursor_04.setVideoLink("BAADAgAD7wEAAl-S2UhU3A1kwn4WdQI");
        _cursor_04.setTitle("Salom");
        _cursor_04.setCreatedDate(new Date());


        list.add(_cursor_01);
        list.add(_cursor_02);
        list.add(_cursor_03);
        list.add(_cursor_04);
    }

    private static void fill_MAP() {
        VideoLessonDto _map_01 = new VideoLessonDto();
        _map_01.setQuestionId(1);  //< QUESTION ORDER RELATIVE TO PARENT
        _map_01.setParentId(ParentQuestion.MAP); //< QUESTION PARENT
        _map_01.setVisible(true);
        _map_01.setVideoLink("BAADAgAD_wEAAolL8Eh29Lr9noAyGQI");
        _map_01.setTitle("Salom dunyo");
        _map_01.setCreatedDate(new Date());


        VideoLessonDto _map_02 = new VideoLessonDto();
        _map_02.setQuestionId(2);  //< QUESTION ORDER RELATIVE TO PARENT
        _map_02.setParentId(ParentQuestion.MAP); //< QUESTION PARENT
        _map_02.setVisible(true);
        _map_02.setVideoLink("BAADAgADAgIAAolL8EggdkRIPzfvXwI");
        _map_02.setTitle("Salom dunyo");
        _map_02.setCreatedDate(new Date());


        VideoLessonDto _map_03 = new VideoLessonDto();
        _map_03.setQuestionId(3);  //< QUESTION ORDER RELATIVE TO PARENT
        _map_03.setParentId(ParentQuestion.MAP); //< QUESTION PARENT
        _map_03.setVisible(true);
        _map_03.setVideoLink("BAADAgADAwIAAolL8EhwLcu8awpbvwI");
        _map_03.setTitle("Salom dunyo");
        _map_03.setCreatedDate(new Date());


        VideoLessonDto _map_04 = new VideoLessonDto();
        _map_04.setQuestionId(1);  //< QUESTION ORDER RELATIVE TO PARENT
        _map_04.setParentId(ParentQuestion.MAP); //< QUESTION PARENT
        _map_04.setVisible(true);
        _map_04.setVideoLink("BAADAgADBAIAAolL8EgqEI3lXv2nnQI");
        _map_04.setTitle("Salom dunyo");
        _map_04.setCreatedDate(new Date());


        VideoLessonDto _map_05 = new VideoLessonDto();
        _map_05.setQuestionId(5);  //< QUESTION ORDER RELATIVE TO PARENT
        _map_05.setParentId(ParentQuestion.MAP); //< QUESTION PARENT
        _map_05.setVisible(true);
        _map_05.setVideoLink("BAADAgADBQIAAolL8EjumsdPCVAcgAI");
        _map_05.setTitle("Salom dunyo");
        _map_05.setCreatedDate(new Date());


        VideoLessonDto _map_06 = new VideoLessonDto();
        _map_06.setQuestionId(6);  //< QUESTION ORDER RELATIVE TO PARENT
        _map_06.setParentId(ParentQuestion.MAP); //< QUESTION PARENT
        _map_06.setVisible(true);
        _map_06.setVideoLink("BAADAgADBgIAAolL8EhROFIBSkhcwAI");
        _map_06.setTitle("Salom dunyo");
        _map_06.setCreatedDate(new Date());


        VideoLessonDto _map_07 = new VideoLessonDto();
        _map_07.setQuestionId(7);  //< QUESTION ORDER RELATIVE TO PARENT
        _map_07.setParentId(ParentQuestion.MAP); //< QUESTION PARENT
        _map_07.setVisible(true);
        _map_07.setVideoLink("BAADAgADBwIAAolL8EjASzmipcVuXQI");
        _map_07.setTitle("Salom dunyo");
        _map_07.setCreatedDate(new Date());


        VideoLessonDto _map_08 = new VideoLessonDto();
        _map_08.setQuestionId(8);  //< QUESTION ORDER RELATIVE TO PARENT
        _map_08.setParentId(ParentQuestion.MAP); //< QUESTION PARENT
        _map_08.setVisible(true);
        _map_08.setVideoLink("BAADAgADCAIAAolL8EhCm5bVeYYrKQI");
        _map_08.setTitle("Salom dunyo");
        _map_08.setCreatedDate(new Date());


        VideoLessonDto _map_09 = new VideoLessonDto();
        _map_09.setQuestionId(9);  //< QUESTION ORDER RELATIVE TO PARENT
        _map_09.setParentId(ParentQuestion.MAP); //< QUESTION PARENT
        _map_09.setVisible(true);
        _map_09.setVideoLink("BAADAgADCgIAAolL8Ei3ugRf0nvHGwI");
        _map_09.setTitle("Salom dunyo");
        _map_09.setCreatedDate(new Date());


        VideoLessonDto _map_10 = new VideoLessonDto();
        _map_10.setQuestionId(10);  //< QUESTION ORDER RELATIVE TO PARENT
        _map_10.setParentId(ParentQuestion.MAP); //< QUESTION PARENT
        _map_10.setVisible(true);
        _map_10.setVideoLink("BAADAgADCwIAAolL8EgIFW_MgjxqVAI");
        _map_10.setTitle("Salom dunyo");
        _map_10.setCreatedDate(new Date());


        list.add(_map_01);
        list.add(_map_02);
        list.add(_map_03);
        list.add(_map_04);
        list.add(_map_05);
        list.add(_map_06);
        list.add(_map_07);
        list.add(_map_08);
        list.add(_map_09);
        list.add(_map_10);

    }


}
