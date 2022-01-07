package regExpPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
	
	String modifySource = "<!--(s) 플로팅 배너 -->\r\n"
			+ "<div class=\"footer_float_bnr_floating_common\">\r\n"
			+ "	   <img src=\"https://cbox.ebs.co.kr/portal/veasd/dasdas.asdasd\"/>\r\n"
			+ "    <div class=\"pc_floating\">\r\n"
			+ "        <img src=\"https://cbox.ebs.co.kr/portal/event/2021/12/30/01/pcImg_ms_banner.png\" alt=\"온라인개학\" width=\"180px\" height=\"194px\" usemap=\"#common_flating\" border=\"0\">\r\n"
			+ "        <map name=\"common_flating\" id=\"common_flating\">\r\n"
			+ "            <area shape=\"rect\" coords=\"164,7,178,23\" href=\"#\" id=\"footer_top_ad_save_cheat2\" class=\"floatingBannerDayHide\" onclick=\"$('.footer_float_bnr_floating_common').fadeOut(); return false;\" alt=\"닫기\" onfocus=\"this.blur()\">\r\n"
			+ "            <area shape=\"rect\" alt=\"온라인 개학\" title=\"온라인 개학\" coords=\"34,180,142,192\" href=\"#\" id=\"footer_top_ad_save_cheat\" class=\"floatingBannerDayHide\" onclick=\"$('.footer_float_bnr_floating_common').fadeOut(); return false;\" onfocus=\"this.blur()\">\r\n"
			+ "            <area shape=\"circle\" alt=\"온라인 개학\" title=\"온라인 개학\" coords=\"90,91,95\" href=\"https://mid.ebs.co.kr/customer/eventCurrentRecomment?bnnrMngId=12047\" target=\"\" onfocus=\"this.blur()\">\r\n"
			+ "        </map>\r\n"
			+ "    </div>\r\n"
			+ "    <div class=\"m_floating\">\r\n"
			+ "        <img src=\"https://cbox.ebs.co.kr/portal/event/2021/12/30/01/mobImg_ms_banner_m.png\" alt=\"온라인개학\" width=\"144px\" height=\"178px\" usemap=\"#common_flating_m\" border=\"0\">\r\n"
			+ "        <map name=\"common_flating_m\" id=\"common_flating_m\">\r\n"
			+ "            <area shape=\"rect\" coords=\"118,6,134,21\" href=\"#\" id=\"footer_top_ad_save_cheat2\" class=\"floatingBannerDayHide\" onclick=\"$('.footer_float_bnr_floating_common').fadeOut(); return false;\" alt=\"닫기\" onfocus=\"this.blur()\">\r\n"
			+ "            <area shape=\"rect\" alt=\"온라인 개학\" title=\"온라인 개학\" coords=\"18,158,125,170\" href=\"#\" id=\"footer_top_ad_save_cheat\" class=\"floatingBannerDayHide\" onclick=\"$('.footer_float_bnr_floating_common').fadeOut(); return false;\" onfocus=\"this.blur()\">\r\n"
			+ "            <area shape=\"circle\" alt=\"온라인 개학\" title=\"온라인 개학\" coords=\"72,79,68\" href=\"https://mid.ebs.co.kr/customer/eventCurrentRecomment?bnnrMngId=12047\" target=\"\" onfocus=\"this.blur()\">\r\n"
			+ "        </map>\r\n"
			+ "    </div>	            \r\n"
			+ "</div>\r\n"
			+ "<!--(e) 플로팅 배너 -->";
	
	public static void main(String[] args) {
		
		// modify 버전
		
		String regex = "https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)";
		
		String source = "<!--(s) 플로팅 배너 -->\r\n"
				+ "<div class=\"footer_float_bnr_floating_common\">\r\n"
				+ "    <div class=\"pc_floating\">\r\n"
				+ "        <img src=\"https://cbox.ebs.co.kr/portal/event/2021/12/30/01/pcImg_ms_banner.png\" alt=\"온라인개학\" width=\"180px\" height=\"194px\" usemap=\"#common_flating\" border=\"0\">\r\n"
				+ "        <map name=\"common_flating\" id=\"common_flating\">\r\n"
				+ "            <area shape=\"rect\" coords=\"164,7,178,23\" href=\"#\" id=\"footer_top_ad_save_cheat2\" class=\"floatingBannerDayHide\" onclick=\"$('.footer_float_bnr_floating_common').fadeOut(); return false;\" alt=\"닫기\" onfocus=\"this.blur()\">\r\n"
				+ "            <area shape=\"rect\" alt=\"온라인 개학\" title=\"온라인 개학\" coords=\"34,180,142,192\" href=\"#\" id=\"footer_top_ad_save_cheat\" class=\"floatingBannerDayHide\" onclick=\"$('.footer_float_bnr_floating_common').fadeOut(); return false;\" onfocus=\"this.blur()\">\r\n"
				+ "            <area shape=\"circle\" alt=\"온라인 개학\" title=\"온라인 개학\" coords=\"90,91,95\" href=\"https://mid.ebs.co.kr/customer/eventCurrentRecomment?bnnrMngId=12047\" target=\"\" onfocus=\"this.blur()\">\r\n"
				+ "        </map>\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"m_floating\">\r\n"
				+ "        <img src=\"https://cbox.ebs.co.kr/portal/event/2021/12/30/01/mobImg_ms_banner_m.png\" alt=\"온라인개학\" width=\"144px\" height=\"178px\" usemap=\"#common_flating_m\" border=\"0\">\r\n"
				+ "        <map name=\"common_flating_m\" id=\"common_flating_m\">\r\n"
				+ "            <area shape=\"rect\" coords=\"118,6,134,21\" href=\"#\" id=\"footer_top_ad_save_cheat2\" class=\"floatingBannerDayHide\" onclick=\"$('.footer_float_bnr_floating_common').fadeOut(); return false;\" alt=\"닫기\" onfocus=\"this.blur()\">\r\n"
				+ "            <area shape=\"rect\" alt=\"온라인 개학\" title=\"온라인 개학\" coords=\"18,158,125,170\" href=\"#\" id=\"footer_top_ad_save_cheat\" class=\"floatingBannerDayHide\" onclick=\"$('.footer_float_bnr_floating_common').fadeOut(); return false;\" onfocus=\"this.blur()\">\r\n"
				+ "            <area shape=\"circle\" alt=\"온라인 개학\" title=\"온라인 개학\" coords=\"72,79,68\" href=\"https://mid.ebs.co.kr/customer/eventCurrentRecomment?bnnrMngId=12047\" target=\"\" onfocus=\"this.blur()\">\r\n"
				+ "        </map>\r\n"
				+ "    </div>	            \r\n"
				+ "</div>\r\n"
				+ "<!--(e) 플로팅 배너 -->";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(source);
		
		String chngUrl = "https://mid.ebs.co.kr/customer/eventCurrentRecomment?bnnrMngId=민형123";
		String chngPcImg = "https://cbox.ebs.co.kr/portal/banner/2022/1/7/pcImg민형123.png";
		String chngMobImg = "https://cbox.ebs.co.kr/portal/banner/2022/1/7/mobImg민형123.png";

		// matcher.replaceFirst("민형")
		// matcher.groupCount() -> return 2
//		System.out.println();
		StringBuffer buffer = new StringBuffer();
		
		//url에 매칭하는 문자열 반환
//		while(matcher.find()) {
//			System.out.println(matcher.group());
//		}
		
//		List<String> matcherGroupList = new ArrayList<>();
		String compare = "";
		while(matcher.find()) {
//			matcherGroupList.add(matcher.group());
			compare = matcher.group();
			if(compare.contains("pcImg")) {
				matcher.appendReplacement(buffer, chngPcImg);
			} else if(compare.contains("mobImg")) {
				matcher.appendReplacement(buffer, chngMobImg);
			} else if(compare.contains("mid.ebs.co.kr")) {
				matcher.appendReplacement(buffer, chngUrl);
			}
		}
		matcher.appendTail(buffer);
		System.out.println(buffer.toString());
		/**
		 * matcherGroupList result : 
		 * 
		>> [0] https://cbox.ebs.co.kr/portal/event/2021/12/30/01/ms_banner.png
		>> [1] https://mid.ebs.co.kr/customer/eventCurrentRecomment?bnnrMngId=12047
		>> [2] https://cbox.ebs.co.kr/portal/event/2021/12/30/01/ms_banner_m.png
		>> [3] https://mid.ebs.co.kr/customer/eventCurrentRecomment?bnnrMngId=12047
		 *
		 * */
		
		/**
		 * 1) replaceAll(모든 url 형식이 바뀜)
		 * 2) replaceFirst 한번 할 시 바뀌어야 할 1번째 URL텍스트 바뀜
		 * 3) 그 상태로 "val"를 저장 후 다시 replaceFirst하면 2번째 URL 텍스트 바뀜
		 * ...
		 * 
		 * matcher에서 count 구할 수 있나?
		 * */
		
		/**
		 * https://cbox.ebs.co.kr/portal/event/2021/12/30/01/ms_banner.png
		 * https://mid.ebs.co.kr/customer/eventCurrentRecomment?bnnrMngId=12047
		 * https://cbox.ebs.co.kr/portal/event/2021/12/30/01/ms_banner_m.png
		 * https://mid.ebs.co.kr/customer/eventCurrentRecomment?bnnrMngId=12047
		 * */
	}
}
