package uz.gita.bot.common;

public class ParentQuestion {
    public static final Integer BASIC = 1;
    public static final Integer IF_ELSE = 2;
    public static final Integer FOR = 3;
    public static final Integer NESTED_FOR = 4;
    public static final Integer WHILE = 5;
    public static final Integer ARRAY = 6;
    public static final Integer MATRIX = 7;
    public static final Integer METHOD = 8;
    public static final Integer OOP = 9;
    public static final Integer COLLECTION = 10;
    public static final Integer COLLECTION_SORT = 11;
    public static final Integer CURSOR = 12;
    public static final Integer MAP = 13;


    public static Integer getParentId(String parentStr) {
        if (parentStr.equals(Commands.BASIC)) {
            return BASIC;
        } else if (parentStr.equals(Commands.IF)) {
            return IF_ELSE;
        } else if (parentStr.equals(Commands.FOR)) {
            return FOR;
        } else if (parentStr.equals(Commands.NESTED_FOR)) {
            return NESTED_FOR;
        } else if (parentStr.equals(Commands.WHILE)) {
            return WHILE;
        } else if (parentStr.equals(Commands.ARRAY)) {
            return ARRAY;
        } else if (parentStr.equals(Commands.MATRIX)) {
            return MATRIX;
        } else if (parentStr.equals(Commands.METHOD)) {
            return METHOD;
        } else if (parentStr.equals(Commands.OOP)) {
            return OOP;
        } else if (parentStr.equals(Commands.COLLECTION)) {
            return COLLECTION;
        } else if (parentStr.equals(Commands.COLLECTION_SORT)) {
            return COLLECTION_SORT;
        } else if (parentStr.equals(Commands.CURSOR)) {
            return CURSOR;
        }else if (parentStr.equals(Commands.MAP)) {
            return MAP;
        } else {
            return 0;
        }
    }

    public static String getTopicFromParentId(Integer parentId) {
        if (parentId.equals(BASIC)) {
            return Commands.BASIC;
        } else if (parentId.equals(IF_ELSE)) {
            return Commands.IF;
        } else if (parentId.equals(FOR)) {
            return Commands.FOR;
        } else if (parentId.equals(NESTED_FOR)) {
            return Commands.NESTED_FOR;
        } else if (parentId.equals(WHILE)) {
            return Commands.WHILE;
        } else if (parentId.equals(ARRAY)) {
            return Commands.ARRAY;
        } else if (parentId.equals(MATRIX)) {
            return Commands.MATRIX;
        } else if (parentId.equals(METHOD)) {
            return Commands.METHOD;
        } else if (parentId.equals(OOP)) {
            return Commands.OOP;
        } else if (parentId.equals(COLLECTION)) {
            return Commands.COLLECTION;
        } else if (parentId.equals(COLLECTION_SORT)) {
            return Commands.COLLECTION_SORT;
        } else if (parentId.equals(CURSOR)) {
            return Commands.CURSOR;
        } else if (parentId.equals(MAP)) {
            return Commands.MAP;
        } else {
            return "";
        }
    }
}
