package string;
import java.util.StringTokenizer;
public class Strtokenizer {
    public static void main(String[] args) {
        String str ="Java ,python,c++,javascript";
        StringTokenizer st=new StringTokenizer(str,",");

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
    
}
