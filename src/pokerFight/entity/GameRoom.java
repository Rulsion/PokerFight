package pokerFight.entity;

/**
 * ��Ϸ����
 * 
 * @author hzbis
 *
 */
public class GameRoom {

	/**
	 * ����ID
	 */
	private static String roomId;

	/**
	 * ����״̬
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
