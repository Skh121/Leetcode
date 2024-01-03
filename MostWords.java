import java.util.ArrayList;

public class MostWords {
        public int mostWordsFound(String[] sentences) {
        ArrayList<Integer> arr = new ArrayList<>();
        int max =0;
        for (int i =0; i<sentences.length;i++){
                arr.add(sentences[i].split(" ").length);
        }
        for (int i=0;i<arr.size();i++){
            if(max<arr.get(i)){
                max = arr.get(i);
            }
        }     
        return max;
    }
}
