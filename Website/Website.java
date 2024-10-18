import java.io.*;
import java.net.*;

public class Website {


 // Put your code here
    private String domain;
    private String topLevelDomain;
    private long numUsers;
    private GeoLocation geoLocation;

//Default constructor

public Website(){
    domain="google";
    topLevelDomain="com";
    numUsers=4_300_000_000L;
    geoLocation = new GeoLocation(41.2219, 95.8608);
}

// Specify website URL
// Register a new website

public Website(String domainName, String topDomain){
    domain=domainName;
    topLevelDomain=topDomain;
    numUsers=0;
    geoLocation = new GeoLocation(40.935,-74.1176);

}

// Specify website URL
// Register an old website
public Website(String domainName, String topDomain, long numPeople, GeoLocation geo){
    domain=domainName;
    topLevelDomain=topDomain;
    numUsers=numPeople;
    geoLocation = geo;
    
}

    // Method to fetch data 
    public void fetchData(String api)
 {
        String urlString=toString()+ "/"+api;

        try {
            // Create the URL from the provided string
         
            URL url = new URL(urlString);
            
            // Open a connection to the API
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            
            // Read the response and print each line
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;

            System.out.println("Response from the API:");

            // Print each line of the response directly
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   // String representation for printing
    // Do not modify this method
    public String toString()
    {
        
        String res =  "http://" + domain + "." + topLevelDomain;
       // res += " has " + numUsers + " users";
        
        return res;
    }

    public GeoLocation getLocation(){
        return geoLocation;
    }
    
    // Main method to test the API call
    public static void main(String[] args) {
        //never use access modifiers inside methods
        //every variable here is local, use Type only
        
        Website website1= new Website("ap-api", "com");
        website1.fetchData("json");
        System.out.println(website1.getLocation());
        
        Website google = new Website();
        System.out.println(google);
        System.out.println(google.getLocation());
        System.out.println(google.getLocation().getLatitude());

        
        Website amazon = new Website("amazon", "com", 1_000_000L, new GeoLocation(38.9339,77.1773));
        System.out.println(amazon);
                
        Website microsoft = new Website("microsoft", "com", 1_000_000_000L, new GeoLocation(36.6646, 78.3897));
        System.out.println(microsoft);
        
        Website meta = new Website("meta", "com", 3_200_000_000L, new GeoLocation(44.2995,120.8346));
        System.out.println(meta);
        
        System.out.println("Locations");
        System.out.println("My location to Google: " + google.getLocation().distanceFrom(website1.getLocation()) + " miles");
        System.out.println("Google's location to Amazon: " + google.getLocation().distanceFrom(amazon.getLocation()) + " miles");
        System.out.println("Google's location to Microsoft: " + google.getLocation().distanceFrom(microsoft.getLocation()) + " miles");
        System.out.println("Google's location to Meta: " + google.getLocation().distanceFrom(meta.getLocation()) + " miles");
        System.out.println("Meta's location to Amazon: " + meta.getLocation().distanceFrom(amazon.getLocation()) + " miles");
        System.out.println("Meta's location to Microsoft: " + meta.getLocation().distanceFrom(microsoft.getLocation()) + " miles");




        
    }
}





