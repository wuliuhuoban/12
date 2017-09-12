<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/11 0011
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <title>城市三级联动 - citys</title>
  <link rel="shortcut icon" href="/wuliu/sanlian/public/image/favicon.png">
  <link rel="stylesheet" type="text/css" href="/wuliu/sanlian/public/style/cssreset-min.css">
  <link rel="stylesheet" type="text/css" href="/wuliu/sanlian/public/style/common.css">
  <style type="text/css">
    .citys{
      margin-bottom: 10px;
    }
    .citys p{
      line-height: 28px;
    }
    .warning{
      color: #c00;
    }
    .main a{
      margin-right: 8px;
      color: #369;
    }
  </style>
  <script type="text/javascript" src="/wuliu/sanlian/public/script/jquery.min.js"></script>
  <script type="text/javascript" src="/wuliu/sanlian/code/jquery.citys.js"></script>
  <script src="http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=js"></script>
</head>
<body>
<div class="main">
  <div id="location" class="citys">
    <p>请选择位置：</p>
    <p>
      <select name="province"></select>
      <select name="city"></select>
      <select name="area"></select>
    </p>
  </div>
  <script type="text/javascript">
   if(remote_ip_info){
      $('#location').citys({province:remote_ip_info['province'],city:remote_ip_info['city'],area:remote_ip_info['district']});
    }
  </script>
</div>
<%--<div style="display: none;">
  <script src="http://s11.cnzz.com/z_stat.php?id=1260218562&web_id=1260218562"></script>
</div>--%>
</body>
</html>
