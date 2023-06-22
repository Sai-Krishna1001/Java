package com.java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StreamMapCollectExample {

	public static void main(String[] args) {
		
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "Suresh", "secrete", "suresh@gmail.com"));
		users.add(new User(2, "Mahesh", "secrete", "mahesh@gmail.com"));
		users.add(new User(3, "Ramesh", "secrete", "ramesh@gmail.com"));
		users.add(new User(4, "Rajesh", "secrete", "rajesh@gmail.com"));
		
		List<UserDTO> usersDTO = new ArrayList<UserDTO>();
		for (User user : users) {
			usersDTO.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));
		}
		for (UserDTO userDTO : usersDTO) {
			System.out.println(userDTO);
		}
		System.out.println("==================================================================");
		
		//using stream().map()
		users.stream().map(new Function<User, UserDTO>() {

			@Override
			public UserDTO apply(User user) {
				
				return new UserDTO(user.getId(), user.getUserName(), user.getEmail());
			}
		});
		for (UserDTO userDTO : usersDTO) {
			System.out.println(userDTO);
		}
		System.out.println("==================================================================");
		
		//using stream().map() + lambda expression
		users.stream().map((User user) -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
			.forEach((userDTO) -> {
				System.out.println(userDTO);
			});
		
		
	}

}
