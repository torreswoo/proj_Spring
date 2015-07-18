package com.skplanet.study.bean;

import org.springframework.stereotype.Component;

@Component("magicianFire")
public class MagicSystemFire implements MagicSystem {

	@Override
	public void magic() {
		System.out.println("Fire Ball");
		
	}

	@Override
	public String showMagicName() {
		return "Fire Ball";
	}

}
