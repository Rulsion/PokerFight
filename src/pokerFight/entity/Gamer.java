package pokerFight.entity;

/**
 * ��ң��û�-���������
 * 
 * @author hzbis
 *
 */
public class Gamer {
	/**
	 * ΢���û�Ψһ��ʶ
	 */
	private static String openId;

	/**
	 * ����ID
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
