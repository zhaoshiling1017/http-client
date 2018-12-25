package com.pdd.pop.sdk.common.util;

import com.pdd.pop.sdk.common.constant.Constants;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

/**
 * @author xuanli
 * @Description: 通用加密类
 * @date 2018/12/2 16:13
 */
public class DigestUtil {

	public static String md5Base64Sign32(String plainText) {
		try {
			String md5str = md5(plainText);
			return base64Encode(md5str);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return plainText;
	}

	private static String base64Encode(String message) throws UnsupportedEncodingException {
		if (message == null || message.length() == 0) {
			return "";
		}
		return new String(Base64.encodeToByte(message.getBytes(Constants.CHARSET_UTF8),false));
	}

	public static String md5(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes(Constants.CHARSET_UTF8));
			byte[] result = md.digest();
			StringBuffer sb = new StringBuffer(32);
			for (int i = 0;i < result.length;i++) {
				int val = result[i] & 0xff;
				if (val <= 0xf) {
					sb.append("0");
				}
				sb.append(Integer.toHexString(val));
			}
			return sb.toString();
		} catch (Exception imporsible){
			throw new AssertionError();
		}
	}
}
