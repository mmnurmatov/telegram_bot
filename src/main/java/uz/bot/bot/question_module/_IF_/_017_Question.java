package uz.gita.bot.question_module._IF_;

/**
 * Created by Bigman on 21.01.2018.
 */
public class _017_Question {

    public Double quadratic(double a, double b, double c) {
        //(aX^2 + bX + c)

        double discriminant = (b * b) - (4 * a * c);
        double x1, x2;

        if (discriminant > 0) { // demak X1,X2 larni topamiz (demak ikkita echimga eka)
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            return x1 + x2;
        } else if (discriminant == 0) { // demak x1 topmiz (bitta echimga ega)
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            return x1;
        } else { //
            return null;
        }
    }

    public String testUserMethod() {
        String s = "Code ni Tekshirish\n";
//
//        String r_1 = quadratic(5, 8, 12);
//        s += "Test 1  (5,8,12).  Kelgan javob  ";
//        if (r_1.equals("scalene")) {
//            s += " '" + r_1 + "' " + "  To'g'ri";
//        } else {
//            s += r_1 + "   Xato ";
//            return s;
//        }
//
//        String r_2 = isTriangle(4, 9, 4);
//        s += "\nTest 2  (4,9,4).  Kelgan javob ";
//        if (r_2.equals("isosceles")) {
//            s += " '" + r_2 + "' " + "  To'g'ri";
//        } else {
//            s += r_2 + "   Xato ";
//            return s;
//        }
//
//        String r_3 = isTriangle(8, 10, 17);
//        s += "\nTest 3  (8, 10, 17).  Kelgan javob ";
//        if (r_3.equals("scalene")) {
//            s += " '" + r_3 + "' " + "  To'g'ri";
//        } else {
//            s += r_3 + "   Xato ";
//            return s;
//        }
//
//        String r_4 = isTriangle(10, 10, 10);
//        s += "\nTest 4  (10, 10, 10).  Kelgan javob ";
//        if (r_4.equals("equilateral")) {
//            s += " '" + r_4 + "' " + "  To'g'ri";
//        } else {
//            s += r_4 + "   Xato ";
//            return s;
//        }

        return s + "\n" + "Hamma Testlardan muofaqiyatli o'tdi. \n \" TABRIKLAYMIZ SIZ BU MISOLNI ISHLAY OLDINGIZ. \"";

    }

    public static void main(String[] args) {
        // Kvadtar tenglamani ildizlarini topuvchi dastur yozing
        // berilgan (aX^2 + bX + c)  (a,b,c)

        System.out.println(new _016_Question().testUserMethod());
    }
}
