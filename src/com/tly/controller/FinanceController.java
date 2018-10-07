package com.tly.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tly.model.Finance;
import com.tly.service.IFinanceService;
import com.tly.util.ProductUtil;
import com.tly.util.RoleUtil;
import com.tly.util.YesOrNo;

/**
 * 财务管理
 * @ClassName FinanceController
 * @Author yangweihang
 * @Date 2018年8月26日 下午10:16:31
 */
@Controller
@RequestMapping("/finance")
public class FinanceController {
	
	@Autowired
	private IFinanceService ifs;
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 查询钱包明细
	 * yangweihang
	 * @Date 2018年8月26日 下午10:18:01
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/selectbyfinance")
	public String selectByFinance(String wxid){
		List<Map<String, Object>> list = ifs.selectByFinance(wxid);
		for(Map<String,Object> m : list){
			if(m.get("level") != null){
				m.replace("level", RoleUtil.memberlevel((int)m.get("level")));
			}
			if(m.get("identity") != null){
				m.replace("identity", RoleUtil.partnerlevel((int)m.get("identity")));
			}
		}
		request.setAttribute("list", list);
		return "finance/manage";
	}
	
	/**
	 * 查询下线明细
	 * yangweihang
	 * @Date 2018年8月26日 下午11:04:19
	 * @param str
	 * @return
	 */
	@RequestMapping("/selectByUp")
	public String selectByUp(String str){
		Map<String,Object> map = new HashMap<String,Object>();
		if(str.equals("xfonewxid")){
			map.put("xfonewxid", 1);
		}else if(str.equals("xftwowxid")){
			map.put("xftwowxid", 1);
		}else if(str.equals("zyonewxid")){
			map.put("zyonewxid", 1);
		}else if(str.equals("zytwowxid")){
			map.put("zytwowxid", 1);
		}else if(str.equals("gmonewxid")){
			map.put("gmonewxid", 1);
		}else if(str.equals("gmtwowxid")){
			map.put("gmtwowxid", 1);
		}
		List<Finance> list = ifs.selectByUp(map);
		for(Finance f : list){
			if(str.equals("xfonewxid")){
				f.setStrwxid(f.getXfonewxid());
				f.setStrmoney(f.getXfonemoney());
				f.setStrtime(f.getTime());
			}else if(str.equals("xftwowxid")){
				f.setStrwxid(f.getXftwowxid());
				f.setStrmoney(f.getXftwomoney());
				f.setStrtime(f.getTime());
			}else if(str.equals("zyonewxid")){
				f.setStrwxid(f.getZyonewxid());
				f.setStrmoney(f.getZyonemoney());
				f.setStrtime(f.getTime());
			}else if(str.equals("zytwowxid")){
				f.setStrwxid(f.getZytwowxid());
				f.setStrmoney(f.getZytwomoney());
				f.setStrtime(f.getTime());
			}else if(str.equals("gmonewxid")){
				f.setStrwxid(f.getGmonewxid());
				f.setStrmoney(f.getGmonemoney());
				f.setStrtime(f.getTime());
			}else if(str.equals("gmtwowxid")){
				f.setStrwxid(f.getGmtwowxid());
				f.setStrmoney(f.getGmtwomoney());
				f.setStrtime(f.getTime());
			}
		}
		request.setAttribute("list", list);
		return "finance/upmanage";
	}
	
	/**
	 * 查询平台收益
	 * yangweihang
	 * @Date 2018年8月27日 上午3:18:55
	 * @param str
	 * @return
	 */
	@RequestMapping("/platformincome")
	public String platformincome(String str){
		List<Map<String, Object>> list = null;
		if(str.equals("rb")){
			list = ifs.selectrb();
		}else if(str.equals("zb")){
			list = ifs.selectzb();
		}else if(str.equals("jb")){
			list = ifs.selectjb();
		}else if(str.equals("yb")){
			list = ifs.selectyb();
		}else if(str.equals("bnb")){
			list = ifs.selectbnb();
		}else if(str.equals("nb")){
			list = ifs.selectnb();
		}
		request.setAttribute("list", list);
		return "finance/platformincome";
	}
	
	/**
	 * 查询销售明细
	 * yangweihang
	 * @Date 2018年8月27日 上午4:12:27
	 * @return
	 */
	@RequestMapping("/selectbyxs")
	public String selectByXs(){
		List<Map<String, Object>> list = ifs.selectByXs();
		request.setAttribute("list", list);
		return "finance/selectbyxs";
	}
	
	/**
	 * 查询押金明细
	 * yangweihang
	 * @Date 2018年8月27日 上午4:12:27
	 * @return
	 */
	@RequestMapping("/selectbyyj")
	public String selectByYj(){
		List<Map<String, Object>> list = ifs.selectByYj();
		request.setAttribute("list", list);
		return "finance/selectbyyj";
	}
	
	/**
	 * 扫码收入分账、提成、公益金、基金明细表
	 * yangweihang
	 * @Date 2018年8月27日 上午8:17:29
	 * @return
	 */
	@RequestMapping("/selectfz")
	public String selectfz(){
		List<Map<String, Object>> list = ifs.selectfz();
		for(Map<String,Object> m : list){
			m.replace("onemlid", RoleUtil.memberlevel((int)m.get("onemlid")));
			m.replace("twomlid", RoleUtil.memberlevel((int)m.get("twomlid")));
		}
		request.setAttribute("list", list);
		return "finance/selectfz";
	}
	
	/**
	 * 公益金基金明细
	 * yangweihang
	 * @Date 2018年8月27日 上午10:50:04
	 * @return
	 */
	@RequestMapping("/selectbyfund")
	public String selectByFund(){
		List<Map<String, Object>> list = ifs.selectByFund();
		for(Map<String,Object> m : list){
			if(m.get("type") != null){
				m.replace("type", ProductUtil.proform((int)m.get("type")));
			}
		}
		request.setAttribute("list", list);
		return "finance/selectbyfund";
	}
	
}
