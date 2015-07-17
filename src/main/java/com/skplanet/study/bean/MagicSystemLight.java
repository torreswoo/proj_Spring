package com.skplanet.study.bean;

public class MagicSystemLight implements MagicSystem {

	@Override
	public void magic() {
		System.out.println("Light Ball");
		
	}

	@Override
	public String showMagicName() {
		
		return "Light Ball";
	}

}
