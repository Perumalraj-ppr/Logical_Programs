package core_Java.LogicalPrograms;

import java.util.HashMap;
import java.util.Map;

public class InterviewPrograms {
    public static void main(String[] args) {
        InterviewPrograms ic = new InterviewPrograms();
        ic.repeatedWords();
    }
    private void repeatedWords() {
    String content = "If you are an Airtel or Jio customer," +
            " you do not need to pay any amount for using Wi-Fi calling service. " +
            "Also, you do not need to install additional apps to use the service. However, " +
            "if you are a BSNL customer, " +
            "you will need to install the BSNL Wings app to use BSNL's Wi-Fi calling service.";

        content = content.replaceAll("^[a-zA-Z0-9]*", "");
        content = content.replaceAll("[,.' -]", "");
        System.out.println("String After special Characters Removed :");
        System.out.println(content);
    Map<Character, Integer> filter = new HashMap<>();
    for (int i = 0; i < content.length() ; i++) {
         char c = content.charAt(i);
        if (filter.containsKey(c)){
           filter.put(c, filter.get(c) + 1);
            }else{
                filter.put(c, 1);
            }
        }
        System.out.println("\nKey = Value ");
        for (Map.Entry<Character,Integer> entry : filter.entrySet()) {
            System.out.println(" "+entry.getKey()+"  =  "+entry.getValue());
        }
    }
}
