<!-- RetailSignOn.jsp  from Server6(retapp06)-->

<script language=JavaScript>

	history. forward()

</script>

<html>

<head>
<title>ICICI Bank</title>
<STYLE type=text/css>.un {COLOR: #ffffff; TEXT-DECORATION: none}
.link { font-family: Arial; text-decoration: none; color: #901010;font-size:8pt;hover:text-decoration:underline}
.field1 {font-size: 10pt; font-family: Arial}
.headingtable {font-family: Arial; font-size: 9pt; font-weight: bold; color: #FFFFFF; text-decoration: none}
</STYLE>

<link rel="stylesheet" href="web/L001/css/stsheet.css">
<link rel="stylesheet" href="web/L001/css/vkb_style.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">

<meta name="WT.ti" content="RetailSignOn">
<meta name="WT.cg_n" content="RetailSignOn">
<meta name="DCS.dcsuri" content="/RetailSignOn">

<script language="javascript">
//Nishant - Added for javascript check
function isJavascriptAndJavaEnabled()
{

	var frm = document.forms[0];
	frm.jsFlag.value = true;
	frm.javaFlag.value = navigator.javaEnabled();
}
</script>

<script language="JavaScript">

<!--

var bankAppUrl = "https://infinity.icicibank.co.in/";
var flag=true;
function MM_openBrWindow(theURL,winName,features) { //v2.0

window.open(theURL,winName,features);

}

function do_process()
{
	//isJavascriptAndJavaEnabled();
	document.forms[0].CorporateSignonCorpId.focus();
	document.forms[0].CorporateSignonPassword.value = "";

}


function openOnlineForm(path)

{

window.location=path.options[path.selectedIndex].value;

}

function validate()
{
	isJavascriptAndJavaEnabled();
	var submt=true;

if(document.forms[0].CorporateSignonCorpId.value=="")
 {
 alert("Please enter your User ID");
 document.forms[0].CorporateSignonCorpId.focus();
 flag= false;
 submt=false;

 }
 else if (document.forms[0].CorporateSignonPassword.value == "")
 {
 document.forms[0].CorporateSignonPassword.focus();
 alert("Please enter your Password");
 submt=false;
 flag= false;
 }
else{
flag=true;
encryptValues();
}
return submt;
}

function buttonedDisabled(buttonClicked)
{

	if(validate()==false)
		return false;

	var	element=event.srcElement;

	var	current_src_element_name=element.name;
	var	current_src_element_value=element.value;
		for(i=0;i< index2.elements.length;i++)
		{
				var ctrl = index2.elements[i];

				if(ctrl.name=="myAction")
				{

					ctrl.name=current_src_element_name
					ctrl.value=current_src_element_value;

					break;
				}
		}
	if(element.name=="Action.CorpUser.Signon")
	{
		document.index2.submit();
		buttonClicked.disabled=true;
	}
return true


}

function showRegret()
{


/*
If the error message should pop-up (when the service is down) the value of the variable downtime should be like
var downtime="19:25 AM/PM" test

FME should only change the time along with AM/PM . DONOT give space between 2 double
quotes if the service is running

If the service is up and running the value of the variable downtime should be
var downtime="19:25 AM/PM"
*/

//-- The downtime below is to be edited start--------

var downtime="";

//-- The downtime above to be edited ends--------


if (downtime =="")
{

return flag;

}

if (downtime !="")
{
var messageWin=window.open('Regret.html','messageWin','width=300,height=200');
messageWin.document.write("<html><head><title>ICICI Bank-Message</title><body bgcolor='#e2e0d2'>");
messageWin.document.write("Dear Customer,"+"<br><br>"+"Due to technical reasons, you will not be able to login till " +downtime+ " IST. We regret the inconvenience caused to you."+"<br><br>"+ "Regards,"+"<br>"+ "Customer Service")
messageWin.document.write("</body></html>")
//document.forms[0].Submit1.disabled=true;
//document.forms[0].CorporateSignonPassword.disabled=true;
return false;
}

}



function callmainmenu(menu)

{

switch (menu){

case "AboutUs":

window.open("http://www.icicibank.com/pfsuser/aboutus/overview/overview.htm","");

break;

case "ContactUs":

window.open("http://www.icicibank.com/pfsuser/customer/helpdesk.htm","");

break;

case "LocateUs":

window.open("http://www.icicibank.com/pfsuser/inter_locator/inter_locator.htm");

break;

case "SiteHelp":

window.open("http://www.icicibank.com/pfsuser/sitemap/sitemap.htm","");

break;
case "Home1":
window.location.href = "http://www.icicibank.com";
break;

 case "Bank":
window.location.href = "http://www.icicibank.com/pfsuser/icicibank/depositproducts/bank.htm";
break;
case "Cards":
window.location.href = "http://www.icicibank.com/pfsuser/cards/cards.htm";
break;
case "Demat":
window.location.href = "http://www.icicibank.com/pfsuser/demat/demathome.htm";
break;
case "Loans":
window.location.href = "http://www.icicibank.com/pfsuser/loans/loans.htm";
break;
case "Investments":
//window.location.href = "http://www.icicibank.com/pfsuser/bonds/invst.htm";
window.location.href = "http://www.icicibank.com/Pfsuser/icicibank/investments/inv_index.htm";
break;
case "NRI":
window.location.href = "http://www.icicibank.com/pfsuser/icicibank/ibank-nri/nrinewversion/home_nri.htm";
break;
case "Online":
window.location.href = "http://www.icicibank.com/pfsuser/billpay/online.htm";
break;
case "Mobile":
window.location.href = "http://www.icicibank.com/pfsuser/channels/mobile/mobile.htm";
break;
case "Customer":
window.location.href = "http://www.icicibank.com/pfsuser/customerservice/internetbanking.htm";
break;

}

}
//-->
</script>

<SCRIPT language=JavaScript src="web/L001/corporate/jsp/commonjsp/script/webtrends_ribindl.js" type=text/javascript></script>
<!--<NOSCRIPT>
<IMG ALT="" BORDER="0" NAME="DCSIMG" WIDTH="1" HEIGHT="1" SRC="http://sdc.icicibank.com/dcs47ca6610000w497umin16r_6k1s/njs.gif?dcsuri=/nojavascript&amp;WT.js=No&amp;WT.tv=8.0.2">
</NOSCRIPT> -->

</head>
<!--623: Abhilash Feb 14 -->










<!--End 623: Abhilash Feb 14 -->

<!--End 623: Abhilash Feb 14 -->






<BODY leftMargin=0 link=#333366 topMargin=0 vLink=#333366 marginheight="0" marginwidth="0" OnLoad=do_process() >
<form name="index2" method=POST action="BANKAWAY;jsessionid=00013H0vxs3kh8pzgaYO2Wg1WiU:12opls62p?bwayparam=da0%2BCcRhcJfLjtYCXCZuARrnhMYei0G7D%2FyjdL1LXSFkUnut" target="_top" onSubmit="return showRegret()">




<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
<td>
<table cellspacing=0 cellpadding=0 width="779" bgcolor=#901010 border=0>
<tbody>
<tr>


<td valign=top width="53%"><a><img src="web/L001/images/icici/icicibanklogo.gif" width="375" height="48" border="0"></a></td>
<td align=left width=47%>
<table width="100%" border="0" cellspacing="0" cellpadding="0">

<tr>
<td height="22" width="204" align="right"><a href="#" class="toplinks"></a></td>

<td width="170" align="right" rowspan="2"><img src="web/L001/images/icici/topright4links.gif" width="142" height="37" usemap="#Map1" border="0">
<map name="Map1">
<area shape="rect" coords="3,5,60,18" href="javascript:callmainmenu('AboutUs')" alt="About Us" title="About Us">
<area shape="rect" coords="76,5,140,18" href="javascript:callmainmenu('ContactUs')" alt="Contact Us" title="Contact Us">
<area shape="rect" coords="4,23,64,34" href="javascript:callmainmenu('LocateUs')" alt="Locate Us" title="Locate Us">
<area shape="rect" coords="78,22,130,34" href="javascript:callmainmenu('SiteHelp')" alt="Site Map" title="Site Map">
</map>
</td>
</tr>


<tr>
<td width="204" align="right">





<SCRIPT LANGUAGE='JavaScript' >

function encryptValues()
{	
	return true;
}

</SCRIPT>


</td>

</td>
</tr>
</table>
</td>
</tr>
</tbody>
</table>
</td>
</tr>
<tr>
<td>

<table cellspacing=0 cellpadding=0 width="779" bgcolor=#901010 border=0>
<tbody>
<tr>
<td colspan="2" height="2">
<table border="0" cellpadding="2" cellspacing="1" width="100%">

<tr>
<td bgcolor="eb922c" align="center" width="10%" class="whitelnk"><a href="javascript:callmainmenu('Home1')" class="headingtable">Home</a></td>
<td bgcolor="eb922c" align="center" width="10%" class="whitelnk"><a href="javascript:callmainmenu('Bank')" class="headingtable">Banking
</a></td>
<td bgcolor="eb922c" align="center" width="10%" class="headingtable"><a href="javascript:callmainmenu('Cards')" class="headingtable">Cards</a></td>
<td align="center" width="10%" bgcolor="eb922c"><a href="javascript:callmainmenu('Demat')" class="headingtable">Demat</a></td>
<td align="center" width="10%" bgcolor="eb922c"><a href="javascript:callmainmenu('Loans')" class="headingtable">Loans</a></td>
<td align="center" width="10%" bgcolor="eb922c"><a href="javascript:callmainmenu('Bank')" class="headingtable">
</a><a href="javascript:callmainmenu('Investments')" class="headingtable">Investments</a></td>
<td bgcolor="eb922c" align="center" width="10%" class="whitelnk"><a href="javascript:callmainmenu('NRI')" class="headingtable">NRI<br>
Services </a></td>
<td bgcolor="eb922c" align="center" width="10%" class="whitelnk"><a href="javascript:callmainmenu('Mobile')" class="headingtable">Mobile<br>
Banking</a></td>
<td class="headingtable" align="center" width="10%" bgcolor="#eb922c"><a href="javascript:callmainmenu('Customer')" class="headingtable">Customer
Service </a></td>
<td class="headingtable" bgcolor="#901010" align="center" width="10%">Log-in
</td>
</tr>

</table>



</td>
</tr>
</tbody>
</table>
</td>
</tr>
<tr>
<td height="1"></td>
</tr>
<tr>
<td valign="top">
<table width="779" border="0" cellspacing="0" cellpadding="0" background="web/L001/images/icici/bg_trading.gif">
<tr>
<td width="100%" valign="top" align="center">
<table width="87%" border="0" cellspacing="0" cellpadding="0">
<tr>
<td>&nbsp;</td>
</tr>
<tr>
<td>
<table width="100%" border="0" cellspacing="1" cellpadding="0" bgcolor="#901010" height="250">
<tr>
<td>
<table width="100%" border="0" cellspacing="1" cellpadding="1" bgcolor="#ffffff" height="100%">
<tr>
<td  style="font-family: Arial; font-size: 10pt; font-weight: bold; color:#ffffff; background-color:#901010" >
Internet
Banking Login
</td>
</tr>
<tr>
<td width="68%" valign="top" ><table width="100%" border="0" cellspacing="0" cellpadding="0" >
  <tr>
    <td colspan="2" height="30"><table width="100%"  border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="10" colspan="2" align="center"></td>
        </tr>
      <tr>
        <td align="center" valign="top">
	  <table width="59%"  border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td colspan="4">
		<table width="348" border="0" cellpadding="0"   cellspacing="0">
              <tr>
                <td style="font-family: Arial; font-size: 10pt; font-weight: bold; color:#a41c2b" colspan="2"><u>Important Security Notice:</u></td>
              </tr>
		<tr>
                <td colspan="2"><font face="Arial" style="font-size:11px">&nbsp;</font></td>
              </tr>

              <tr>
                <td colspan="2"><font face="Arial" style="font-size:11px"><b>Ensure following before logging in</b> </font></td>
              </tr>
		<tr>
                <td valign="top"><font face="Arial" style="font-size:11px">1.</font></td>
			<td><font face="Arial" style="font-size:11px">URL address on the address bar of your internet browser begins with https://infinity.icicibank.co.in.</font></td>
              </tr>
		<tr>
                <td valign="top"><font face="Arial" style="font-size:11px">2.</font></td>
			<td><font face="Arial" style="font-size:11px">Do not enter login or other sensitive information in any pop up window. </font></td>
              </tr>
		<tr>
                <td valign="top"><font face="Arial" style="font-size:11px">3.</font></td>
			<td><font face="Arial" style="font-size:11px">You have verified the security certificate by clicking on the padlock icon of your internet browser.For more details </font>'<font face="Arial"  style="font-size:11px"><a href="http://www.icicibank.com/pfsuser/spoofs/safe_help.htm" target="_blank">Click Here</a></font>' </td>
              </tr>


            </table></td>
            </tr>
           <tr>
             <td height="10" colspan="5" align="right" class="content"></td>
             </tr>
           <tr>
    <td class="content" width="19%" align="right" height="35" style="font-family: Arial; font-size: 10pt; font-weight: bold; color:#a41c2b">User ID:</td>
    <td class="content" width="6%" align="center"><b><font color="#990000"><span class="midheads">
    </span></font></b></td>
    <td class="content" width="34%" align="left"><b><font color="#990000"><span class="midheads">
      <input name="CorporateSignonCorpId" style="width:100px" autocomplete="off" onClick="showRegret()" oncopy="return false" ondrag="return false" ondrop="return false" onpaste="return false">
    </span></font></b></td>
    <td width="41%" colspan="2" class="midheads">&nbsp;    </td>
    </tr>

  <tr>
    <td class="content" align="right" height="35" style="font-family: Arial; font-size: 10pt; font-weight: bold; color:#a41c2b">Password:</td>
    <td width="6%" align="center" class="content"><b><font color="#990000"><span class="midheads">
    </span></font></b></td>
    <td colspan="3" align="left" class="content"><table width="261" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="106" rowspan="2"><b><font color="#990000">
          <input name="CorporateSignonPassword" style="width:100px" type=password autocomplete="off" onClick="showRegret()" oncopy="return false" ondrag="return false" ondrop="return false" onpaste="return false">
        </font></b></td>
        <td width="22" rowspan="2"><input type="checkbox"  name="virtualpassword" onClick="virtualKey()" value="checkbox"></td>
        <td width="133" height="15"></td>
      </tr>
      <tr>
        <td style="font-family: Arial; font-size: 8pt">Use virtual keyboard<br>
&nbsp;&nbsp;&nbsp;<span style="color:#a41c2b; font-weight:bold">(Recommended)</span></td>
      </tr>
    </table>
      <b><font color="#990000"><span class="midheads">
    </span></font></b></td>
    </tr>
  



  <tr>
    <!--BOC for Quick Jump in Login Page Shivakumar -->
    <td class="content" align="right" height="35" style="font-family: Arial; font-size: 10pt; font-weight: bold; color:#a41c2b">Start in:</td>
    <td width="6%" align="center" class="content"><b><font color="#990000">
    </font></b></td>
    <td width="34%" align="left" class="content"><b><font color="#990000">
      <select name="PageSelected">
        <option value="1">My Accounts</option>
        <option value="2">Bank</option>
        <option value="4">Credit Card</option>
        <option value="5">Demat</option>
        <option value="10">Loans</option>
        <option value="9" >Investments</option>
        <option value="6">Bill Pay</option>
        <option value="11">Mobile Banking</option>
        <option value="12">Customer Service</option>
        <option value="13">NRI Services</option>
      </select>
    </font></b></td>
    <td colspan="2" class="midheads"><div align="left">
      </div>
        <!--EOC for Quick Jump in Login Page Shivakumar -->    </tr>

   
  <tr>
    <td class="content" align="right" height="35">&nbsp;</td>
    <td colspan="2" align="center" class="content"><span class="midheads"><span class="contentname">
      <input  type=submit value=Log-in onClick="buttonedDisabled(this);"  name="Action.CorpUser.Signon" >
    </span></span></td>

	<!--Start: Added by Abhilash for 623 Feb 14 -->
    <INPUT type="HIDDEN" name="folderId" value="AL">
    <INPUT type="HIDDEN" name="CorporateSignonAccessChannel" value="I" >
    <INPUT type="HIDDEN" name="UserType" value="1" >
    <INPUT type="HIDDEN" name="PageSelected" value="1" >
   <!--End: Added by Abhilash for 623 Feb 14 -->


	<td colspan="2"> </tr>
        </table></td>
          <td valign="top">

		  <table width="300" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><table width="290" border="0" cellpadding="0" cellspacing="1" bgcolor="#ded7bd">
                      <tr>
                        <td align="left" bgcolor="#FFFFFF"><table width="300" border="0" cellpadding="0" cellspacing="0">
                            <tr>
                              <td style="padding-left:5px;font-family: Arial; font-size: 8pt; "><span style="font-family: Arial; font-size: 8pt; font-weight: bold; color:#a41c2b">Virtual Keyboard</span> (for entering password only)</td>
                            </tr>
                            <tr>
                              <td align="center" style="padding-top:10px;padding-bottom:5px"><table width="290" border="0" cellspacing="0" cellpadding="0">
                                  <tr>
                                    <td align="center"><table  border="0" cellspacing="0" cellpadding="0">
                                        <tr>
              <td >
             <input type="button"  value="n" name="button1" id="button1"  class="type1d"  onkeypress="return func_spaceBarProhibit(event);callSleep()"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('N');}"  disabled >
           <input type="button"  value="z" name="button1" id="button1"  class="type1d"  onkeypress="return func_spaceBarProhibit(event);callSleep()"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('Z');}"  disabled >
           <input type="button"  value="h" name="button1" id="button1"  class="type1d"  onkeypress="return func_spaceBarProhibit(event);callSleep()"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('H');}"  disabled >
           <input type="button"  value="f" name="button1" id="button1"  class="type1d"  onkeypress="return func_spaceBarProhibit(event);callSleep()"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('F');}"  disabled >
           <input type="button"  value="g" name="button1" id="button1"  class="type1d"  onkeypress="return func_spaceBarProhibit(event);callSleep()"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('G');}"  disabled >
           <input type="button"  value="o" name="button1" id="button1"  class="type1d"  onkeypress="return func_spaceBarProhibit(event);callSleep()"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('O');}"  disabled >
           <input type="button"  value="a" name="button1" id="button1"  class="type1d"  onkeypress="return func_spaceBarProhibit(event);callSleep()"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('A');}"  disabled >
           <input type="button"  value="w" name="button1" id="button1"  class="type1d"  onkeypress="return func_spaceBarProhibit(event);callSleep()"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('W');}"  disabled >
           <input type="button"  value="t" name="button1" id="button1"  class="type1d"  onkeypress="return func_spaceBarProhibit(event);callSleep()"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('T');}"  disabled >
           <input type="button"  value="y" name="button1" id="button1"  class="type1d"  onkeypress="return func_spaceBarProhibit(event);callSleep()"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('Y');}"  disabled >
           </td><td style="width:10px"></td><td>
		   <input type="button" value="1"  name="number1" id="number1"  class="type1d"
		   onkeypress="return func_spaceBarProhibit(event);"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()"onclick="func_spaceBarProhibit(event);if(isSpace){func_click('1');}" disabled >
          <input type="button" value="3"  name="number1" id="number1"  class="type1d"
		   onkeypress="return func_spaceBarProhibit(event);"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()"onclick="func_spaceBarProhibit(event);if(isSpace){func_click('3');}" disabled >
          <input type="button" value="5"  name="number1" id="number1"  class="type1d"
		   onkeypress="return func_spaceBarProhibit(event);"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()"onclick="func_spaceBarProhibit(event);if(isSpace){func_click('5');}" disabled >
          
          </td>
         </tr>
          <tr >
          <td>
     
   <input type="button"  value="b"  name="button2" id="button2" class="type1d" onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('B');}" disabled >
 
   <input type="button"  value="u"  name="button2" id="button2" class="type1d" onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('U');}" disabled >
 
   <input type="button"  value="p"  name="button2" id="button2" class="type1d" onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('P');}" disabled >
 
   <input type="button"  value="i"  name="button2" id="button2" class="type1d" onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('I');}" disabled >
 
   <input type="button"  value="x"  name="button2" id="button2" class="type1d" onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('X');}" disabled >
 
   <input type="button"  value="c"  name="button2" id="button2" class="type1d" onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('C');}" disabled >
 
   <input type="button"  value="e"  name="button2" id="button2" class="type1d" onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('E');}" disabled >
 
   <input type="button"  value="r"  name="button2" id="button2" class="type1d" onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('R');}" disabled >
 
   <input type="button"  value="m"  name="button2" id="button2" class="type1d" onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('M');}" disabled >
 </td><td style="width:10px"></td><td>
 <input type="button"  value="9"  name="number2"  id="number2" class="type1d"
 onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('9');}" disabled >


  <input type="button"  value="2"  name="number2"  id="number2" class="type1d"
 onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('2');}" disabled >


  <input type="button"  value="4"  name="number2"  id="number2" class="type1d"
 onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('4');}" disabled >


  
 </td>
 </tr>
   <tr>
  <td>
  
 <input type="button" value="l"  name="button3" id="button3" class="type1d"  onkeypress="return func_spaceBarProhibit(event)"   onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('L');}" disabled >

 
 <input type="button" value="j"  name="button3" id="button3" class="type1d"  onkeypress="return func_spaceBarProhibit(event)"   onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('J');}" disabled >

 
 <input type="button" value="q"  name="button3" id="button3" class="type1d"  onkeypress="return func_spaceBarProhibit(event)"   onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('Q');}" disabled >

 
 <input type="button" value="k"  name="button3" id="button3" class="type1d"  onkeypress="return func_spaceBarProhibit(event)"   onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('K');}" disabled >

 
 <input type="button" value="d"  name="button3" id="button3" class="type1d"  onkeypress="return func_spaceBarProhibit(event)"   onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('D');}" disabled >

 
 <input type="button" value="s"  name="button3" id="button3" class="type1d"  onkeypress="return func_spaceBarProhibit(event)"   onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('S');}" disabled >

 
 <input type="button" value="v"  name="button3" id="button3" class="type1d"  onkeypress="return func_spaceBarProhibit(event)"   onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('V');}" disabled >

 </td><td style="width:10px"></td><td>
  

