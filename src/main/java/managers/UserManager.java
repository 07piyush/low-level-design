package managers;

import java.util.LinkedHashMap;
import java.util.Map;

import entities.User;

public class UserManager {

	private static UserManager manager;
	private Map<Long, User> users;
	
	private UserManager() {
		users = new LinkedHashMap<Long, User>();
	}
	
	public static UserManager getInstance() {
		if(null == manager) {
			synchronized(UserManager.class) {
				if(null == manager) {
					manager = new UserManager();
				}
			}
		}
		return manager;
	}
	
	public void addUser(User user) {
		users.put(user.getUserId(), user);
	}
	
	public void removeUser(User user) {
		users.remove(user.getUserId());
	}
}
