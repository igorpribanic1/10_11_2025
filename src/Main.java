public class Main {
    public static void main(String[] args) {

        ispisPozdrava();
        ispis("Pero");
        ispis(22);
        System.out.println(zbroji(2, 3));

        if(isPalindrome("Ana voli Milovana")){
            System.out.println("String je palindrom!");
        } else{
            System.out.println("String nije palindrom.");
        }

    }

    private static void ispisPozdrava(){
        System.out.println("Pozdrav!");
    }

    private static void ispis(String str){
        ispisPozdrava();
        System.out.println("Pozdrav: " + str);
    }

    private static void ispis(int broj){
        System.out.println("Broj: " + broj);
    }

    private static int zbroji(int x, int y){
       int sum = x + y;
       return sum;
    }

    private static boolean isPalindrome(String str){
        String normStr = str.toLowerCase();
        normStr = normStr.replace(" ", "");
        String revStr = "";
        for (int i = normStr.length()-1; i >= 0; i--) {
            revStr += normStr.charAt(i);
        }
        if(normStr.equals(revStr)){
            return true;
        } else{
            return false;
        }
    }
}