<input type="button"  value="8"  name="number3" id="number3"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('8');}" disabled >
 

<input type="button"  value="0"  name="number3" id="number3"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('0');}" disabled >
 

<input type="button"  value="6"  name="number3" id="number3"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('6');}" disabled >
 

 </td>
 </tr>
 <tr>
  <td>
 
<input type="button"  value="{"  name="button4" id="button4" class="type1d"
 onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('{');}" disabled >
 
<input type="button"  value="?"  name="button4" id="button4" class="type1d"
 onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('?');}" disabled >
 
<input type="button"  value="/"  name="button4" id="button4" class="type1d"
 onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('/');}" disabled >
 
<input type="button"  value="#"  name="button4" id="button4" class="type1d"
 onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('#');}" disabled >
 
<input type="button"  value="]"  name="button4" id="button4" class="type1d"
 onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click(']');}" disabled >
 
<input type="button"  value="|"  name="button4" id="button4" class="type1d"
 onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('|');}" disabled >
 
<input type="button"  value="<"  name="button4" id="button4" class="type1d"
 onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('<');}" disabled >
 
<input type="button"  value="!"  name="button4" id="button4" class="type1d"
 onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('!');}" disabled >
 
<input type="button"  value="'"  name="button4" id="button4" class="type1d"
 onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('sQuot');}" disabled >
 
