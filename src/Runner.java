public class Runner {

    public static void main(String[] args) {
        System.out.println(loneTeen(13, 30));
        System.out.println(loneTeen(13, 19));
        System.out.println(stringSplosion("abc"));
        System.out.println(conCat("crab", "bat"));
        int[] x = {1,3,9,5,7};
        System.out.println(maxTriple(x));
        System.out.println(old35(35));

    }

    public static boolean loneTeen(int a, int b) {
        if((a >= 13 && a <= 19) && (b >= 13 && b <= 19)){
            return false;
        }else if((a >= 13 && a <= 19) || (b >= 13 && b <= 19)){
            return true;
        }
        return false;
    }

    public static String stringSplosion(String str){
        String word = "";
        for (int i = 0; i < str.length(); i++){
            word += str.substring(0,i + 1);
        }
        return word;
    }

    public static String conCat(String a, String b) {
        String result = a + b;
        if(a.equals("") || b.equals("")){
            return result;
        }else if((a.substring(a.length()-1,a.length())).equals(b.substring(0,1))){
            result = a.substring(0, a.length()-1) + b;
        }
        return result;
    }
    public static int maxTriple(int[] nums) {
        int a = nums[0];
        int total = (nums.length/2);
        int b = nums[total];
        int c = nums[nums.length-1];
        if ((a > b) && (a > c)){
            return a;
        }else if ((c > b) && (c > a)){
            return c;
        }else if ((b > c) && (b > a)){
            return b;
        }
        return total;
    }

    public static boolean old35(int n) {
        if ((n % 3 == 0) && (n % 5 == 0) || (n % 3 != 0) && (n % 5 != 0)){
            return false;
        }else if ((n % 3 == 0) || (n % 5 == 0)){
            return true;
        }
        return false;
    }

}
