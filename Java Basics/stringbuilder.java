public class stringbuilder {
    public static void main(String[] args){
      StringBuilder sb = new StringBuilder("Vishal");
      System.out.println(sb.charAt(0));

      sb.setCharAt(0, 'P');
      System.out.println(sb);

      sb.insert(0,'S');
      System.out.println(sb);

      sb.delete(0,2);
      System.out.println(sb);

      sb.append(" R");
      System.out.println(sb);

      System.out.println(sb.length());

      //reversing
      for (int i=0 ; i<sb.length()/2 ; i++){
        int front = i;
        int back = sb.length() - 1 - i; //5-4-0 = > 4

        char frontChar = sb.charAt(front);
        char backChar = sb.charAt(back);

        sb.setCharAt(front, backChar);
        sb.setCharAt(back, frontChar);


      }
      System.out.println(sb);





    }
}