<input type="button"  value="+"  name="button4" id="button4" class="type1d"
 onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('+');}" disabled >
 </td><td style="width:10px"></td><td style="padding-left:22px">

 
<input type="button"  value="7"  name="number4" id="number4"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('7');}" disabled >
 

 </td>
  </tr>
   <tr>
   <td colspan="3">
 
<input  type="button"  value=")"  name="button5" id="button5"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"   onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click(')');}" disabled >
 
<input  type="button"  value="}"  name="button5" id="button5"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"   onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('}');}" disabled >
 
<input  type="button"  value="\"  name="button5" id="button5"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"   onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('bslash');}" disabled >
 
<input  type="button"  value="$"  name="button5" id="button5"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"   onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('$');}" disabled >
 
<input  type="button"  value="="  name="button5" id="button5"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"   onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('=');}" disabled >
 
<input  type="button"  value=","  name="button5" id="button5"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"   onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click(',');}" disabled >
 
<input  type="button"  value="-"  name="button5" id="button5"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"   onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('-');}" disabled >
 
<input  type="button"  value="%"  name="button5" id="button5"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"   onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('%');}" disabled >
 
<input  type="button"  value="."  name="button5" id="button5"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"   onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('.');}" disabled >
 
<input  type="button"  value="["  name="button5" id="button5"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"   onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('[');}" disabled >
 
