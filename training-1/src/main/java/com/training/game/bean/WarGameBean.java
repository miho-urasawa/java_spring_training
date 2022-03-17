package com.training.game.bean;

public class WarGameBean {

	//自分の手札
	private String[] myCard;
	
	//コンピューターの手札
	private String[] cpCard;

	//自分の点数
	private int myPoint;

	//コンピューターの点数
	private int cpPoint;

	//自分の手札を回答
	public String[] getMyCard() {
		return myCard;
	}

	//自分の手札をセット
	public void setMyCard(String[] myCard) {
		this.myCard = myCard;
	}
	
	//コンピューターの手札を回答
	public String[] getCpCard() {
		return cpCard;
	}

	//コンピューターの手札を回答
	public void setCpCard(String[] cpCard) {
		this.cpCard = cpCard;
	}

	//自分の点数を回答
	public int getMyPoint() {
		return myPoint;
	}

	//自分の点数をセット
	public void setMyPoint(int myPoint) {
		this.myPoint = myPoint;
	}

	//コンピューターの点数を回答
	public int getCpPoint() {
		return cpPoint;
	}

	//コンピューターの点数をセット
	public void setCpPoint(int cpPoint) {
		this.cpPoint = cpPoint;
	}
	
	
	
}
