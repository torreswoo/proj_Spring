package com.skplanet.study.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Magician {

	@Autowired
	@Qualifier("magicianFire")  // @Qualifier으로 정할수는 있지만 좀 유연해보이지는 않는다. 
	private MagicSystem magicSystem; // Startegy 패턴을 위해 알고리즘을 위해서 사용하는 
	
	public Magician(){
		
	}
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
