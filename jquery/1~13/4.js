$(function(){
    $('.outer').mouseover(function() {
        console.log('마우스 오버 이벤트 발생');
    });

    $('.outer').mouseenter(function() {
        console.log('마우스 엔터 이벤트 발생');
    });

    $('.inner').mouseover(function() {
        console.log('inner 마우스 오버 이벤트 발생');
    });

    $('.inner').mouseenter(function() {
        console.log('inner 마우스 엔터 이벤트 발생');
    });
});