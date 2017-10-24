<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<table class="card_holder" border="0" cellpadding="0" cellspacing="0" width="100%" style="border-spacing:0;max-width: 600px;">
	<tr>
		<td align="center">
			<div class="card_container" style="position: relative;">
	<div class="flip-container kinetic" style="text-align:center;width:100%;">
		<div class="flipper">
			<div class="relative" class="front">
			
				<c:url var="bmxLostTires" value="/img/bmx_lost_tires.jpg" />
            	<img width="100%" style="max-width:600px;" src="${bmxLostTires}" alt="BMX With Lost Tires">
            	<p class="absolute-text">Oops!!! Some Days You Should Just Stay in Bed</a> </p>
            	
			</div>
			<%-- <div class="back">
			
				<c:url var="solidCreamTexture" value="/img/cream_textured_background.jpg" />
            	<img width="100%" style="max-width:600px;" src="${solidCreamTexture}" alt="Solid Cream Color With Texture">
            	
			</div>
		</div>
		<div class="inside" style="">
		
			<c:url var="solidCreamTexture" value="/img/cream_textured_background.jpg" />
            <img width="100%" style="max-width:600px;" src="${solidCreamTexture}" alt="Solid Cream Color With Texture"> --%>
            
		</div> 
	</div>
</div>
		</td>
	</tr>
</table>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />