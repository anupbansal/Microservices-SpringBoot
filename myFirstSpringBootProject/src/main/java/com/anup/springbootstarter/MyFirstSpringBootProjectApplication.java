package com.anup.springbootstarter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringBootProjectApplication {
	
	@Autowired
	private TeamRepository teamRepository;

	@PostConstruct
	public void init() {
		  	List<Team> list = new ArrayList<>();
		  	
		  	Set<Player> ajaxPlayers = new HashSet<>();
		  	ajaxPlayers.add(new Player("Big Easy", "Keeper"));
		  	ajaxPlayers.add(new Player("Buckets", "Back"));
		  	ajaxPlayers.add(new Player("Dizzy", "Captain"));

			Team team = new Team();
		  	team.setLocation("Madrid");
		  	team.setName("Real Madrid");
		  	list.add(team);
		  	
		  	team = new Team();
		  	team.setLocation("Barcelona");
		  	team.setName("FCB");
		  	list.add(team);
		  	
		  	team = new Team();
		  	team.setLocation("Amsterdam");
		  	team.setName("Ajax");
		  	team.setPlayers(ajaxPlayers);
		  	list.add(team);
		  	
		  	teamRepository.save(list);
		  } 

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringBootProjectApplication.class, args);
	}
}
