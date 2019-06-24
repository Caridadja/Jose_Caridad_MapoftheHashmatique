import java.util.HashMap;
import java.util.Set;
public class TrackList{
    public static void trackList(){
        HashMap<String, String> music = new HashMap<String, String>();
        music.put("In Too Deep", "Cause Im in too deep");
        music.put("Out For Blood", "All that we have is just limping away");
        music.put("Underclass Hero", "We are doing fine");
        music.put("The Hell Song", "Everybody says the same things to you");
        Set<String> keys = music.keySet();
        System.out.println("The lyrics for Underclass Hero are: "+music.get("Underclass Hero"));
        for(String key : keys){
        System.out.println(key+": "+music.get(key));
        }
    }
    public static void main(String[] args){
        trackList();
    }
}
