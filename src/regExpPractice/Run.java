package regExpPractice;

public class Run {

	public static void main(String[] args) {
		
		String modifySource = "<!--(s) 플로팅 배너 -->\r\n"
				+ "<div class=\"footer_float_bnr_floating_common\">\r\n"
				+ "    <div class=\"pc_floating\">\r\n"
				+ "        <img src=\'\' alt=\"\" width=\"180px\" height=\"194px\" usemap=\"#common_flating\" border=\"0\">\r\n"
				+ "        <map name=\"common_flating\" id=\"common_flating\">\r\n"
				+ "            <area href=\"#\" shape=\"rect\" coords=\"164,7,178,23\" id=\"footer_top_ad_save_cheat2\" class=\"floatingBannerDayHide\" onclick=\"$('.footer_float_bnr_floating_common').fadeOut(); return false;\" alt=\"닫기\" onfocus=\"this.blur()\">\r\n"
				+ "            <area href=\"#\" shape=\"rect\" alt=\"\" title=\"\" coords=\"34,180,142,192\" id=\"footer_top_ad_save_cheat\" class=\"floatingBannerDayHide\" onclick=\"$('.footer_float_bnr_floating_common').fadeOut(); return false;\" onfocus=\"this.blur()\">\r\n"
				+ "            <area href=\"\" shape=\"circle\" alt=\"\" title=\"\" coords=\"90,91,95\" target=\"\" onfocus=\"this.blur()\">\r\n"
				+ "        </map>\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"m_floating\">\r\n"
				+ "        <img src=\"\" alt=\"\" width=\"144px\" height=\"178px\" usemap=\"#common_flating_m\" border=\"0\">\r\n"
				+ "        <map name=\"common_flating_m\" id=\"common_flating_m\">\r\n"
				+ "            <area href=\"#\" shape=\"rect\" coords=\"118,6,134,21\" id=\"footer_top_ad_save_cheat2\" class=\"floatingBannerDayHide\" onclick=\"$('.footer_float_bnr_floating_common').fadeOut(); return false;\" alt=\"닫기\" onfocus=\"this.blur()\">\r\n"
				+ "            <area href=\"#\" shape=\"rect\" alt=\"\" title=\"\" coords=\"18,158,125,170\" id=\"footer_top_ad_save_cheat\" class=\"floatingBannerDayHide\" onclick=\"$('.footer_float_bnr_floating_common').fadeOut(); return false;\" onfocus=\"this.blur()\">\r\n"
				+ "            <area href=\'\' shape=\"circle\" alt=\"\" title=\"\" coords=\"72,79,68\" target=\"\" onfocus=\"this.blur()\">\r\n"
				+ "        </map>\r\n"
				+ "    </div>	            \r\n"
				+ "</div>\r\n"
				+ "<!--(e) 플로팅 배너 -->";
		String url = "https://primary.ebs.co.kr/customer/민형1234!!!!@#!";
		String pc = "https://cbox.ebs.co.kr/portal/pcImgasdasd123123.png";
		String mob = "https://cbox.ebs.co.kr/portal/mobImgasdasd123123.png";
		
//		String src = RegExpUtils.replaceUrlPatternInHtmlSource(modifySource, url, pc, mob);
		String src = RegExpUtils.insertUrlPatternInHtmlSource(modifySource, url, pc, mob);
		
		System.out.println(src);
	}

}
