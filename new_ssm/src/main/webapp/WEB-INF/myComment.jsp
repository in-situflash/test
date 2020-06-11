<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html style="height: auto;">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<title>我的评论</title>

		<link rel="stylesheet" href="/static/css/default/bootstrap/bootstrap.css">
		<link rel="stylesheet" href="/static/comp/fontawesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="/static/comp/ionicons/css/ionicons.min.css">
		<link rel="stylesheet" href="/static/comp/adminlte/css/adminlte.css">
		<link rel="stylesheet" href="/static/css/default/mask.css" />
	</head>

	<body style="height: auto;">
		
<%--		<br/><h1>Welcome, ${username}</h1>--%>
		
		<!--  <div class="container-fluid" id="ORG_LIST_DIV_ID">-->
		<div class="container-fluid" id="COM_LIST_DIV_ID">
	
			<div class="row">
				<div class="col-12">
					<div class="card">
						<div class="card-header" style="width:100%">
							<h3  class="card-title col-md-3" >当前：<span id="LABLE_FATHER_ORG_NAME">我的评论</span></h3>
							<div class="col-md-2 col-md-offset-7" id="comAddAndDeleteDiv"><button class="btn  btn-danger btn-sm" type="button" onclick="DELETE_COM()">删除</button></div>
						</div>
					</div>
				</div>
			</div>


			<div class="row">
				<div class="col-12">
					<div class="card">
					
						<div class="card-body">
							<div id="example3_wrapper" class="dataTables_wrapper container-fluid dt-bootstrap4"><div class="card-header" style="background-color:#17a2b8"><h3 class="card-title">我的评论</h3></div>
							
							<c:forEach items="${mycomments}" var="comment" varStatus="com_status">
							<div class="row" id="comment_${com_status.index}" value="${comment.c_id}">
							    	<div class="form-inline col-sm-12">
							    		<span id="comment_content">${comment.content}</span>
							    	</div>
							    	<div class="col-sm-12">
							    		<audio src="/postbar/audio/41e1f8b1a08642f0a1033ca6c626e0f1.mp3" controls="controls" style="height:20px"></audio>
							    	</div>
							    	<div class="col-sm-12">
							    		<div>
							    			<table>
							    				<tbody>
							    					<tr>
							    						<td id="comment_time">
															评论时间：<fmt:formatDate value="${comment.c_createtime}" pattern="yyyy-MM-dd HH:mm:ss"/> &nbsp;|&nbsp;&nbsp;&nbsp;
														</td>
														<td>
														<%-- TODO: 显示文章名称而非文章ID --%>
															<text id="comment_articleId">评论文章：${comment.a_id}</text>
															<%-- 在评论的文章详情时时，将评论div的index传给js --%>
															<a href="" onclick="post_detailed(${com_status.index}); return false;"></a> &nbsp;&nbsp;|&nbsp;&nbsp;
							    						</td>
							    						<td>
															<%-- 在点击编辑时，将评论div的index传给js --%>
							    							<a href="" onclick="EDIT_COM(${com_status.index}); return false;">评论编辑</a> ：&nbsp;&nbsp;|&nbsp;&nbsp;
							    						</td>
							    						<td>删除评论：<input name="DELETE_CHECK_NAME" type="checkbox" value="${comment.c_id}"></td>
							    					</tr>
							    				</tbody>
							    			</table>
							    		</div>
							    	</div>
							    </div>
							    <hr><hr>
							</c:forEach>