<input  type="button"  value=">"  name="button5" id="button5"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"   onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('>');}" disabled >
 

 </td>
  </tr>
 <tr>
 <td colspan="3">
 
<input  type="button" value="`"  name="button10" id="button10"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('`');}"disabled >
 
<input  type="button" value="("  name="button10" id="button10"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('(');}"disabled >
 
<input  type="button" value="*"  name="button10" id="button10"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('*');}"disabled >
 
<input  type="button" value=":"  name="button10" id="button10"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click(':');}"disabled >
 
<input  type="button" value="^"  name="button10" id="button10"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('^');}"disabled >
 
<input  type="button" value="~"  name="button10" id="button10"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('~');}"disabled >
 
<input  type="button" value="&#34;"  name="button10" id="button10"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('dQuot');}"disabled >
 
<input  type="button" value="&"  name="button10" id="button10"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('&');}"disabled >
 
<input  type="button" value=";"  name="button10" id="button10"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click(';');}"disabled >
 
<input  type="button" value="@"  name="button10" id="button10"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('@');}"disabled >
 
<input  type="button" value="_"  name="button10" id="button10"  class="type1d"
onkeypress="return func_spaceBarProhibit(event)"  onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" onclick="func_spaceBarProhibit(event);if(isSpace){func_click('_');}"disabled >
 

 </td>
  </tr>
                                   <tr>
                                    <td colspan="3">
  
  <input type="button"  name="button6" id="button6"  class="type2d" value="Back Space"  onclick="func_back()" onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" disabled>

  <input type="button"  name="button7" id="button7"  class="type3d" value="Clear" onclick="func_clear()" onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" disabled >


  <input type="button"   name="button8" id="button8" class="type2d" value="Caps Lock" onclick="func_capslock(this)" onmousedown="callSleep()" onmouseup="backToPreKey()"; onmouseout="backToPreKey()" onkeydown="callSleep()" disabled>

 <input type="hidden" name="test" value="false" >

 <input type="hidden" name="test" value="false" >
 <input type="hidden" name="charFirstRowhidden" value='N|Z|H|F|G|O|A|W|T|Y|'>
 <input type="hidden" name="numFirstRowhidden" value='1|3|5|'>
 <input type="hidden" name="charSecondRowhidden" value='B|U|P|I|X|C|E|R|M|'>
 <input type="hidden" name="numSecondRowhidden" value='9|2|4|'>
 <input type="hidden" name="charThirdRowhidden" value='L|J|Q|K|D|S|V|'>
 <input type="hidden" name="numThirdRowhidden" value='8|0|6|'>
 <input type="hidden" name="speFirstRowhidden" value='type1 spe_cob|type1 spe_qm|type1 spe_fslash|type1 spe_hash|type1 spe_scb|type1 spe_pipe|type1 spe_lt|type1 spe_ex|type1 spe_squot|type1 spe_plus|'>
 <input type="hidden" name="numFourthRowhidden" value='7|'>
 <input type="hidden" name="speSecondRowhidden" value='type1 spe_rcb|type1 spe_ccb|type1 spe_bslash|type1 spe_dol|type1 spe_equal|type1 spe_comma|type1 spe_hyphen|type1 spe_per|type1 spe_fs|type1 spe_sob|type1 spe_gt|'>
 <input type="hidden" name="speThirdRowhidden" value='type1 spe_ep|type1 spe_rob|type1 spe_asterix|type1 spe_co|type1 spe_exp|type1 spe_tilde|type1 spe_dquot|type1 spe_amp|type1 spe_semico|type1 spe_at|type1 spe_underscore|'>
 <input type="hidden" name="grow4" value='{4?4/4#4]4|4<4!4sQuot4+4'>
 <input type="hidden" name="grow5" value=')4}4bslash4$4=4,4-4%4.4[4>4'>
 <input type="hidden" name="grow6" value='`4(4*4:4^4~4dQuot4&4;4@4_4'>


