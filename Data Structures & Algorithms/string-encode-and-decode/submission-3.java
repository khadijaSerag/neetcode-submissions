class Solution {


    public String encode(List<String> strs) {
        String output = "";

        for(int i = 0; i < strs.size(); i++) {
            output = output + strs.get(i).length() + "#" + strs.get(i);
        }

        return output;
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();

        int i = 0;

        while(i < str.length()) {

            int delimiter = str.indexOf("#", i);

            int length = Integer.parseInt(
                str.substring(i, delimiter)
            );

            int start = delimiter + 1;

            String word = str.substring(start, start + length);

            output.add(word);

            i = start + length;
        }

        return output;
    }
}
