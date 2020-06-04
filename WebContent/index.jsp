<%@ page language="java" contentType="text/html;charset=Windows-31J"%>

<html>
<body>
<h3>注文実績 レポート作成ツール</h3>
　作成条件を選択してください。<br>
　何も選択しないと全件抽出します<br><br>

	<form action="/java_mysql/Search" method="POST">
	<b>注文日</b> (2012/1/1 ～　2015/1/1)<br>
	指定した注文日以降のデータを出力します。<br>
	<ul>
	<li><input min="2012-01-01" max = "2015-01-01 "type="date" name = "insert_date" value="2012-01-01"></input></li>
    </ul>
    <b>注文番号</b><br>
    <ul>
	<li>No:1-10,000　⇒<input type="checkbox" name="order_id" value ="1"></li>
	<li>No:10,001-20,000　⇒<input type="checkbox" name="order_id" value ="2"></li>
	<li>No:20,001-30,000　⇒<input type="checkbox" name="order_id" value ="3"></li>
	<li>No:30,001-40,000　⇒<input type="checkbox" name="order_id" value ="4"></li>
	<li>No:40,001-50,000　⇒<input type="checkbox" name="order_id" value ="5"></li>
	</ul><br>
	
    <b>お客様年代</b><br>
    <ul>
	<li>10代　⇒<input type="checkbox" name="age_range" value ="1"></li>
	<li>20代　⇒<input type="checkbox" name="age_range" value ="2"></li>
	<li>30代　⇒<input type="checkbox" name="age_range" value ="3"></li>
	<li>40代　⇒<input type="checkbox" name="age_range" value ="4"></li>
	<li>50代　⇒<input type="checkbox" name="age_range" value ="5"></li>
	</ul><br>
	
	<input type="submit" value="レポート作成">
	</form>

</body>
</html>