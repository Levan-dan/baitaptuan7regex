import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaSinhVien {
    private Pattern pattern;
    private Matcher matcher;

    public MaSinhVien(){

    }

    public static  final String REGEX_ID = "^[CAP]\\d{4}[GHIK]$";

    public  boolean checkRegex(String text){
        pattern = Pattern.compile(REGEX_ID);
        matcher = pattern.matcher(text);
        return matcher.matches();
    }

    public static void main(String[] args) {
        MaSinhVien maSinhVien = new MaSinhVien();
        String[] ma = { "C0223G", "A0323K", "M0318G", "P0323A"};
        for(String i : ma){
            boolean result = maSinhVien.checkRegex(i);
            System.out.println("ma sinh vien : " + i + "la " + result);
        }
    }
}
