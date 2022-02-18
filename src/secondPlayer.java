
public class secondPlayer extends firstPlayer {
	
	private int health;
	private boolean armour;
	
	public secondPlayer(String name, String weapon, int health, boolean armour) {
		super(name, weapon, health);
		this.health=health;
		this.armour=armour;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void hitByGun1() {
		// TODO Auto-generated method stub
		if(armour)
		{
			this.health-=20;
			if(this.health<=0) this.health=0;
			System.out.println("Armour is on. Got hit by player 1. Health is reduced by 20."+ "New health is" + this.health);
		}
		
		if(!armour)
		{
			this.health-=30;
			if(this.health<=0) this.health=0;
			System.out.println("Armour is off. Got hit by player 1. Health is reduced by 30."+ "New health is" + this.health);
		}
		
		if(this.health==0)
		{
			System.out.println(getName()+" is dead");
		}
	}


	@Override
	public void hitByGun2() {
		// TODO Auto-generated method stub
		if(armour)
		{
			this.health-=40;
			if(this.health<=0) this.health=0;
			System.out.println("Armour is on. Got hit by player 1. Health is reduced by 40."+ "New health is" + this.health);
		}
		
		if(!armour)
		{
			this.health-=50;
			if(this.health<=0) this.health=0;
			System.out.println("Armour is off. Got hit by player 1. Health is reduced by 50."+ "New health is" + this.health);
		}
		
		if(this.health==0)
		{
			System.out.println(getName()+" is dead");
		}
	}


	@Override
	public void healthPack() {
		// TODO Auto-generated method stub
		super.healthPack();
	}
	
	
	
	
	
	

}
