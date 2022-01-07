package regExpPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpUtils {
	/**
	 * 기존 source 수정
	 * @ReferencePage URL 정규 표현식 - https://zetawiki.com/wiki/URL_%EC%A0%95%EA%B7%9C%ED%91%9C%ED%98%84%EC%8B%9D
	 * @ReferencePage https://coding-factory.tistory.com/529
	 * @ReferencePage https://gngsn.tistory.com/54
	 * */
	public static String replaceUrlPatternInHtmlSource(
			String replaceHtmlSrc,
			String replaceUrl,
			String replacePcImg,
			String replaceMobImg) {
		StringBuffer buffer = new StringBuffer();					// RESULT 값을 추가(append)할 StringBuffer (return buffer.toString())
		
		/** url 정규 표현식 */ // URL 감지 기준
		final String REGEX = "https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)";
		
		Pattern pattern = Pattern.compile(REGEX);					// 주어진 정규표현식(REGEX)으로 부터 패턴 생성
		Matcher matcher = pattern.matcher(replaceHtmlSrc);			// 패턴과 대상 문자열(modifySrc)을 비교하기 위한 Matcher 세팅
		
		while(matcher.find()) {										// REGEX에 해당하는 문자열을 찾았다면 TRUE 반환 (= url형태 TEXT가 감지되지 않을 때까지 반복 = url 변환 완료할 때까지 반복)
			String compare = matcher.group();						// matcher.group() -> 감지한 URL TEXT 반환
			if(compare.contains("pcImg")) {							// 1) 기존 소스에서 "pcImg"가 존재할 경우
				matcher.appendReplacement(buffer, replacePcImg);		// -> buffer에 chngPcImg 대체하여 추가
			} else if(compare.contains("mobImg")) {					// 2) 기존 소스에서 "mobImg"가 존재할 경우
				matcher.appendReplacement(buffer, replaceMobImg);	// -> buffer에 chngMobImg 대체하여 추가
			} else if(compare.contains("mid.ebs.co.kr") || compare.contains("primary.ebs.co.kr")) {
				matcher.appendReplacement(buffer, replaceUrl);		// 3) 기존 소스에서 초중학URL이 존재할 경우 -> buffer에 chngUrl 대체하여 추가
			}
		}
		matcher.appendTail(buffer);									// 대체할 필요가 없는 modifySrc의 부분 추가하여 마무리
		
		return buffer.toString();									// 대체 완료한 buffer를 String 형태로 변환하여 return
	}
}
