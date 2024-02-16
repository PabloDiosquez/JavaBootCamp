public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        switch (weather) {
            case "sunny":
                System.out.println("You can wear a shirt."); 
                break;
            case "cloudy":
                System.out.println("You should wear a sweater."); 
                break;
            case "rainy":
                System.out.println("You should wear a raincoat"); 
                break;
            case "snowy":
                System.out.println("You should wear a jacket."); 
                break;
            default:
                System.out.println("You can wear whatever you want."); 
                break;
        }
    
        // Section 2: User role
        int role = 2;
        switch (role) {
            case 1:
                System.out.println("You are an admin"); 
                break;
            case 2:
                System.out.println("You are an editor"); 
                break;
            case 3:
                System.out.println("You are a user"); 
                break;
            default:
                System.out.println("Please contact HR"); 
                break;
        }
    
        // Section 1: Traffic light colors
        String lightColor = "green";
        switch (lightColor) {
            case "🟢":
                System.out.println("Move on!"); 
                break;
            case "🟡":
                System.out.println("Slow down..."); 
                break;   
            case "🔴":
                System.out.println("Stop!"); 
                break;
        }
    
        // Section 2: Exam grade
        int grade = 85;
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        char letterGrade;
    
        if (grade >= 90) {
            letterGrade = 'A';
        } else if (grade >= 80) {
            letterGrade = 'B';
        } else if (grade >= 70) {
            letterGrade = 'C';
        } else if (grade >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
    
        System.out.println("Your grade is: " + letterGrade);
    
        // Section 3: Browser type
        String browser = "Chrome";
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        switch (browser.toLowerCase()) {
            case "chrome":
                System.out.println("You are using Chrome."); 
                break;
            case "firefox":
                System.out.println("You are using Firefox."); 
                break;
            case "safari":
                System.out.println("You are using Safari."); 
                break;
            case "edge":
                System.out.println("You are using Edge."); 
                break;
            case "opera":
                System.out.println("You are using Opera."); 
                break;
            default:
                System.out.println("Unsupported browser."); 
                break;
        }
    }
}
