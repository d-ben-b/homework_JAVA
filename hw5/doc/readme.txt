(1)作者：電機工程系 乙班 E24094059 阮紹銘
(2)程式檔案名稱：hw5
(3)使用說明：程式開始時請兩位玩家分別輸入名字和學院，輸入完後即可開始遊玩，其中包含各種攻擊和防禦魔法可供玩家使用，也有隨機事件可增添遊玩時的樂趣。
			這次新增了4個指令，提供讀檔存檔功能，和道具的使用。
			在此列舉各項魔法以利玩家使用：“attack 咒語名稱”，如: “attack Stupefy” 、 “learn 咒語名稱”，如: ”learn Stupefy”  、 “recover” " 、 “game over”
			學院的選項：Griffendor、Hufflepuff、Ravenclaw、Slytherin
			可使用的魔法：Serpensortia、Stupefy、Impedimenta、Protego
			
咒語 Serpensortia 習得條件 智力 10
學習效果 智力 +2、咒語熟練度 +10%
初始咒語熟練度 70%

咒語 Stupefy 習得條件 智力 20
學習效果 智力 +3、咒語熟練度 +10%
初始咒語熟練度 40%

咒語 Impedimenta 習得條件 智力 15
學習效果 智力 +2、咒語熟練度 +20%
初始咒語熟練度 60%

咒語 Protego 習得條件 智力 25
學習效果 智力 +3、咒語熟練度 +8%
特殊效果 被攻擊者進入流血狀態，下回合開始，每回合體力-10，持續 2 回合
初始咒語熟練度 30%

咒語 Spectumsempra 習得條件 智力 35
學習效果 智力 +4、咒語熟練度 +5%
初始咒語熟練度 30%

咒語 Expecto Patronum 習得條件 智力 35
防禦計算 完全抵抗來自食死人的攻擊，但對一般攻擊型咒語無效。

咒語 Wingardium Leviosa 習得條件 智力 25
特殊效果 敵方飛起來，下回合敵方無法使用任何咒語(包含防禦型咒語

咒語 Tarantallegra 習得條件 智力 35 
特殊效果 敵方開始亂跳，下回合敵方無法採取任何行動

學院名稱  Griffendor Hufflepuff Ravenclaw Slytherin
體力(上限)  150			120		 100 		100
智力 		12 			12		 15 		10
魔法天賦	30% 		35% 	 30%		40%

新增道具

咆哮信 (Howler)
若自身累積傷害 60 以上時，才可使用。使用後使對手進入燃燒狀態，持續三回合，每回合
損失血量 10。

福來福喜 (Felix Felicis)
下回合開始學習效果加倍，效果持續三回合 (透過學習的咒語熟練度最高達到 100%)
舉例來說： 若 A 玩家此回合使用福來福喜，下回合學習 Stupefy，則該次學習效果智力
+6、咒語熟練度+20%。(道具效果不適用在初次學習的咒語上)