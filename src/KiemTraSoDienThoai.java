import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KiemTraSoDienThoai {
    private Pattern pattern;
    private Matcher matcher;

    public KiemTraSoDienThoai(){

    }
    public static final String REGEX_SDT = "^[0]\\d{9}$";

    public boolean checkRegex(String text){
        pattern = Pattern.compile(REGEX_SDT);
        matcher = pattern.matcher(text);
        return matcher.matches();
    }

    public static void main(String[] args) {
KiemTraSoDienThoai kiemTraSoDienThoai = new KiemTraSoDienThoai();
String[] sdt = {"0328640157", "0977367329", "22222222222", "09876", "0962953943"};
for(String i : sdt){
    boolean result = kiemTraSoDienThoai.checkRegex(i);
    System.out.println("sdt " + i + " la " + result);
}
    }
}
