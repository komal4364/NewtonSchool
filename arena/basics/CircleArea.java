import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CircleArea {
    public static void main(String[] args) {
        System.out.println(Area(28));
    }
    static float round(float d, int decimalPlace) {
        return BigDecimal.valueOf(d).setScale(decimalPlace, RoundingMode.HALF_UP).floatValue();
    }
      
    static float Area(int radius){
        float area = 3.14f*radius*radius;
        String df = new DecimalFormat("#.##").format(area);
        return Float.parseFloat(df);
    }
}
