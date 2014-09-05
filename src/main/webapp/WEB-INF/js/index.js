function searchBooks(url){
    $("input[type='submit']").click(function(){
        var searchTitle = $("#search-book").val();
         $.ajax({
            type:"get",
            url:url+"books/" + searchTitle,
            data:{searchTitle:searchTitle},
            dataType:"json",
            success:function(data){
                var resultList = "";
                $.each(data,function(index,book){
                    resultList += "<div class='border'></div>";
                    resultList += "<dl>";
                    resultList += "<dt>Book Title</dt>";
                    resultList += "<dd>" + book.title +"</dd>";
                    resultList += "<dt>Book Author</dt>";
                    resultList += "<dd>" + book.author +"</dd>";
                    resultList += "<dt>Book Price</dt>";
                    resultList += "<dd>" + book.price +"</dd>";
                    resultList += "</dl>";
                    resultList += "<div class='border'></div>";
                   // console.log("Book Name : "+book.title+"Book Author"+book.author+"Book Price"+book.price);
                });
                $(".content").html(resultList);
            } // end success
        }); //end .ajax
    }); //end click

}
