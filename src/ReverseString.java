public class ReverseString {
    String S = "Default";

    ReverseString(String S) {
        this.S = S;
        for (int j = S.length() - 1; j >= 0; j--) {
            char c = S.charAt(j);
        }
        System.out.println("");
    }
     public void display()
     {
         System.out.print(S);
     }

    public static void main(String[] args) {
        ReverseString r1 = new ReverseString("Kalyani");
        ReverseString r2 = new ReverseString("Pritam");
        r1.display();
        r2.display();

    }
}
