import java.util.*;

public class DeleteChar{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("hello");
        sb.delete(0,1);
        System.out.println(sb);
    }

}
