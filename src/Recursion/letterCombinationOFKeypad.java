package Recursion;

public class letterCombinationOFKeypad {

    static void keyPadCombination(String dig,String [] kp,String result){
        if(dig.length()==0){
            System.out.println(result+" ");
            return;
        }
        int currNum=dig.charAt(0)-'0';  // character to integer conversion via ASCII using subtracting '0'
        String currChoices = kp[currNum];

        for(int i=0;i<currChoices.length();i++){
            keyPadCombination(dig.substring(1),kp,result+currChoices.charAt(i));
        }

    }
    public static void main(String[] args) {
        String [] kp={"", "", "abc","def","ghi","jkl","mno","pqrs","tuv", "wxyz"};
        keyPadCombination("233",kp," ");
    }
}
