package designpatternexample.Behavioural;

import java.util.HashMap;
import java.util.Map;
 
public class Chatroom implements ChatRoomInterface {
 
    private Map<String, User> usersMap = new HashMap<String,User>();
 
    
    public void sendMessage(String msg, String userId) 
    {
        User u = usersMap.get(userId);
        u.receive(msg);
    }
 
   
    public void addUser(User user) {
        this.usersMap.put(user.getId(), user);
    }
}
