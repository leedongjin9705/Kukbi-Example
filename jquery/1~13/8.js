$(function() {
    // $(".outer").click(function() {
    //     $(this).css("background-color", "red");
    // })

    // $('.outer').on('click', function() {
    //     $(this).css("background-color", "red");
    // });

    // $('[type=text]').focus(function() {
    //     $(this).css("background-color", "red");
    // });

    // $('[type=text]').blur(function() {
    //     $(this).css("background-color", "white");
    // });

    // $('[type=text').on('focus', function(){
    //     $(this).css("background-color", "red");
    // });

    // $('[type=text').on('blur', function(){
    //     $(this).css("background-color", "white");
    // });

    $('[type=text').on({
        focus : function() {
            $(this).css("background-color", "red");
        },
        blur : function() {
            $(this).css("background-color", "white");
    }
    });
});