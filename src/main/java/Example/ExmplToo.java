package Example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExmplToo {
    public static void main(String[] args) {

    String str1 = "Я буду хорошим программистом!";
    String str2 = "Я буду хорошим программистом!";
    String str3 = "Я буду хорошим дворником!";

    int result = str1.compareTo(str2);
      System.out.println(result);

    result = str2.compareTo(str3);
      System.out.println(result);

    result = str3.compareTo(str1);
      System.out.println(result);
}
}
