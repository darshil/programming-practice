public class MethodsTwo{
    
    
   public static void main (String[] args){
     
     int highScore = calculateScore(true, 800, 5, 100);
     System.out.println("Your final score was " + highScore);
      int highScore2 = calculateScore(true, 10000, 8, 200);
      System.out.println("Your final score was " + highScore2);
    
   }
    
   public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
      
      if(gameOver){
         int finalScore = score + (levelCompleted * bonus);
         finalScore +=1000;
         return finalScore;
      }
      return 0;
     
   }

}  