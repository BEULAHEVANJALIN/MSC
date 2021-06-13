<%@ Page Language="C#" %>

<!DOCTYPE html>

<script runat="server">
    protected void Button_Click(object sender, System.EventArgs e)
    {
        Label1.Text = "Hello";
    }
</script>

<style>
      div.center {
	    height: 10em;
	    margin: 0;
	    position: absolute;
	    top: 50%;
	    left: 50%;
	    margin-right: -50%;
	    transform: translate(-50%, -50%) }
</style>

<html xmlns="http://www.w3.org/1999/xhtml">
	<head runat="server">
	</head>
	<body>

	    <form id="form1" runat="server">
		    <div class=center>
<br/></br></br>
			<asp:Label ID="Label1" runat="server"/>
		       
			<asp:Button ID="Button1" runat="server" Text="HI" OnClick="Button_Click"/>
		    </div>
	    </form>
	</body>
</html>