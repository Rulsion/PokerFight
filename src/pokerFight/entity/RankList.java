package pokerFight.entity;

public class RankList {
	
	/**
	 * 房间ID
	 */
	private static String roomId;
	
	/**
	 * 微信用户唯一标识
	 */
	private static String openId;
	
	/**
	 * 摸到扑克
	 */
	private static String poker;
	
	/**
	 * 游戏时间
	 */
	private static String gameDate;

	public static String getRoomId() {
		return roomId;
	}

	public static void setRoomId(String roomId) {
		RankList.roomId = roomId;
	}

	public static String getOpenId() {
		return openId;
	}

	public static void setOpenId(String openId) {
		RankList.openId = openId;
	}

	public static String getPoker() {
		return poker;
	}

	public static void setPoker(String poker) {
		RankList.poker = poker;
	}

	public static String getGameDate() {
		return gameDate;
	}

	public static void setGameDate(String gameDate) {
		RankList.gameDate = gameDate;
	}
}
