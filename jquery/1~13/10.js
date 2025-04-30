$(function () {
    $('#btn_fade').on('click', function(){
        $('div#a').fadeIn();
        $('div#b').fadeIn("slow");
        $('div#c').fadeIn();
    });

    $('#btn_fade_out').on('click', function() {
        $('div#a').fadeOut();
        $('div#b').fadeOut();
        $('div#c').fadeOut();
    });

    $('#btn_fade_toggle').on('click', function() {
        $('div#a').fadeToggle();
        $('div#b').fadeToggle();
        $('div#c').fadeToggle();
    });

    $('#btn_fade_toggle').on('click', function() {
        $('div#a').fadeToggle(3000, function() {
            console.log('end')
        });
    });

    $('#btn_fade_to').on('click', function() {
        $('div#a').fadeTo(4000, 0);
    });
});

