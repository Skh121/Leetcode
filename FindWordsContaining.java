import java.util.ArrayList;
import java.util.List;

public class FindWordsContaining {
        public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<String> word = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i<words.length;i++){
            word.add(words[i]);
        }
        for(int i=0;i<word.size();i++){
            for(int j =0;j<(word.get(i)).length();j++){
                if((word.get(i)).charAt(j)==x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}
