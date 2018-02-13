package pokerFight.entity;

/**
 * 微信用户
 * 
 * @author hzbis
 *
 */
public class User {

	/**
	 * 微信用户唯一标识
	 */
	private static String openId;

	/**
	 * 昵称
	 */
	private static String nickName;

	/**
	 * 性别
	 */
	private static String gender;

	/**
	 * 头像
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
