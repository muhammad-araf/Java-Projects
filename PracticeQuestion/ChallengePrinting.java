public class ChallengePrinting{
    public static void main(String[] args) {
        String hell = "hello world";
        for (int i = 0;i<hell.length();i++){
            for(char c = 'a';c<='z';c++){
                for(int j = -1;j<i;j++){
                    if (j == -1){
                        continue;
                    }
                    System.out.print(hell.charAt(j));
                }
                System.out.println(c);
                if (hell.charAt(i) == c){
                    break;
                    
                }
            }
        }
    }
}
