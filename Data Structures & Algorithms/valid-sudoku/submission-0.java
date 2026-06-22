class Solution {
    public boolean isValidSudoku(char[][] board) {
        List col = new ArrayList<HashSet<Character>>(9);
        List row = new ArrayList<HashSet<Character>>(9);
        List box = new ArrayList<HashSet<Character>>(9);
        boolean res = true;

        for(int i=0; i<9; i++){
            col.add(new HashSet<Character>());
            row.add(new HashSet<Character>());
            box.add(new HashSet<Character>());
        }
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                int box_num =(int) (Math.floor(i / 3) * 3 + Math.floor(j / 3));
                if(board[i][j] == '.'){
                        continue;
                    }
                if(((HashSet) row.get(i)).contains(board[i][j]) || 
                    ((HashSet) col.get(j)).contains(board[i][j]) ||
                    ((HashSet) box.get(box_num)).contains(board[i][j])){
                        res = false;
                        break;
                    }
                ((HashSet) row.get(i)).add(board[i][j]);
                ((HashSet) col.get(j)).add(board[i][j]);
                ((HashSet) box.get(box_num)).add(board[i][j]);
            }
        }
        return res;
    }
}
