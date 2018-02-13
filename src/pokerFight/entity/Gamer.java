package pokerFight.entity;

/**
 * 玩家（用户-房间关联）
 * 
 * @author hzbis
 *
 */
public class Gamer {
	/**
	 * 微信用户唯一标识
	 */
	private static String openId;

	/**
	 * 房间ID
	 */
	private static String roomId;

	public static String getOpenId() {
		return openId;
	}

	public static void setOpenId(String openId) {
		Gamer.openId = openId;
	}

	public static String getRoomId() {
		return roomId;
	}

	public static void setRoomId(String roomId) {
		Gamer.roomId = roomId;
	}

}
