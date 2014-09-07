<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div>
    <form class="form-horizontal" role="form" id="remove-form">
       <div class="form-group">
          <label for="firstname" class="col-sm-2 control-label">书的编号</label>
          <div class="col-sm-10">
             <input type="text" class="form-control" id="remove-isbn"
                placeholder="请输入编号">
          </div>
       </div>

       <div class="form-group">
          <div class="col-sm-offset-2 col-sm-10">
             <button id="remove-submit" class="btn btn-default">移除</button>
          </div>
       </div>
    </form>

</div>