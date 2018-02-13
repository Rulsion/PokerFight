package pokerFight.entity;

/**
 * 游戏房间
 * 
 * @author hzbis
 *
 */
public class GameRoom {

	/**
	 * 房间ID
	 */
	private static String roomId;

	/**
	 * 房间状态
	 */
	private static String state;

	public static String getRoomId() {
		return roomId;
	}

	public static void setRoomId(String roomId) {
		GameRoom.roomId = roomId;
	}

	public static String getState() {
		return state;
	}

	public static void setState(String state) {
		GameRoom.state = state;
	}

}
