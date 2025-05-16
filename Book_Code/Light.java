package Book_Code;

public class Light {
    public static void main(String[] args){
        int lightspeed;
        long days;
        long seconds;
        long distance;
        lightspeed = 186000; //miles per second
        days = 1000; //days
        seconds = days * 24 * 60 * 60; //seconds
        distance = lightspeed * seconds; //distance in miles
        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.print(distance);
        System.out.println(" miles.");
    }
    
    
}
