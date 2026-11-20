package Collections_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShallowImmutabilityDemo {
	// Mutable element class
	static class User {
		private String role;

		User(String role) {
			this.role = role;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		@Override
		public String toString() {
			return "User{role='" + role + "'}";
		}
	}

	public static void main(String[] args){
		User alice = new User("VIEWER");
		List<User> backing = new ArrayList<>();
		backing.add(alice);

		List<User> readOnlyUsers = Collections.unmodifiableList(backing);
		//readOnlyUsers.add(new User("ADMIN"));
		//readOnlyUsers.remove(0);
		//readOnlyUsers.set(0, new User("Admin"));
		System.out.println("Before mutating elements: " + readOnlyUsers);

		readOnlyUsers.get(0).setRole("ADMIN");

		System.out.println("After mutation elements: " + readOnlyUsers);


	}

}
