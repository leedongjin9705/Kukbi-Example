$(function()  {
    $(".outer").mouseover(function() {
        console.log('mouseover event')
    });

    $(".outer").hover(function() {
        console.log('hover event')
    });
})