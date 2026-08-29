class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> set = new HashSet<>();
        int x=0;
        int y=0;

        // starting direction
        set.add("0,0");
        
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i)=='N'){
                x++;
            }
            else if(path.charAt(i)=='S'){
                x--;
            }
            else if(path.charAt(i)=='E'){
                y++;
            }
            else{
                y--;
            }

            String direction = x + "," + y;
            if(set.contains(direction)){
                return true;
            }
            set.add(direction);
        }
        return false;
    }
}