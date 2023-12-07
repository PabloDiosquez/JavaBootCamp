public class Championship {
    public static void main(String[] args) {

        // If Gryffindor beats Ravenclaw by a margin of 300 points, they win the championship.
        // If they win by any points or tie, they would come in second.
        // If they lose by 100 points or less, they would come in third.
        // If they lose by more than 100 points, they would come in 4th.
    
        int gryffindor = 100;    // Gryffindor's current points
        int ravenclaw = 500;    // Ravenclaw's current points
        
        int margin = gryffindor - ravenclaw;
        // margin = the difference in points by which Gryffindor is ahead or behind Ravenclaw;
    
        // Check the conditions and provide appropriate messages based on the point margin.
        if (margin >= 300) {
            System.out.println("Gryffindor takes the house cup! They win the championship.");
        } else if (margin >= 0) {
            System.out.println("In second place, Gryffindor! They win or tie but fall short of the championship.");
        } else if (margin >= -100) {
            System.out.println("In third place, Gryffindor! They lose, but it's a close match.");
        } else {
            System.out.println("In fourth place, Gryffindor! They lose by more than 100 points.");
        }
    }
}
