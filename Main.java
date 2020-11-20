class Main {
  public static void main(String[] args) {
      battleship(2, 2);
  }
  
  public static String battleship(int x, int y)  {
      // Declare and initiallize some of the primary variables
      String text = "What?!?! You hit my battleship! You missed!";
      // prints out basic info about battleship game.
      System.out.println("Welcome to Battleship! This game runs off of a 5 by 5 grid!");
      // set up some of the variables that will be useful later on
      int hitPart1 = text.indexOf("W");
      int hitPart2 = text.indexOf("battleship!");
      String hit = text.substring(hitPart1, hitPart2);
      
      int missPart2 = text.indexOf("missed!");
      String miss = text.substring(hitPart2 + 1, missPart2);
      // checks to make sure neither of the numbers are negative
      if(x <= 0 || y <= 0){
          System.out.println("Out of Bounds.");
          System.out.println("We are readjusting your numbers to work hold on. You can't have negative numbers.");
          while(x <= 0 || y <= 0) {
              x = (int)(Math.random()*5);
              y = (int)(Math.random()*5);
          }
      }
      // starts checking for hits on the ships scattered across the board
      if(x == 1){
          if(y == 5){
              return hit;
          }
      }
      else if(x == 2){
          if(y == 2){
              return hit;
          }
      }
      else if(x == 3){
          if(y == 4){
              return hit;
          }
      }
      else if(x == 4){
          if(y == 1){
              return hit;
          }
      }
      else if(x == 5){
          if(y == 3){
              return hit;
          }
      }
      return miss;
  }
}