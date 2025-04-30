$(function(){
     $('button').on('click', function(){
        $('p').hide('slow', function(){
            $('p').show();
        });
     });
});