
function searchBooks(url){

     $("input[type='submit']").click(function(){
        var searchTitle = $("#search-book").val();
//        alert(url);
        console.log(url);
        console.log(url+"book");
        $.ajax(function(){
            type:"get",
            data:{searchTitle:searchTitle},
            url:url+"book",
            success:function(data){
//                $(".content").html(data);
                console.log("success");
            }
        });
     });
}
