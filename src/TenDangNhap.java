import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TenDangNhap {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String REGEX_NAME = "^[_a-z0-9]{6,}$";

    public TenDangNhap(){

    }
    public boolean checkRegex(String text){
        pattern = Pattern.compile(REGEX_NAME);
        matcher = pattern.matcher(text);
        return matcher.matches();
    }

    public static void main(String[] args) {
        TenDangNhap tenDangNhap = new TenDangNhap();
String[] ten = {"123abc_", "_abc123", "______", ".123456", "abcdefgh"};
for(String i : ten){
    boolean result = tenDangNhap.checkRegex(i);
    System.out.println("ten " + i + " la " + result);
}
    }
}
