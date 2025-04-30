$(function() {
    $('.btn_start').on('click', function(){
        $('.ani_box1').animate({width:'300px'}, 3000);
        $('.ani_box1').animate({height:'300px'}, 3000);
        // $('.ani_box2').slideUp(1000);
        // $('.ani_box2').slideDown(1000);
        $('.ani_box2').hide(3000);
        $('.ani_box2').show(3000);
    });
    $('.btn_stop').on('click', function(){
        $('.ani_box1').stop(false, true);
        $('.ani_box2').stop(true, false);
        $('.ani_box2').stop();
    });
});