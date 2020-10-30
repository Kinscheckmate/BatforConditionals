import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;

public class conditionals {

    public static boolean chimpTrouble(boolean aSmile, boolean bSmile){
        boolean trouble = aSmile == bSmile;
        return trouble;
    }

    public static boolean negPos(int a, int b, boolean negative){
        if (negative == true)
        {
            return (a < 0 && b < 0);
        }
        else{
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }
    public static boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if (isAsleep == true)
        {
            return false;
        }
        else if (isMom == true)
        {
            return true;
        }
        else if (isMorning == true)
        {
            return false;
        }
        else
            {
                return true;
            }

    }
    public static String setAlarm(int day, boolean vacation)
    {
        if (vacation)
        {
            if( day == 6 || day == 0)
            {
                return ("off");
            }
            else
                {
                    return "10:00";
                }
        }
        else
            if ( day == 6 || day == 0)
            {
                return "10:00";
            }
            else
            {
                return "7:00";
            }
    }
    public static boolean onesDigitSame(int a, int b, int c)
    {
        int onea = a % 10;
        int oneb = b % 10;
        int onec = c % 10;
        if (onea == oneb || onea == onec || oneb == onec)
        {
            return true;
        }
        else
            {
                return false;
            }
    }

    public static int blackjack(int a, int b)
    {
        if (a > 21 && b > 21)
        {
            return 0;
        }
        else if(a <= 21)
        {
            if (b > 21)
            {
                return a;
            }
            else if (a > b)
                {
                    return a;
                }
            else
                {
                    return b;
                }
        }
        else
        {
            return b;
        }
    }


    public static void main(String[] args)
    {
        System.out.println(chimpTrouble(true, true));
        System.out.println(chimpTrouble(false,false));
        System.out.println(chimpTrouble(true, false));
        System.out.println(chimpTrouble(false,true));
        System.out.println("");
        System.out.println(negPos(1, -1, false));
        System.out.println(negPos (-1, 1, false));
        System.out.println(negPos(1, 1, false));
        System.out.println(negPos (-1, -1, false));
        System.out.println(negPos (-4, -5, true));
        System.out.println(negPos (-4, 5, true));
        System.out.println(negPos (4, 5, true));
        System.out.println(negPos (4, -5, true));
        System.out.println("");
        System.out.println(pickUpPhone (false, false, true));
        System.out.println(pickUpPhone (true, true, true));
        System.out.println(pickUpPhone (true, true, false));
        System.out.println(pickUpPhone (false, true, false));
        System.out.println(pickUpPhone (true, false, false));
        System.out.println(pickUpPhone (false, false, false));
        System.out.println("");
        System.out.println(setAlarm(1, false));
        System.out.println(setAlarm(5, false));
        System.out.println(setAlarm (0, false));
        System.out.println(setAlarm (2, true));
        System.out.println(setAlarm (4, true));
        System.out.println(setAlarm (6, true));
        System.out.println("");
        System.out.println(onesDigitSame(23, 19, 13));
        System.out.println(onesDigitSame(23, 19, 12));
        System.out.println(onesDigitSame(23, 19, 3));
        System.out.println(onesDigitSame(423, 13, 3));
        System.out.println(onesDigitSame(23, 29, 25));
        System.out.println("");
        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
        System.out.println(blackjack(8, 8));
        System.out.println(blackjack(25, 24));
    }
}