<!-- <input type="button"   name="button9" id="button9" class="type3 shiftl"   onclick="func_shift(this)"  disabled> -->
  </td>
                                  </tr>
                                    </table></td>
                                  </tr>
                              </table></td>
                            </tr>
                        </table></td>
                      </tr>
                  </table></td>
                </tr>
                <tr>
                  <td height="5"></td>
                </tr>
                <tr>
                  <td style="padding-left:5px; padding-left:5px; font-family: Arial; font-size: 8pt">To know more about Virtual Keyboard, <a href="http://www.icicibank.com/pfsuser/webnews/virtualkeyboad.htm" target="_blank">Click Here</a></td>
                </tr>
              </table>














		  </td>
                            </tr>
                        </table></td>
                      </tr>

  <tr>
    <td class="content" align="center" height="10"></td>
  </tr>
  <tr>
    


    <td class="content" colspan="2"><span class="bluebold1"><a href="#" onClick="MM_openBrWindow('/pfsuser/temp/onlinesecurity.htm#cyber','','scrollbars=yes,resizable=yes,width=640,height=420')"><font color="#000000" face="Arial" size="2"><b><font color="#901010"> </font></b></font></a></span>
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr width="100%" align="center">



			<td width="25%" height="10"><a href="http://www.icicibank.com/pfsuser/temp/linkmyaccounts.htm" target="_blank" style="font-family: Arial; font-size: 8pt; font-weight: bold; color:#a41c2b">New users? Register here.</a> </td>

			

			<td width="25%" height="10"><a href="BANKAWAY;jsessionid=00013H0vxs3kh8pzgaYO2Wg1WiU:12opls62p?bwayparam=Z6spFdlqDa3Hj9YfSh92Cy3jmIk6gEaqHK%2BOPoIZdmpLWSr5KXYswbyYyWJ7oET4pNUyzzMuId4G%0D%0Abodefp0l0vnEcwPJIsA1Rz9kzh5D1mdL7UUWe59MivBmBNAxYjEjxVXVFFKf" target="_blank" style="font-family: Arial; font-size: 8pt; font-weight: bold; color:#a41c2b">Generate Password Online</a> </td>

			<!-- <td width="33%" height="10"><a href="#" onClick="MM_openBrWindow('/web/L001/corporate/helpfiles/trouble1.html','','status=yes,scrollbars=yes,resizable=yes,width=780,height=400')" style="font-family: Arial; font-size: 8pt; font-weight: bold; color:#a41c2b">Forgot password?</a> </td> -->

			<!-- Online Password Generation start -->	
			
			<td width="25%" height="10"><a href="#" onClick="MM_openBrWindow('http://www.icicibank.com/online-services/personal.html','','scrollbars=yes,resizable=yes,width=600,height=400')" style="font-family: Arial; font-size: 8pt; font-weight: bold; color:#a41c2b">Forgot Password?</a> </td>
		<!-- Online Password Generation end-->

			<td width="25%" height="10"><a href="#" onClick="MM_openBrWindow('http://www.icicibank.com/pfsuser/temp/trouble.html','','scrollbars=yes,resizable=yes,width=600,height=400')" style="font-family: Arial; font-size: 8pt; font-weight: bold; color:#a41c2b">Trouble logging in?</a>
          </tr>


		   

		  <tr align="center">
            <td width="25%" height="10" ><a href="#"onClick="MM_openBrWindow('https://infinity.icicibank.co.in/salesEARWeb/web/contactpr/jsp/report.jsp','','')" style="font-family: Arial; font-size: 8pt; font-weight: bold; color:#a41c2b"> Report a suspicious e-mail.</a> </td>

			<td width="25%" height="10" align="Left">&nbsp;&nbsp;&nbsp;<a href="#" onClick="MM_openBrWindow('http://www.icicibank.com/pfsuser/temp/cybersec.htm#cyber','','scrollbars=yes,resizable=yes,width=640,height=420')" style="font-family: Arial; font-size: 8pt; font-weight: bold; color:#a41c2b">Cyber Cafe Security</a> </td>

			<td width="25%" height="10"><font face="Arial" size="1">
              <a href="#"onClick="MM_openBrWindow('http://www.icicibank.com/pfsuser/temp/emailfraud.htm','','scrollbars=yes,resizable=yes,width=500,height=400')" style="font-family: Arial; font-size: 8pt; font-weight: bold; color:#a41c2b">About e-mail fraud</a>
            </font></td>

			<td width="25%" height="10" align="Left"><font face="Arial" size="1">
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="#"onClick="MM_openBrWindow('http://www.icicibank.com/Pfsuser/spoofs/safebanking_index.html','','scrollbars=yes,resizable=yes,width=500,height=400')" style="font-family: Arial; font-size: 8pt; font-weight: bold; color:#a41c2b">Safe Banking</a>
            </font></td>

			<td width="25%" height="10">&nbsp;</td>
           
		  </tr>
        </table>

</table></td>
</tr>
</table>
</td>
</tr>
</table>
</td>
</tr>
</table>
</td>
</tr>
</table>
</td>
</tr>
<tr>

</tr>


<tr>
<td valign="top" height="40">
<table width="779" border="0" cellspacing="0" cellpadding="0">
<tr><td><table width="67%" border="0" cellspacing="0" cellpadding="0"  align="center">
<tr><td>
&nbsp;
</td></tr>
<tr><td><font face="Arial" color="red" style="font-size:11px">
<b>DIGITAL SECURITY:</b></font><font face="Arial" style="font-size:11px">
 infinity.icicibank.co.in has been verified by Entrust. The communication of your private information from any address beginning with "https" is encrypted and secured using SSL</font></td></tr>
