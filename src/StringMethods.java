public class StringMethods {

    public static double avgLength(String str1,String str2){
        int s1Len = str1.length();
        int s2Len = str2.length();

        double avg = (s1Len+s2Len) / 2.0;

        return avg;
    }

    public static String firstLastLetter(String str1, String str2){

        String str1Sub = str1.substring(0,1);
        String str2LastChar = str2.substring(str2.length() - 1);


        String strConcat = str1Sub+str2LastChar;

        return strConcat;
    }

    public static char middleLetter(String str) {

        int length = str.length();
        int middle = length / 2;

        if (length % 2 == 0) {
            return str.charAt(middle);
        } else {
            return str.charAt(middle);
        }
    }

    public static String swapFirst(String str1, String str2){
        char str1Char = str1.charAt(0);
        char str2Char = str2.charAt(0);
        int str1Len = str1.length();
        String str1Sub = str1.substring(1 , str1Len);
        String str1Concat = str2Char + str1Sub;

        int str2Len = str2.length();
        String str2Sub = str2.substring(1 , str2Len);
        String str2Concat = str1Char + str2Sub;

        String swapReturn = "Swap1: " + str1Concat + "\n" + "Swap2: " + str2Concat;

        return swapReturn;


    }

   public static String removeAt(String str, int index){
       StringBuilder stringBuilder = new StringBuilder(str);
       stringBuilder.deleteCharAt(index);
       return stringBuilder.toString();
   }



}
