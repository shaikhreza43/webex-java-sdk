package com.ciscospark.main;

import com.ciscospark.*;
import java.net.URI;

public class WebExApp {
	
	public static void main(String[] args) {
	    // To obtain a developer access token, visit http://developer.webex.com
	    String accessToken = "Mzc2OGM1M2UtYTM0ZC00MzFlLWE1NGYtZGY2MGYyMDEzY2JjNmJmMDY0YzktN2Ni_P0A1_fff8f2b4-6d3d-477f-882d-6fee59a6f298";
	    
	 // Initialize the client
	    Spark spark = Spark.builder()
	      .baseUrl(URI.create("https://webexapis.com/v1"))
	      .accessToken(accessToken)
	      .build();
	    
	    
//	 // Create a new room
//	    Room room = new Room();
//	    room.setTitle("Hello World");
//	    room = spark.rooms().post(room);
//	    
//	 // Post a text message to the room
//	    Message message = new Message();
//	    message.setRoomId(room.getId());
//	    message.setText("Hello World!");
//	    spark.messages().post(message);
	    
	 // List my rooms
	    spark.rooms()
	            .iterate()
	            .forEachRemaining(room -> {
	                System.out.println(room.getTitle() + ", created " + room.getCreated() + ": " + room.getId());
	            });
	    
	    
//	 // Create a new team
//	    Team team = new Team();
//	    team.setName("Brand New Team");
//	    team = spark.teams().post(team);

//	    // Add a coworker to the team
//	    TeamMembership teamMembership = new TeamMembership();
//	    teamMembership.setTeamId(team.getId());
//	    teamMembership.setPersonEmail("reza.rk786@gmail.com");
//	    spark.teamMemberships().post(teamMembership);
//
//	    // List the members of the team
//	    spark.teamMemberships()
//	            .queryParam("teamId", team.getId())
//	            .iterate()
//	            .forEachRemaining(member -> {
//	                System.out.println(member.getPersonEmail());
//	            });

	}
}
