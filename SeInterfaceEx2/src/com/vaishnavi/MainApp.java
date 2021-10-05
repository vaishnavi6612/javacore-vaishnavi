package com.vaishnavi;

import java.util.HashSet;
import java.util.Set;

import com.vaishnavi.examples.Player;

public class MainApp {

	public static void main(String []args)
	{
		Set <Player>players=new HashSet();
		
		players.add(new Player());
		players.add(new Player(101,"Yuvraj",90));
		players.add(new Player(102,"Virat",100));
		players.add(new Player(103,"Sachin",99));
		
		System.out.println("Using toString");
		System.out.println(players);
		
		System.out.println("Using Enhanced Loop");
		for(Player p:players)
		{
			System.out.println(p);
		}



	}

}
