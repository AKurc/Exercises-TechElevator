/// <reference path="../jquery-3.1.1.js" />

$(document).ready(function () {

	$("#SameShipping").on('change',function(){
	//console.log($("#BillingAddress1").val());
	if(this.checked == true){
		$("#ShippingAddress1").val($("#BillingAddress1").val());
		$("#ShippingAddress2").val($("#BillingAddress2").val());
		$("#ShippingCity").val($("#BillingCity").val());
		$("#ShippingState").val($("#BillingState").val());
		$("#ShippingCity").val($("#BillingCity").val());
		$("#ShippingPostalCode").val($("#BillingPostalCode").val()); //.val for input
		}
	else{
		$("#ShippingAddress1").val("");
		$("#ShippingAddress2").val("");
		$("#ShippingCity").val("");
		$("#ShippingState").val("");
		$("#ShippingPostalCode").val("");
		}
	});

	$("input[name='ShippingType']").on('change',function(event){
		var checkBox = $(this); //grab this object
		var checkShipping = checkBox.attr('data-cost'); //get attribute('data-cost')of this object
	$('#shipping > .price').text('$'+ checkShipping); //.text for content

	
	var subttl = $('#subtotal > .price').text().substring(1);
	$('#grandtotal > .price').text('$' + (parseFloat(checkShipping) + parseFloat(subttl)).toFixed(2));
	});
	
	//grandTotal function
	function grandTotal(){
	    var subtotal = $('#subtotal span').text();
	    subtotal = parseFloat(subtotal.substring(1, subtotal.length));
	    
	    var tax = $('#tax span').text();
	    tax = parseFloat(tax.substring(1, tax.length));
	    
	    var shipping = $('#shipping span').text();
	    shipping = parseFloat(shipping.substring(1, shipping.length));
	    
	    var grandTotal = subtotal + tax + shipping;
	    $('#order-summary #grandtotal span').text('$' + grandTotal).toFixed('2');
	    
	}

});