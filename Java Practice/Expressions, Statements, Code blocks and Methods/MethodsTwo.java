public class MethodsTwo{
    
    
    // CHALLENGE //
     
    
   public static void main (String[] args){
     
  int position = calculateHighScorePosition(1500);
    displayHighScorePosition("Darshil ", position);
    
     position = calculateHighScorePosition(900);
    displayHighScorePosition("Tim Cook ", position);
    
     position = calculateHighScorePosition(400);
    displayHighScorePosition("Steve Jobs ", position);
    
     position = calculateHighScorePosition(50);
    displayHighScorePosition("ANDROID 6.0 ", position);
    
    position = calculateHighScorePosition(1000);
    displayHighScorePosition("Windows 10", position);
    
   }
   
   public static void displayHighScorePosition( String playerName, int position){
      System.out.println(playerName + " managed to get into position " + position + " on the highscore table");
   }
   
   public static int calculateHighScorePosition(int playerScore){
      if (playerScore >= 1000){
          return 1;
      }else if(playerScore >= 500 && playerScore < 1000){
          return 2;
      }else if (playerScore >= 100 && playerScore < 500 ){
          return 3;
      }else {
           return 4;
      }
   }
    
  
}  