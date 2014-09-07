function searchBooks(url){
    $("input[type='submit']").click(function(){
        var searchTitle = $("#search-book").val();
        console.log(url+"books/title/" + searchTitle);
         $.ajax({
            type:"get",
            url:url+"books/title/" + searchTitle,
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
    $("#add-form").submit(function(e){
        return false;
    });
}
function loadPageAdd(url){
    $.ajax({
        type:"get",
        url:url+"page/add",
        success:function(data){
            $(".formWrapper").html(data);
            triggerBookAdd(url+"books/add");
        },
        error:function(e,data){
            alert(e);
        }
    });
}
function triggerBookAdd(url){
      $("#add-submit").click(function(){
        console.log("trigger");
        var book = new Object();
        book.isbn = $("#isbn").val();
        book.title = $("#title").val();
        book.author = $("#author").val();
        book.price = $("#price").val();
        book.location = $("#location").val();

        $.ajax({
            type:"post",
            url:url,
            data:JSON.stringify(book),
            contentType:"application/json",
            success:function(data){
                $("form")[0].reset();
                alert("添加成功");
            },
            error:function(e,data){
                console.log(data);
            }

        });
        return false;
    });
}

function loadPageRemove(url){
    $.ajax({
        type:"get",
        url:url+"page/remove",
        success:function(data){
            $(".formWrapper").html(data);
            triggerBookRemove(url);
        },
        error:function(e,data){
            alert(e);
        }
    });
}
function triggerBookRemove(url){
      $("#remove-submit").click(function(){
        console.log("trigger");
        var removeISBN = $("#remove-isbn").val();

        $.ajax({
            type:"delete",
            url:url + "books/id/" + removeISBN,
            success:function(data){
                $("form")[0].reset();
                alert("移除成功");
            },
            error:function(e,data){
                console.log(data);
            }

        });
        return false;
    });
}

function loadDefaultEvent(url){
    $("li").click(function(){
        $("li").removeClass("active");
        $(this).addClass("active");
        var index = $(this).index();
        console.log(index);
        switch(index) {
            case 0:
                loadPageAdd(url);
                break;
            case 1:
                loadPageRemove(url);
                break;

        }
    });

    $("#add-form").submit(function(event){
        event.preventDefault();
    });

    $("#remove-form").submit(function(event){
            event.preventDefault();
        });
}