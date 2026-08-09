class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> output = new ArrayList<>();

        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                if(j==i){
                    continue;
                }
                else if(words[i].contains(words[j])){
                    output.add(words[j]);
                }
            }
        }
        output = new ArrayList<>(new HashSet<>(output));
        return output;
    }
}