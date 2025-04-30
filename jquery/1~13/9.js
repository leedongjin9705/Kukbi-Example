$(function() {
    $('img').on('click', function() {
        $(this).hide(300, function() {
            //alert('이미지가 사라졌습니다')
            $(this).show('slow', function(){
                $(this).hide('fast');
            });
        });
    });

    $('#btn_show').on('click', function(){
        $('img').show(300);
    })
});