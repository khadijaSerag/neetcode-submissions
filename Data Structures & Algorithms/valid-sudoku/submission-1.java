class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set;

        // rows
        for(int i =0; i<9; i++){
            set = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[i][j] == '.'){
                    continue;
                }

                if(!set.add(board[i][j])){
                    return false;
                }
            }
        }

        // colunms
        for(int i =0; i<9; i++){
            set = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[j][i] == '.'){
                    continue;
                }
                if(!set.add(board[j][i])){
                    return false;
                }
            }
        }

        // 3 x 3 sub-boxes
        for(int i =0; i<3; i++){
            for(int j=0; j<3; j++){
                set = new HashSet<>();

                for(int r =0; r<3; r++){
                    for(int c=0; c<3; c++){

                        int row = i*3+r;
                        int col = j*3+c;

                        if(board[row][col] == '.'){
                                continue;
                        }
                        if(!set.add(board[row][col])){
                            return false;
                        }
                                
                    }
                }
            }
        }

        return true;
    }
}
