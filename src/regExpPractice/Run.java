package regExpPractice;

public class Run {

	public static void main(String[] args) {
		
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
		String url = "https://primary.ebs.co.kr/민형짱짱123?123?!@#";
		String pc = "https://cbox.ebs.co.kr/portal/pcImgasdasd123123.png";
		String mob = "https://cbox.ebs.co.kr/portal/mobImgasdasd123123.png";
		
		String src = RegExpUtils.replaceUrlPatternInHtmlSource(modifySource, url, pc, mob);
		
		System.out.println(src);
	}

}
