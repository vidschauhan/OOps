package com.object.classes;

public class AbstractExample {

	public static void main(String[] args) {
	
		Badminton bt = new Badminton(2, "Awesome", "China", 2);
		bt.gameDuration();
		bt.tooString();
		
		Cricket ct = new Cricket(11, "Awesome",10);
		ct.gameDuration();
		ct.tooString();
		
		Football ft = new Football(11, "Awesome",3);
		ft.gameDuration();
		ft.tooString();
		
		ft.concrete();
		
		

	}

}

abstract class Sports{

	int playerNum;
	String game;
	
	public Sports(int playerNum,String game) {
		this.playerNum=playerNum;
		this.game=game;
	}
	
	abstract void gameDuration();
	abstract void tooString();
	
	/*Concrete method of Abstract Class*/
	public void concrete() {
		System.out.println("Concrete method of abstract class");
	}
}

class Badminton extends Sports {

	String country;
	int time;
	public Badminton(int playerNum, String game,String country,int time) {
		/*Initializing the Super class constructor by calling super as Abstract class can't be instantiated directly.*/		
		super(playerNum, game);
		this.country= country;
		this.time=time;
	}

	@Override
	void gameDuration() {
		 System.out.println("Time duration is" + time +"hr");
		
	}

	@Override
	public void tooString() {
		System.out.println("Player" + super.playerNum);
	}
	
}

class Cricket extends Sports {

	int time;
	public Cricket(int playerNum, String game,int time) {
		super(playerNum, game);
		this.time = time;
	}

	@Override
	void gameDuration() {
		System.out.println("Time duration is" + time +"hr");
		
	}

	@Override
	public void tooString() {
		System.out.println("Player" + super.playerNum);
	}
	
}

class Football extends Sports {

	int time;
	public Football(int playerNum, String game,int time) {
		super(playerNum, game);
		this.time=time;
	}

	@Override
	void gameDuration() {
		System.out.println("Time duration is" + time +"hr");
		
	}

	@Override
	public void tooString() {
		System.out.println("Player" + super.playerNum);
	
	}
	
}