<!-- 								<div class="row"><div class="form-inline col-sm-12"><span>这是测试文章1评论</span></div><div class="col-sm-12"><audio src="/postbar/audio/41e1f8b1a08642f0a1033ca6c626e0f1.mp3" controls="controls" style="height:20px"></audio></div><div class="col-sm-12"><div><table><tbody><tr><td>评论时间：2019-03-18 20:48:55&nbsp;&nbsp;|&nbsp;&nbsp;</td><td>评论文章：<a href="" onclick="post_detailed('97a67f0d660b4532aed8a461c1b2bb21'); return false;">测试文章1</a> &nbsp;&nbsp;|&nbsp;&nbsp;</td><td><a href="" onclick="EDIT_COM('41e1f8b1a08642f0a1033ca6c626e0f1'); return false;">评论编辑</a> ：&nbsp;&nbsp;|&nbsp;&nbsp;</td><td>删除评论：<input name="DELETE_CHECK_NAME" type="checkbox" value="41e1f8b1a08642f0a1033ca6c626e0f1"></td></tr></tbody></table></div></div></div><hr><hr>
								<div class="row"><div class="form-inline col-sm-12"><span>这是测试文章15评论</span></div><div class="col-sm-12"><audio src="/postbar/audio/23ad65686e3048d4b6a7b75986c52a46.mp3" controls="controls" style="height:20px"></audio></div><div class="col-sm-12"><div><table><tbody><tr><td>评论时间：2019-03-18 20:48:37&nbsp;&nbsp;|&nbsp;&nbsp;</td><td>评论文章：<a href="" onclick="post_detailed('9b242fc9734b4208861f0124ec01ba04'); return false;">测试文章15</a> &nbsp;&nbsp;|&nbsp;&nbsp;</td><td><a href="" onclick="EDIT_COM('23ad65686e3048d4b6a7b75986c52a46'); return false;">评论编辑</a> ：&nbsp;&nbsp;|&nbsp;&nbsp;</td><td>删除评论：<input name="DELETE_CHECK_NAME" type="checkbox" value="23ad65686e3048d4b6a7b75986c52a46"></td></tr></tbody></table></div></div></div><hr><hr>
								<div class="row"><div class="form-inline col-sm-12"><span>这是测试文章4评论</span></div><div class="col-sm-12"><audio src="/postbar/audio/e6cd80ed6b054f349fe9511a37f4d1bf.mp3" controls="controls" style="height:20px"></audio></div><div class="col-sm-12"><div><table><tbody><tr><td>评论时间：2019-03-18 20:48:16&nbsp;&nbsp;|&nbsp;&nbsp;</td><td>评论文章：<a href="" onclick="post_detailed('b3412d237ee34ab78dd811e138ca3a01'); return false;">测试文章4</a> &nbsp;&nbsp;|&nbsp;&nbsp;</td><td><a href="" onclick="EDIT_COM('e6cd80ed6b054f349fe9511a37f4d1bf'); return false;">评论编辑</a> ：&nbsp;&nbsp;|&nbsp;&nbsp;</td><td>删除评论：<input name="DELETE_CHECK_NAME" type="checkbox" value="e6cd80ed6b054f349fe9511a37f4d1bf"></td></tr></tbody></table></div></div></div><hr><hr>
								<div class="row"><div class="form-inline col-sm-12"><span>这是测试文章14评论</span></div><div class="col-sm-12"><audio src="/postbar/audio/8b27fc8d11da4731bb8d689f780841f2.mp3" controls="controls" style="height:20px"></audio></div><div class="col-sm-12"><div><table><tbody><tr><td>评论时间：2019-03-18 20:48:01&nbsp;&nbsp;|&nbsp;&nbsp;</td><td>评论文章：<a href="" onclick="post_detailed('0ac14146af4e4d37ac50b2ed0835211a'); return false;">测试文章14</a> &nbsp;&nbsp;|&nbsp;&nbsp;</td><td><a href="" onclick="EDIT_COM('8b27fc8d11da4731bb8d689f780841f2'); return false;">评论编辑</a> ：&nbsp;&nbsp;|&nbsp;&nbsp;</td><td>删除评论：<input name="DELETE_CHECK_NAME" type="checkbox" value="8b27fc8d11da4731bb8d689f780841f2"></td></tr></tbody></table></div></div></div><hr><hr>
								<div class="row"><div class="form-inline col-sm-12"><span>这是测试文章2评论</span></div><div class="col-sm-12"><audio src="/postbar/audio/e20958d526a0488f99e655046ab2e364.mp3" controls="controls" style="height:20px"></audio></div><div class="col-sm-12"><div><table><tbody><tr><td>评论时间：2019-03-18 20:47:40&nbsp;&nbsp;|&nbsp;&nbsp;</td><td>评论文章：<a href="" onclick="post_detailed('0c5bad26938041459423277878dbafbe'); return false;">测试文章2</a> &nbsp;&nbsp;|&nbsp;&nbsp;</td><td><a href="" onclick="EDIT_COM('e20958d526a0488f99e655046ab2e364'); return false;">评论编辑</a> ：&nbsp;&nbsp;|&nbsp;&nbsp;</td><td>删除评论：<input name="DELETE_CHECK_NAME" type="checkbox" value="e20958d526a0488f99e655046ab2e364"></td></tr></tbody></table></div></div></div><hr><hr>
								<div class="row"><div class="form-inline col-sm-12"><span>这是测试文章8评论</span></div><div class="col-sm-12"><audio src="/postbar/audio/491165531b814e84ad78d07ad9490b99.mp3" controls="controls" style="height:20px"></audio></div><div class="col-sm-12"><div><table><tbody><tr><td>评论时间：2019-03-18 20:47:23&nbsp;&nbsp;|&nbsp;&nbsp;</td><td>评论文章：<a href="" onclick="post_detailed('45910a56e4604e30a711e77dec887221'); return false;">测试文章8</a> &nbsp;&nbsp;|&nbsp;&nbsp;</td><td><a href="" onclick="EDIT_COM('491165531b814e84ad78d07ad9490b99'); return false;">评论编辑</a> ：&nbsp;&nbsp;|&nbsp;&nbsp;</td><td>删除评论：<input name="DELETE_CHECK_NAME" type="checkbox" value="491165531b814e84ad78d07ad9490b99"></td></tr></tbody></table></div></div></div><hr><hr>
								<div class="row"><div class="form-inline col-sm-12"><span>这是测试文章6评论</span></div><div class="col-sm-12"><audio src="/postbar/audio/ba037d798434421a8f7bfca295b0240c.mp3" controls="controls" style="height:20px"></audio></div><div class="col-sm-12"><div><table><tbody><tr><td>评论时间：2019-03-18 20:46:58&nbsp;&nbsp;|&nbsp;&nbsp;</td><td>评论文章：<a href="" onclick="post_detailed('f33223429d80439e80f35c5cd1c5a01e'); return false;">测试文章6</a> &nbsp;&nbsp;|&nbsp;&nbsp;</td><td><a href="" onclick="EDIT_COM('ba037d798434421a8f7bfca295b0240c'); return false;">评论编辑</a> ：&nbsp;&nbsp;|&nbsp;&nbsp;</td><td>删除评论：<input name="DELETE_CHECK_NAME" type="checkbox" value="ba037d798434421a8f7bfca295b0240c"></td></tr></tbody></table></div></div></div><hr><hr>
 -->							</div>
						</div>
						<!-- /.card-body -->
					</div>

				</div>

			</div>
			<div class="row">
				<div class="col-sm-12 col-md-9 col-md-offset-3">
					<div class="dataTables_paginate paging_simple_numbers">
						<ul class="pagination" id="PAGE_ID"><li style="margin-left: 30px">		<button class="btn btn-primary" type="button" onclick="GOTO_POST_HOME_PAGE('0')">首页</button></li><li style="margin-left: 30px">		<button class="btn btn-primary" type="button" onclick="GOTO_POST_PREVIOUS_PAGE('0')">前一页</button></li><li style="margin-left: 30px">		<button class="btn btn-primary" type="button" onclick="GOTO_POST_NEXT_PAGE('2')">后一页</button></li><li style="margin-left: 30px">		<button class="btn btn-primary" type="button" onclick="GOTO_POST_TAIL_PAGE('2')">末页</button></li><li style="margin-left: 30px">		<input id="JUMP_INPUT_ID" type="text" style="display:inline;width:80px" size="6">		<button class="btn btn-sm btn-outline-primary" onclick="GOTO_POST_PAGE();return false;">跳转</button></li><li style="margin-left: 30px">		<div class="dataTables_info" style="margin-top: 6px;margin-left: 100px"><span>2/3 页</span> <span>共15条</span></div></li></ul>
					</div>
				</div>
			</div>
		</div>
		
		
		
		<!--<div id="ORG_ADD_DIV_ID" class="card card-info" style="display:none">  -->
		<div id="COM_ADD_DIV_ID" class="card card-info" style="display:none">
	    	<div class="card-header">
	             <h3 class="card-title">评论编辑</h3>
	        </div> 
	        <div class="form-horizontal">
	        							
	             <div class="card-body">
		
			            
			            <div class="form-group" >
			                 <label for="JI_JOB_NAME" class="col-sm-2 control-label">评论：</label>
			              	 <div class="col-sm-10" >
			                 	<textarea  name="POST_ADD_DES" id="COM_ADD_DES" class="form-control" style="height:100px;"> </textarea>
			                 </div>
			            </div>
			             <!-- /.card-body -->
	             <div id="editButtion" class="card-footer col-md-3 col-md-offset-4" style="width:100%"align="center">
	               
	             </div>
	             <div class="card-footer col-md-3 col-md-offset-4" id="tishi" style="text-align: center;color: red;font-size: 15px">
									     
						</div>
	             <!-- /.card-footer -->
	             </div>
	            
	        </div>
	    </div>
		
		
		
		
		
		<script src="/static/comp/jquery/dist/jquery.js"></script>
		<script src="/static/comp/jQuery-Storage-API/jquery.storageapi.js"></script>
		<script src="/static/comp/jquery.form/jquery.form.min.js"></script>
		<script src="/static/comp/jquery/plugins/scrollbar/perfect-scrollbar.jquery.min.js"></script>
		
		<script src="/static/kindeditor/kindeditor-all.js" type="text/javascript"></script>
		<script src="/static/kindeditor/kindeditor-all-min.js" type="text/javascript"></script>
		<script src="/static/kindeditor/lang/zh-CN.js" type="text/javascript"></script>
		<script src="/static/js/common/mask.js"></script>
		<script src="/chinasofti/myComment/js/myComment.js"></script>
		<script type="text/javascript" src="/static/js/alert.js"></script>
		
		<!--  
		<script src="/stmadc/stma/dc/include/js/jcommon.js"></script>
		
		<script language="JavaScript" src="/stmadc/jquery/jquery-ui-1.8.20.min.js"></script>
		<script src="/stmadc/static/comp/bootstrap/dist/js/bootstrap.js"></script>
		<script src="/stmadc/static/comp/adminlte/js/adminlte.min.js"></script>
		<script language="JavaScript" src="/stmadc/stma/dc/include/js/jcommon.js"></script>
	-->


</body></html>