$(function(){
    $('#btn_set').on('click', function(){
       $('#google').attr('href', function(i, origValue) {
        return origValue + '/ㄴㅇㄹㄴㅇㄹㄴㅇ';
       });
    });
});