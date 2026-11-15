class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for(int i = 0; i<operations.length; i++){
            String ch = operations[i];

            if(ch.equals("+")){
               int first = stack.pop();
               int second = stack.peek();
               int n = first + second;
               stack.push(first);
               stack.push(n);
            }
            else if(ch.equals("D")){
                int n = stack.peek() * 2;
                stack.push(n);
            }
            else if(ch.equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(ch));
            }
        }


        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
        
    }
}