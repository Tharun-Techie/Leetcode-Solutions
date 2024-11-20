import java.util.ArrayList;
import java.util.List;
class L30 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> resList = new ArrayList<>();
        
        for (String word : words) {
            resList.add(s.indexOf(word));
        }

        return  resList;
    }

    public static void main(String[] args) {
        L30 obj = new L30();
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","word"};

        List<Integer> res = obj.findSubstring(s, words);

        System.out.println(res);
}
}