$(function() {
    // $("h1").click(function() {
    //     $(this).css("background-color", "yellow")
    // });

    // $("h1").mouseleave(function() {
    //     $(this).css("background-color", "green")
    // });

    // $("h1").mouseenter(function() {
    //     $(this).css("background-color", "red")
    // });

    $("h1").on({
        click : function(){
            $(this).css("background-color", "yellow")
        },
        mouseleave : function() {
            $(this).css("background-color", "green")
        },
        mouseenter : function() {
            $(this).css("background-color", "red")
        }
    });
});