package com.training.game.service;

import java.util.Random;

public class PlayingCardGameService {
	
	//シャッフルされたトランプ54枚を戻すメソッド
	public String[] CardShuffle() {
		
		//トランプ初期化
		String[] trump = {"H01","H02","H03","H04","H05","H06","H07","H08","H09","H10","H11","H12","H13",
				"D01","D02","D03","D04","D05","D06","D07","D08","D09","D10","D11","D12","D13",
				"C01","C02","C03","C04","C05","C06","C07","C08","C09","C10","C11","C12","C13",
				"S01","S02","S03","S04","S05","S06","S07","S08","S09","S10","S11","S12","S13",
				"JOK","JOK"};
		
		//シャッフル（フィッシャー–イェーツのシャッフルの改良されたバージョン）
		int j = 0;
		String aj = "";
		
		for (int i = 53; i > 0 ; i--) {
			
			//jに0 以上 i 以下のランダムな整数を代入する
			Random random = new Random();
			j = random.nextInt(54);
			
			 //a[j] と a[i]を交換する
			 aj = trump[j];
			 trump[j] = trump[i];
			 trump[i] = aj;
			
		}
		
		return trump;
		
	}
	
}