<tr><td>
&nbsp;
</td></tr>

</table>
</td></tr>
<tr>

<td>
<table width="87%" border="0" cellspacing="0" cellpadding="1" bgcolor="#901010" align="center">



<tr>
<td valign="top" height="22">
<table width="100%" border="0" cellspacing="0" cellpadding="3" bgcolor="#ffffff" background="/web/L001/images/icici/bottom_bg.gif" align="left">
<tr>
<td align="center">

<a href="http://www.icicibank.com/pfsuser/customerservice/internetbanking.htm" target="_blank" class="link">Customer
Service</a><font color="#901010" size="1" face="Arial">
&nbsp;|&nbsp; <a href="http://www.icicibank.com/pfsuser/channels/internet/ibgfaq.htm" target="_blank" class="link">Internet
Banking FAQ's</a> &nbsp;| <span class="bluebold"><a href="http://www.icicibank.com/pfsuser/demo/demo_flash/launch.html" target="_blank" class="link">&nbsp;Internet
Banking Demo</a></span>&nbsp;|<span class="bluebold">





<a href="#"class="link" onClick="MM_openBrWindow('http://www.icicibank.com/pfsuser/temp/privacy.htm','','scrollbars=yes,resizable=yes,width=640')">
</a><a href="#"class="link" onClick="MM_openBrWindow('http://www.icicibank.com/pfsuser/temp/privacy.htm','','scrollbars=yes,resizable=yes,width=640')">Privacy</a>&nbsp;
| <span class="bluebold"><a href="#"onClick="MM_openBrWindow('http://www.icicibank.com/pfsuser/temp/onlinesecurity.htm','','scrollbars=yes,resizable=yes,width=640,height=420')"class="link">&nbsp;Online
Security</a></span>&nbsp; | <span class="bluebold"><a href="#"onClick="MM_openBrWindow('http://www.icicibank.com/pfsuser/temp/tcbank.htm','','scrollbars=yes,resizable=yes,width=640')"class="link">&nbsp;Terms
and Conditions</a></span> | <a

href="#"class="link"

onClick="MM_openBrWindow('http://www.icicibank.com/pfsuser/temp/disclaimerbank.htm','','scrollbars=yes,resizable=yes,width=640')">&nbsp;Disclaimer</a>
</font></td>
<!-- Entrust ssl certificate added by Prerna--->





</tr>
<tr>
<td align="center" class="bottominfo"></td>
</tr>
</table>
</td>
</tr>
</table>
</td>
</tr>
</table>
</td>
</tr>
</table>
<input type=hidden name=jsFlag value="false">
<input type=hidden name=javaFlag value="false">
<INPUT type=hidden name="myAction" >




</form>
</body>
</html>

