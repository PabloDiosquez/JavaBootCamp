public class WeatherNetwork {
    public static void main(String[] args) {

        // Temperature variable indicating the current temperature in degrees Celsius
        int temp = -12;  
    
        // String variable to store the forecast message
        String forecast = "";
        
        // Check if the temperature is below or equal to -1
        if(temp <= -1){
            // If true, print a freezing forecast and advise to stay home
            System.out.println("The forecast is FREEZING! Stay home!");
            // Assign the forecast message to the variable
            forecast = "FREEZING! Stay home!";
        } 
        // Check if the temperature is less than or equal to 10 (since it has already been checked for <= -1)
        else if(temp <= 10){
            // If true, print a chilly forecast and suggest wearing a coat
            System.out.println("The forecast is Chilly. Wear a coat!");
            // Assign the forecast message to the variable
            forecast = "Chilly. Wear a coat!";
        } 
        // If neither of the above conditions is met, implying the temperature is higher than 10
        else {
            // Print a warm forecast and encourage going outside
            System.out.println("It's warm. Go outside!");
            // Assign the forecast message to the variable
            forecast = "It's warm. Go outside!";
        }
    
        // Print the forecast message (it will be empty if none of the conditions were met)
        System.out.println(forecast);
    }
}
