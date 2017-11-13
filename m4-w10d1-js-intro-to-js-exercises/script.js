//1. Write a function that finds box1 
//      and adds the class "grow"
function growBox1() { 
	$("#box1").addClass("grow");
}

//2. Write a function that finds and
$('.blue').on('dblclick', function (){
	$(this).addClass('shrink');
});
//3. Remove all of the elements inside of a div on the page
function nukeIt(){
	$('div').empty();
//	('div.green') or ('#box4') makes it more specific
}

var divs;
//4. Detach(( all of the divs on the page
function detachAll(){
	divs = $('section.content > div').detach(); //> is any ancestors/children under content
	//or can say ('section.content div.box')
}
//5. Reattach the divs on the page
function putItBack(){
	$('section.content').append(divs);
}
//6. Change the text for all of the <p> tags inside boxes
//      to say a message
function sayMessage(message){
	$('.box p').text(message);
	//to select an id, #box, using .box is selecting any element that has a class of box
	//use text by default, not html
}

//7. Change the li to have <b>List Item</b> as their text
function updateLi(){
	$('li').text('<b>List Item</b>');
	// to do what is wanted, not stated by this question: $('li').html('<b>List Item</b>');
}
//8. Add the .shadow class to the last box
function shadowLastBox(){
	$('.box:last').addClass('shadow');
	//:last is something JQuery added so you could select last one of class- also a first
	//can also do :last-child (for css)
	//can do :nth-last-child(2) for send to last
	//or ('.box').last()
}
//9. Toggle the .shadow class on any box passed in
function toggleShadow(selector){
	$(selector).toggleClass('shadow');
	//toggleShadow('#box2'); in console, then enter it again and it goes away 
}
//10. Make any input textbox have the .yellow class
//      to give it a yellow background
function addYellow(){
$('input[type=text]').addClass('yellow');
	//going to use an attribute selector b/c the hrml used a .text
}

//11. Change the value of the textbox to "Hello World"
function changeValue(){
	$('input[type=text]').val('Hello World');
	//.val sets the value on a textbox
}
//12. Now go back and allow a message to be passed in

//he set message in the one above and then this worked...
function changeValue(message){
	$('input[type=text]').val(message);
}

//13. Append a new list item
function newItem(){
	$('#box3 ul').append('<li>Line Item</li>');
	//or .prepend if we want it at the top (or after, before, etc)
	//with prepend and append, it's ALWAYS HTML, that's why you don't need to declare it as .html
	//calling ul and prepend/append whatever's inside of it

	//select element then save into variable- give me all children, and add a new box, then append to ul item
	//var ul = $('#box3 ul')
	//var number = ul.children().length + 1;
	//ul.append('<li>Line ' + number + '</li>');
}
//14. Add a new checkbox and textbox
//      - make sure to change the id
function addNewField(){
	var newId = $('#box6 div').length + 1; 
	var template = $('<div>' +
		'<input data-id="'+newId+'" type="checkbox"> '+
		'<input data-id="'+newId+'" type="text" class="yellow">'+
		'<label data-id="'+newId+'" style="display: none;"></label> '+
	'</div>');
	$('#box6').append(template);
	//var new Id is to select all the divs in box 6- replacing the id=1 
	//var template, making a new element, is so it will add a new id number to each child
	//R click on div w/in box 6 and selected all outside HTML
}
//15. Now make it possible to switch a textbox to a label
function makeLabel(taskId){
	var inputBox = $('input[type=text][data-id=' + taskId + ']');
	var label = $('label[data-id='+ taskId + ']');
	label.text(inputBox.val());

	label.show(); 
	inputBox.hide();
}
//selector is using 2 dif attributes to make it more specific
	//show label and hide input box, after setting label text to value of input box
	//then in console makeLable(3) pick the box, enter new text, then it takes away box and leaves whatever you literally 
	//wrote in the box
//16. Make all the boxes fade out
