package by.academy.jc.dubautsova;

public class FormattedOutput {
    public static String formattedNumber(int num){
        String str = Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1, k = 0; i >= 0; i--, k++) {
            if (k == 3) {
                sb.append(" ");
                k = 0;
            }
            sb.append(str.charAt(i));
        }
        return sb.reverse().toString();
    }
}