<script>



   /*var flag4='true';

 function func_shift(obj){


    var firstRowSplit  = document.index2.charFirstRowhidden.value;
	var secondRowSplit = document.index2.charSecondRowhidden.value;
	var thirdRowSplit = document.index2.charThirdRowhidden.value;



   if(flag4=='false' ){
       obj.className ='type3 shift' ;
	   flag4="true";
	   firstRow = firstRowSplit.split("|");

	   for(i=0;i<firstRow.length-1;i++){
	   	   document.index2.button1[i].className='type1 '+firstRow[i];
	   }
	   secondRow =secondRowSplit.split("|");
	   for(i=0;i<secondRow.length-1;i++){
	      document.index2.button2[i].className='type1 '+secondRow[i];
	    }
	    thirdRow =thirdRowSplit.split("|");
		   for(i=0;i<thirdRow.length-1;i++){
	       document.index2.button3[i].className='type1 '+thirdRow[i];
	    }



   }else{
       obj.className ='type3 shift_onclick';
	   flag4="false";
	    firstRow = firstRowSplit.split("|");
	          for(i=0;i<firstRow.length-1;i++){
	       		   document.index2.button1[i].className='type1 '+firstRow[i]+'1';
	          }

			  secondRow =secondRowSplit.split("|");
		      for(i=0;i<secondRow.length-1;i++){
	       		   document.index2.button2[i].className='type1 '+secondRow[i]+'1';
	          }

			  thirdRow =thirdRowSplit.split("|");
		      for(i=0;i<thirdRow.length-1;i++){
	       		   document.index2.button3[i].className='type1 '+thirdRow[i]+'1';
   }

   }

 }*/


   function virtualKey(){

		 if(document.index2.virtualpassword.checked){

			 var firstNewRowSplit   = document.index2.charFirstRowhidden.value;
	         var secondNewRowSplit  = document.index2.charSecondRowhidden.value;
	         var thirdNewRowSplit   = document.index2.charThirdRowhidden.value;
             var fourthNewRowSplit  = document.index2.numFirstRowhidden.value;
			 var fifthNewRowSplit   = document.index2.numSecondRowhidden.value;
			 var sixthNewRowSplit   = document.index2.numThirdRowhidden.value;
			 var seventhNewRowSplit = document.index2.speFirstRowhidden.value;
			 var eigthNewRowSplit   = document.index2.numFourthRowhidden.value;

			 var ninthNewRowSplit   = document.index2.speSecondRowhidden.value;
             var tenthNewRowSplit   = document.index2.speThirdRowhidden.value;


			 document.index2.CorporateSignonPassword.readOnly=true;
		 	 document.index2.CorporateSignonPassword.value="";

			 firstNewRow=firstNewRowSplit.split("|");

			 for(i=0;i<firstNewRow.length-1;i++){
	       	   document.index2.button1[i].className='type1';
	         }

			 secondNewRow =secondNewRowSplit.split("|");
		      for(i=0;i<secondNewRow.length-1;i++){
	       		   document.index2.button2[i].className='type1';
	          }
			 thirdNewRow =thirdNewRowSplit.split("|");
		     for(i=0;i<thirdNewRow.length-1;i++){
	       		   document.index2.button3[i].className='type1';
	         }
			 fourthNewRow =fourthNewRowSplit.split("|");
		     for(i=0;i<fourthNewRow.length-1;i++){
	       		   document.index2.number1[i].className='type1';
	         }

			 fifthNewRow =fifthNewRowSplit.split("|");
		     for(i=0;i<fifthNewRow.length-1;i++){
	       		  document.index2.number2[i].className='type1';
	         }

			 sixthNewRow =sixthNewRowSplit.split("|");
		     for(i=0;i<sixthNewRow.length-1;i++){
	       		   document.index2.number3[i].className='type1';
	         }

			 seventhNewRow =seventhNewRowSplit.split("|");
		      for(i=0;i<seventhNewRow.length-1;i++){

				document.index2.button4[i].className='type1';

              }
			  eigthNewRow =eigthNewRowSplit.split("|");
		      document.index2.number4.className='type1';

			 ninthNewRow =ninthNewRowSplit.split("|");
			 for(i=0;i<ninthNewRow.length-1;i++){

				document.index2.button5[i].className='type1';
	         }

			 tenthNewRow =tenthNewRowSplit.split("|");
		     for(i=0;i<tenthNewRow.length-1;i++){
	       	   document.index2.button10[i].className='type1';
	         }


		    document.index2.button6.className="type2";
			document.index2.button7.className="type3";
            document.index2.button8.className="type2";
           // document.index2.button9.className="type3 shift";




			  for(var i=0;i<10;i++)
			  {
				  document.index2.button1[i].disabled=false;


			  }

			  for(var i=0;i<9;i++)
			  {
				  document.index2.button2[i].disabled=false;
			  }

			  for(var i=0;i<7;i++)
			  {
				 document.index2.button3[i].disabled=false;
			  }

			  for(var i=0;i<3;i++)
			  {
                 document.index2.number1[i].disabled=false;

			  }
		 	  for(var i=0;i<3;i++)
			  {
                document.index2.number2[i].disabled=false;

			  }
		      for(var i=0;i<3;i++)
			  {
                document.index2.number3[i].disabled=false;

			  }

			  for(var i=0;i<10;i++)
			 {

                document.index2.button4[i].disabled=false;
		 	 }
              for(var i=0;i<11;i++)
			 {

                document.index2.button5[i].disabled=false;
			 }
             for(var i=0;i<11;i++)
			 {

				document.index2.button10[i].disabled=false;
			 }



            document.index2.number4.disabled=false;
		    document.index2.button6.disabled=false;
			document.index2.button7.disabled=false;
            document.index2.button8.disabled=false;
            //document.index2.button9.disabled=false;


	     }else{


var test=confirm("Virtual keyboard is recommended to protect your password. Are you sure you want to use normal keyboard?");
    if(test)
	{


			 var firstNewRowSplit   = document.index2.charFirstRowhidden.value;
	         var secondNewRowSplit  = document.index2.charSecondRowhidden.value;
	         var thirdNewRowSplit   = document.index2.charThirdRowhidden.value;
             var fourthNewRowSplit  = document.index2.numFirstRowhidden.value;
			 var fifthNewRowSplit   = document.index2.numSecondRowhidden.value;
			 var sixthNewRowSplit   = document.index2.numThirdRowhidden.value;
			 var seventhNewRowSplit = document.index2.speFirstRowhidden.value;
			 var eigthNewRowSplit   = document.index2.numFourthRowhidden.value;
			 var ninthNewRowSplit   = document.index2.speSecondRowhidden.value;
             var tenthNewRowSplit   = document.index2.speThirdRowhidden.value;

			 document.index2.CorporateSignonPassword.value="";
			 document.index2.CorporateSignonPassword.readOnly=false;

			 flag='false';
			 firstNewRow=firstNewRowSplit.split("|");

			 for(i=0;i<firstNewRow.length-1;i++){
	       	   document.index2.button1[i].className='type1d';
	         }

			 secondNewRow =secondNewRowSplit.split("|");
		      for(i=0;i<secondNewRow.length-1;i++){
	       		   document.index2.button2[i].className='type1d';
	          }
			 thirdNewRow =thirdNewRowSplit.split("|");
		     for(i=0;i<thirdNewRow.length-1;i++){
	       		   document.index2.button3[i].className='type1d';
	         }
			 fourthNewRow =fourthNewRowSplit.split("|");
		     for(i=0;i<fourthNewRow.length-1;i++){
	       		   document.index2.number1[i].className='type1d';
	         }

			 fifthNewRow =fifthNewRowSplit.split("|");
		     for(i=0;i<fifthNewRow.length-1;i++){
	       		  document.index2.number2[i].className='type1d';
	         }

			 sixthNewRow =sixthNewRowSplit.split("|");
		     for(i=0;i<sixthNewRow.length-1;i++){
	       		   document.index2.number3[i].className='type1d';
	         }

			 seventhNewRow =seventhNewRowSplit.split("|");
		      for(i=0;i<seventhNewRow.length-1;i++){

				document.index2.button4[i].className='type1d';

              }

			  eigthNewRow =eigthNewRowSplit.split("|");
		      document.index2.number4.className='type1d';


			 ninthNewRow =ninthNewRowSplit.split("|");
		     for(i=0;i<ninthNewRow.length-1;i++){
	       	    document.index2.button5[i].className='type1d';
	         }

			 tenthNewRow =tenthNewRowSplit.split("|");
		     for(i=0;i<tenthNewRow.length-1;i++){
	       	   document.index2.button10[i].className='type1d';
	         }

			document.index2.button6.className="type2d";
			document.index2.button7.className="type3d";
            document.index2.button8.className="type2d";





		      for(var i=0;i<10;i++)
			  {
           	     document.index2.button1[i].disabled=true;
			  }
			  for(var i=0;i<9;i++){
                 document.index2.button2[i].disabled=true;
			  }

			   for(var i=0;i<7;i++){
                 document.index2.button3[i].disabled=true;
			  }

		      for(var i=0;i<3; i++)
			  {
                document.index2.number1[i].disabled=true;

			  }
		      for(var i=0;i<3;i++)
			  {
                document.index2.number2[i].disabled=true;
			  }
		      for(var i=0;i<3;i++)
			  {
                document.index2.number3[i].disabled=true;
		  	  }
              for(var i=0;i<10;i++)
			  {
               document.index2.button4[i].disabled=true;

			 }
              for(var i=0;i<11;i++)
			 {
                 document.index2.button5[i].disabled=true;

			 }
               for(var i=0;i<11;i++)
			 {

				 document.index2.button10[i].disabled=true;

			 }

               document.index2.number4.disabled=true;
               document.index2.button6.disabled=true;
			   document.index2.button7.disabled=true;
               document.index2.button8.disabled=true;
		       //document.index2.button9.disabled=true;
		  }else{

               document.index2.virtualpassword.checked=true;

	      }

	}

}




   var flag ='false';
   function func_clear()
   {
       document.index2.CorporateSignonPassword.value="";
   }

   function func_capslock(obj)
  {

		var firstRowSplit  = document.index2.charFirstRowhidden.value;
		var secondRowSplit = document.index2.charSecondRowhidden.value;
		var thirdRowSplit = document.index2.charThirdRowhidden.value;

		if( flag=='true' ){
	        flag='false';
	       obj.className ='type2';
			firstRow = firstRowSplit.split("|");

			for(i=0;i<firstRow.length-1;i++){
	       	   document.index2.button1[i].value=firstRow[i].toLowerCase();
	        }
	   	    secondRow =secondRowSplit.split("|");
		      for(i=0;i<secondRow.length-1;i++){
	       		   document.index2.button2[i].value=secondRow[i].toLowerCase();
	          }
			thirdRow =thirdRowSplit.split("|");
		    for(i=0;i<thirdRow.length-1;i++){
	       		   document.index2.button3[i].value=thirdRow[i].toLowerCase();
	         }
	}else{

			  flag='true';

	          obj.className='type2caps';

			  firstRow = firstRowSplit.split("|");
	          for(i=0;i<firstRow.length-1;i++){
	       		   document.index2.button1[i].value=firstRow[i];
	          }

			  secondRow =secondRowSplit.split("|");
		      for(i=0;i<secondRow.length-1;i++){
	       		   document.index2.button2[i].value=secondRow[i];
	          }

			  thirdRow =thirdRowSplit.split("|");
		      for(i=0;i<thirdRow.length-1;i++){
	       		   document.index2.button3[i].value=thirdRow[i];
	          }

           }

  }

 function func_back(){
     var j=document.index2.CorporateSignonPassword.value;
     document.index2.CorporateSignonPassword.value=j.substring(0,j.length-1);

}

