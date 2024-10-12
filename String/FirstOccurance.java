public class FirstOccurance {
    
    public int strStr(String haystack, String needle) {
        StringBuilder str = new StringBuilder();

        int left = 0, right = 0,index = 0;
        int needleLength = needle.length();

        for(int i = 0; i < haystack.length(); i++){
            if(str.length() < needleLength){
                str = str.append(haystack.charAt(i));
            }
            else{
                str = str.deleteCharAt(0);
                str = str.append(haystack.charAt(i));
            }
            if(needle.equals(str.toString())){;
                return (i - needleLength+1);
            }
        }

        return -1;
    }

    public static void main(String args[]){
        FirstOccurance obj = new FirstOccurance();

        int result = obj.strStr("sadbutsad", "sad");

        System.out.println(result);
    }
}

