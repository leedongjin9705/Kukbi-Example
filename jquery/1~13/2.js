$(document).ready(function() {
$("button").click(function() {
    $('tr:odd').css("background-color", "gold");
    $('tr:even').css("background-color", "red");
})
})