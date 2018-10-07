<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%
   String path = request.getContextPath();
   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>通络益管理后台</title>

<link rel="stylesheet" href="../css/index.css" type="text/css" media="screen" />

<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/tendina.min.js"></script>
<script type="text/javascript" src="../js/common.js"></script>

</head>
<body>
    <!--顶部-->
    <div class="layout_top_header">
            <div style="float: left"><span style="font-size: 16px;line-height: 45px;padding-left: 20px;color: #8d8d8d">XXXX管理后台</h1></span></div>
            <div id="ad_setting" class="ad_setting">
                <a class="ad_setting_a" href="javascript:; ">
                    <i class="icon-user glyph-icon" style="font-size: 20px"></i>
                    <span>管理员</span>
                    <i class="icon-chevron-down glyph-icon"></i>
                </a>
            </div>
    </div>
    <!--顶部结束-->
    <!--菜单-->
    <div class="layout_left_menu">
        <ul id="menu">
            <li class="childUlLi">
               <a href="main.html"  target="menuFrame"><i class="glyph-icon icon-home"></i>设备管理</a>
                <ul>
                    <li><a href="../equipment/insert.jsp" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>新增设备</a></li>
                    <li><a href="<%=path %>/equipment/selectByEquipment" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>设备管理</a></li>
                </ul>
            </li>
            <li class="childUlLi">
               <a href="main.html"  target="menuFrame"><i class="glyph-icon icon-home"></i>产品管理</a>
                <ul>
                    <li><a href="<%=path%>/equipment/selectEByName" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>新增产品</a></li>
                    <li><a href="<%=path%>/equipmentsublist/selectByProduct" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>产品管理</a></li>
                </ul>
            </li>
            <li class="childUlLi">
               <a href="main.html"  target="menuFrame"><i class="glyph-icon icon-home"></i>店铺管理</a>
                <ul>
                    <li><a href="<%=path%>/shop/selectbyshop" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>店铺管理</a></li>
                </ul>
            </li>
            <li class="childUlLi">
               <a href="main.html"  target="menuFrame"><i class="glyph-icon icon-home"></i>会员管理</a>
                <ul>
                    <li><a href="<%=path%>/member/selectByMember" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>会员管理</a></li>
                </ul>
            </li>
            <li class="childUlLi">
               <a href="main.html"  target="menuFrame"><i class="glyph-icon icon-home"></i>合伙人管理</a>
                <ul>
                    <li><a href="<%=path%>/partner/selectByPartner" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>合伙人管理</a></li>
                    <li><a href="<%=path%>/member/selectByNotp" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>新增合伙人</a></li>
                    <li><a href="<%=path%>/partnerequipment/selectallp" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>合伙人设备</a></li>
                </ul>
            </li>
            <li class="childUlLi">
               <a href="main.html"  target="menuFrame"><i class="glyph-icon icon-home"></i>提成奖励对应</a>
                <ul>
                    <li><a href="<%=path%>/commissionreward/select" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>会员合伙人提成奖励对应</a></li>
                </ul>
            </li>
            <li class="childUlLi">
               <a href="main.html"  target="menuFrame"><i class="glyph-icon icon-home"></i>设备维修明细</a>
                <ul>
                    <li><a href="<%=path%>/equipmentmaintenance/selectByEm" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>设备维修明细</a></li>
                </ul>
            </li>
            <li class="childUlLi">
               <a href="main.html"  target="menuFrame"><i class="glyph-icon icon-home"></i>财务管理</a>
                <ul>
                    <li><a href="<%=path%>/finance/platformincome?str=rb" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>日报</a></li>
                    <li><a href="<%=path%>/finance/platformincome?str=zb" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>周报</a></li>
                    <li><a href="<%=path%>/finance/platformincome?str=yb" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>月报</a></li>
                    <li><a href="<%=path%>/finance/platformincome?str=jb" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>季报</a></li>
                    <li><a href="<%=path%>/finance/platformincome?str=bnb" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>半年报</a></li>
                    <li><a href="<%=path%>/finance/platformincome?str=nb" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>年报</a></li>
                </ul>
            </li>
            <li class="childUlLi">
               <a href="main.html"  target="menuFrame"><i class="glyph-icon icon-home"></i>财务管理</a>
                <ul>
                    <li><a href="<%=path%>/finance/selectbyxs" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>销售收入、销售提成、公益金明细</a></li>
                    <li><a href="<%=path%>/finance/selectbyyj" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>押金收入明细</a></li>
                    <li><a href="<%=path%>/finance/selectfz" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>扫码收入分账、提成、公益金、基金明细</a></li>
                    <li><a href="<%=path%>/finance/selectbyfund" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>公益金基金明细</a></li>
                </ul>
            </li>
            <li class="childUlLi">
               <a href="main.html"  target="menuFrame"><i class="glyph-icon icon-home"></i>公益金、基金账户支出明细</a>
                <ul>
                    <li><a href="<%=path%>/fund/insert.jsp" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>新增公益金、基金账户支出</a></li>
                    <li><a href="<%=path%>/fund/select" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>公益金、基金账户支出</a></li>
                </ul>
            </li>
            <li class="childUlLi">
               <a href="main.html"  target="menuFrame"><i class="glyph-icon icon-home"></i>提现完税明细表</a>
                <ul>
                    <li><a href="<%=path%>/partner/selectbytx" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>提现完税明细表</a></li>
                </ul>
            </li>
        </ul>
    </div>
    <!--菜单-->
    <div id="layout_right_content" class="layout_right_content">

        <div class="mian_content">
            <div id="page_content">
                <iframe id="menuFrame" name="menuFrame" style="overflow:visible;"
                        scrolling="yes" frameborder="no" width="100%" height="100%"></iframe>
            </div>
        </div>
    </div>
    <div class="layout_footer">
        <p>Copyright © 2014 - XXXX科技</p>
    </div>
</body>
</html>