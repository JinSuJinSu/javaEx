package com.javaex.api.objectclass.v4;

import java.util.Arrays;

//	v4. ���� ����
//	���� ���� : �ʵ� ���� ���� -> ���� Ÿ�� �ʵ�� �ּҰ� ����
//		���� Ÿ���� �ʵ�� ���� ��ü�� �����ϰ� �ȴ�
//	���� ���� : ���ο� �ִ� ���� �ʵ嵵 ���� ���ο� �ּҸ� �����ؾ� �Ѵ�
//		Object ��ü�� clone �޼��带 Override
public class Scoreboard implements Cloneable {
	private int scores[];	//	���� Ÿ�� �ʵ�

	public Scoreboard(int[] scores) {
		this.scores = scores;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		//	1. ���� ���� ������ �õ�
		Scoreboard clone = (Scoreboard)super.clone();
		//	2. ������ ���� ��ü ����, ���� �Ҵ�
		clone.scores = Arrays.copyOf(scores, scores.length);

		return clone;
	}


	public Scoreboard getClone() {
		Scoreboard clone = null;

		try {
			clone = (Scoreboard)clone();	//	����
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}	
}