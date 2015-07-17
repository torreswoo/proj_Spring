package com.skplanet.study.bean;

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
