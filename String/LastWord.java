
class LastWord {
    public int lengthOfLastWord(String s) {
        int result = 0;
        int flag = 0;
        for(int i = s.length() -1; i >= 0;i--){
            if(result == 0 && s.charAt(i) == ' '){
                flag++;
                continue;
            }
            if(s.charAt(i) != ' '){
                result += 1;
            }
            if(result != 0 && s.charAt(i) == ' ') return result;
        }
        return result;
    }

    public static void main(String args[]){
        LastWord obj = new LastWord();

        String str = "luffy is still joyboy";

        System.out.println(obj.lengthOfLastWord(str));
    }
}
