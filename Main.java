public class Main {
    public static void main(String[] args) {
        // Test case 1: Basic functionality
        System.out.println("Test case 1: Basic functionality");
        Scoreboard game = new Scoreboard("Red", "Blue");
        
        System.out.println(game.getScore());  // Should print: 0-0-Red
        
        game.recordPlay(1);
        System.out.println(game.getScore());  // Should print: 1-0-Red
        
        game.recordPlay(0);
        System.out.println(game.getScore());  // Should print: 1-0-Blue
        
        System.out.println(game.getScore());  // Should print: 1-0-Blue (unchanged)
        
        game.recordPlay(3);
        System.out.println(game.getScore());  // Should print: 1-3-Blue
        
        game.recordPlay(1);
        game.recordPlay(0);
        System.out.println(game.getScore());  // Should print: 1-4-Red
        
        game.recordPlay(0);
        game.recordPlay(4);
        game.recordPlay(0);
        System.out.println(game.getScore());  // Should print: 1-8-Red

        // Test case 2: New independent Scoreboard
        System.out.println("\nTest case 2: New independent Scoreboard");
        Scoreboard match = new Scoreboard("Lions", "Tigers");
        System.out.println(match.getScore());  // Should print: 0-0-Lions
        System.out.println(game.getScore());   // Should print: 1-8-Red (unchanged)

        // Test case 3: Multiple plays in a single turn
        System.out.println("\nTest case 3: Multiple plays in a single turn");
        match.recordPlay(2);
        match.recordPlay(3);
        match.recordPlay(1);
        System.out.println(match.getScore());  // Should print: 6-0-Lions

        // Test case 4: Switching turns multiple times
        System.out.println("\nTest case 4: Switching turns multiple times");
        match.recordPlay(0);  // Switch to Tigers
        match.recordPlay(5);
        match.recordPlay(0);  // Switch to Lions
        match.recordPlay(0);  // Switch to Tigers
        match.recordPlay(2);
        System.out.println(match.getScore());  // Should print: 6-7-Tigers

        // Test case 5: Large scores
        System.out.println("\nTest case 5: Large scores");
        Scoreboard bigScore = new Scoreboard("Team A", "Team B");
        for (int i = 0; i < 100; i++) {
            bigScore.recordPlay(10);
        }
        bigScore.recordPlay(0);
        bigScore.recordPlay(1000);
        System.out.println(bigScore.getScore());  // Should print: 1000-1000-Team B
    }
}