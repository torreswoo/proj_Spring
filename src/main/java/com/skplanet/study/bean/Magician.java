package com.skplanet.study.bean;

public class Magician {

	private MagicSystem magicSystem; // Startegy 패턴을 위해 알고리즘을 위해서 사용하는 
	
	public Magician(MagicSystem magicSystem){
		this.magicSystem = magicSystem;
	}
	
	public void magic(){
		this.magicSystem.magic();
	}
	
	public void changeMagicSystem(MagicSystem magicSystem){
		this.magicSystem = magicSystem;
	}
}
