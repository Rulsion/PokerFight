package pokerFight.entity;

/**
 * ΢���û�
 * 
 * @author hzbis
 *
 */
public class User {

	/**
	 * ΢���û�Ψһ��ʶ
	 */
	private static String openId;

	/**
	 * �ǳ�
	 */
	private static String nickName;

	/**
	 * �Ա�
	 */
	private static String gender;

	/**
	 * ͷ��
	 */
	private static String avatarUrl;

	public static String getOpenId() {
		return openId;
	}

	public static void setOpenId(String openId) {
		User.openId = openId;
	}

	public static String getNickName() {
		return nickName;
	}

	public static void setNickName(String nickName) {
		User.nickName = nickName;
	}

	public static String getGender() {
		return gender;
	}

	public static void setGender(String gender) {
		User.gender = gender;
	}

	public static String getAvatarUrl() {
		return avatarUrl;
	}

	public static void setAvatarUrl(String avatarUrl) {
		User.avatarUrl = avatarUrl;
	}

}
