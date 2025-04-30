$(function() {
    $("[type!='text']").focus(function() {
        $(this).css("background-color", "yellow")
    });

    $("[type!='text']").blur(function() {
        $(this).css("background-color", "")
    });
});