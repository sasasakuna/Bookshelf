<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div>
    <form class="form-horizontal" role="form" >
       <div class="form-group">
          <label for="firstname" class="col-sm-2 control-label">书的编号</label>
          <div class="col-sm-10">
             <input type="text" class="form-control" id="firstname"
                placeholder="请输入编号">
          </div>
       </div>
       <div class="form-group">
          <label for="lastname" class="col-sm-2 control-label">书的标题</label>
          <div class="col-sm-10">
             <input type="text" class="form-control" id="lastname"
                placeholder="请输入标题">
          </div>
       </div>
       <div class="form-group">
           <label for="lastname" class="col-sm-2 control-label">书的作者</label>
           <div class="col-sm-10">
               <input type="text" class="form-control" id="lastname"
                                   placeholder="请输入作者">
           </div>
        </div>
       <div class="form-group">
             <label for="lastname" class="col-sm-2 control-label">书的价格</label>
             <div class="col-sm-10">
                <input type="text" class="form-control" id="lastname"
                   placeholder="请输入价格">
             </div>
          </div>
       <div class="form-group">
             <label for="lastname" class="col-sm-2 control-label">书的位置</label>
             <div class="col-sm-10">
                <input type="text" class="form-control" id="lastname"
                   placeholder="请输入位置">
             </div>
          </div>
       <div class="form-group">
          <div class="col-sm-offset-2 col-sm-10">
             <button type="submit" class="btn btn-default">添加</button>
          </div>
       </div>
    </form>

</div>