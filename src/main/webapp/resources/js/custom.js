//Global Variable
var resizeId;

//DOM Ready
$(document).ready(function () {

	setImageRatio('.wrap-aspect-ratio');
	
});

//WINDOW Load
$(window).load(function() {
	
	
});

//WINDOW Resize
$(window).resize(function() {
	
    clearTimeout(resizeId);
    resizeId = setTimeout(function() {
    	
    	setImageRatio('.wrap-aspect-ratio'); 
    		
    }, 300);
    
    console.log(resizeId);
	
});

var setImageRatio = function(img_selector){
	
	$(img_selector).each(function() {  
		var width = $(this).width();   // Current image width
		var ratio = $(this).data('ratio'); // aspect ratio
		var height = width * ratio;  // Reset height to match scaled image

		$(this).css("height", height); 
		console.log('height = '+height+' Ratio = '+ratio);
		
	});
	
}


 
