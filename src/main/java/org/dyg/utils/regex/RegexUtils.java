package org.dyg.utils.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author duyangang
 * @date 2015年5月20日
 * @time 下午3:17:49
 * 
 *       正则表达式
 * 
 */
public class RegexUtils {

	public static void main(String args[]) {

		// 按指定模式在字符串查找
		String line = "abcdefg";
		String pattern = "[a-z]*";

		// 创建 Pattern 对象
		Pattern r = Pattern.compile(pattern);

		// 现在创建 matcher 对象
		Matcher m = r.matcher(line);
		System.out.println(m.matches());
	}
}
