//Crawler folder log leetcode-1598
public class CrawlerLogFolder {
   public int minOperations(String[] logs) {
        int minNumOps = 0;
        for(String log : logs){
            if(log.equals("../")){
                if(minNumOps > 0){
                    minNumOps--;
                }
            }
            else if(!log.equals("./")){
                minNumOps++;
            }
        } 
        return minNumOps;
    }
    public static void main(String args[]){
        String[] arr = {"d1/","d2/","./","d3/","../","d31/"};

        CrawlerLogFolder obj = new CrawlerLogFolder();

        System.out.println(obj.minOperations(arr));
    }
}