public class Bio{
    public static void main(String[] args) {
        String name = "Lio";
        int age = 35;
        String country = "Argentina";
        String sport = "soccer";
        int hours = 4;
        String game = "Super Mario";
        String subject = "Math";
        char grade = 'A';
        
        String biography = String.format("My name is %s. I'm %d years old, and I'm from %s.\nMy favourite sport is %s. I play for %d hours a day.\nWhen I'm tired, i like to play %s.\nIn school, my favourite subject was %s, I scored a %s", name, age, country, sport, hours, game, subject, grade); 

        System.out.println(biography);
    }
}