var isSpace=true;
function func_spaceBarProhibit(event)
{

	var keyCode = event.keyCode ? event.keyCode : event.which ? event.which : event.charCode;

	if((keyCode=="32") || (keyCode=="13"))
	{
			alert("Please use mouse only for virtual keybord!!!");
			 isSpace=false;
			 return false;
	}
		isSpace=true;
		return true;
}









function func_click(obj)
{
	if(obj=='sQuot'){
       obj=obj.replace(/sQuot/,'\'');
	}
	if(obj=='dQuot'){
       obj=obj.replace(/dQuot/,'\"');
	}
	if(obj=='bslash'){
       obj=obj.replace(/bslash/,'\\');

	}


    var i= obj;

	if(flag=='true' ){
	   var j = document.index2.CorporateSignonPassword.value+i.toUpperCase();
       document.index2.CorporateSignonPassword.value=j;





	}else{

	   var j = document.index2.CorporateSignonPassword.value+i.toLowerCase();
       document.index2.CorporateSignonPassword.value=j;

	 }

}

function callSleep(){

// var clickkey=func_ProhibitAll(event);

if(event.keyCode==0)
{

for(var z=0;z<=9;z++)
{
document.index2.button1[z].value="#";
document.index2.button4[z].value="#";
}

for(var z=0;z<=2;z++)
{
document.index2.number1[z].value="#";
document.index2.number2[z].value="#";
document.index2.number3[z].value="#";
}
document.index2.number4.value="#";
for(var z=0;z<=8;z++)
{
document.index2.button2[z].value="#";
}
for(var z=0;z<=6;z++)
{
document.index2.button3[z].value="#";
}
for(var z=0;z<=10;z++)
{
document.index2.button5[z].value="#";
document.index2.button10[z].value="#";
}
document.index2.button6.value="#";
document.index2.button7.value="#";
document.index2.button8.value="#";
//setTimeout("backToPreKey()",300);

}
}

function callSleep_1(){

if(event.keyCode==0)
{
for(var z=0;z<=9;z++)
{
document.index2.button1[z].value="#";
document.index2.button4[z].value="#";
}

for(var z=0;z<=2;z++)
{
document.index2.number1[z].value="#";
document.index2.number2[z].value="#";
document.index2.number3[z].value="#";
}
document.index2.number4.value="#";
for(var z=0;z<=8;z++)
{
document.index2.button2[z].value="#";
}
for(var z=0;z<=6;z++)
{
document.index2.button3[z].value="#";
}
for(var z=0;z<=10;z++)
{
document.index2.button5[z].value="#";
document.index2.button10[z].value="#";
}
document.index2.button6.value="#";
document.index2.button7.value="#";
document.index2.button8.value="#";
setTimeout("backToPreKey()",800);

}
}

function backToPreKey()
{

var p = document.index2.charFirstRowhidden.value;

if(flag=='false'){
 p = p.toLowerCase();
}
var j = p.split("|");

var r = document.index2.speFirstRowhidden.value;
//alert(r);
var s = r.split("|");

var p1 = document.index2.charSecondRowhidden.value;
if(flag=='false'){
  p1 = p1.toLowerCase();
}
var j1 = p1.split("|");


var p3 = document.index2.charThirdRowhidden.value;
if(flag=='false'){
  p3 = p3.toLowerCase();
}
var j3 = p3.split("|");

var p4 = document.index2.numFirstRowhidden.value;
var j4 = p4.split("|");


var p5 = document.index2.numSecondRowhidden.value;
var j5 = p5.split("|");

var p6 = document.index2.numThirdRowhidden.value;
var j6 = p6.split("|");

var p7 = document.index2.numFourthRowhidden.value;
var j7 = p7.split("|");

var p8 = document.index2.grow4.value;
var j8 = p8.split("4");


var p9 = document.index2.grow5.value;
var j9 = p9.split("4");

var p10 = document.index2.grow6.value;
var j10 = p10.split("4");



for(var m=0;m<10;m++)
{
document.index2.button1[m].value=j[m];
}

for(var m=0;m<9;m++)
{
document.index2.button2[m].value=j1[m];
}

for(var m=0;m<7;m++)
{
document.index2.button3[m].value=j3[m];
}

for(var m=0;m<3;m++)
{
document.index2.number1[m].value=j4[m];
document.index2.number2[m].value=j5[m];
document.index2.number3[m].value=j6[m];
}
document.index2.number4.value=j7[0];

for(var m=0;m<10;m++)
{

  //alert(j8[m]=="dQuot");

  if(j8[m]=="dQuot"){

       j8[m]=j8[m].replace(/dQuot/,'\"');
       document.index2.button4[m].value=j8[m];

  }
  if(j8[m]=="sQuot"){

      j8[m]=j8[m].replace(/sQuot/,'\'');
      document.index2.button4[m].value=j8[m];

  }

  if(j8[m]=="bslash"){

      j8[m]=j8[m].replace(/bslash/,'\\');
      document.index2.button4[m].value=j8[m];
  }

document.index2.button4[m].value=j8[m];
}

for(var m=0;m<11;m++)
{

 if(j9[m]=="dQuot"){

       j9[m]=j9[m].replace(/dQuot/,'\"');
       document.index2.button5[m].value=j9[m];

  }
  if(j9[m]=="sQuot"){

      j9[m]=j9[m].replace(/sQuot/,'\'');
      document.index2.button5[m].value=j9[m];

  }

  if(j9[m]=="bslash"){

      j9[m]=j9[m].replace(/bslash/,'\\');
      document.index2.button5[m].value=j9[m];
  }


  if(j10[m]=="dQuot"){

       j10[m]=j10[m].replace(/dQuot/,'\"');
       document.index2.button10[m].value=j10[m];

  }
  if(j10[m]=="sQuot"){

      j10[m]=j10[m].replace(/sQuot/,'\'');
      document.index2.button10[m].value=j10[m];

  }

  if(j10[m]=="bslash"){

      j10[m]=j10[m].replace(/bslash/,'\\');
      document.index2.button10[m].value=j10[m];
  }




document.index2.button5[m].value=j9[m];
document.index2.button10[m].value=j10[m];
}

document.index2.button6.value="Back Space";
document.index2.button7.value="Clear";
document.index2.button8.value="Caps Lock";

}


</script>

